import java.util.LinkedList;

class Customer {
    private String name;
    private int password;
    private LinkedList<Account> accounts;

    public boolean checkName(String name) {
        return this.name == name;
    }

    public boolean checkPassword(int pwd) {
        return this.password == pwd;
    }
}

class Account {
    private int number;
    private Customer owner;
    private double balance;

    public boolean checkNumber(int acctNum) {
        return this.number == acctNum;
    }

    //Getter
    public double getBalance() {
        return this.balance;
    }

    public void withdraw(double amt) {
        this.balance = this.balance - amt;
    }
}

class CheckingAccount extends Account {

    //Overriding
    public boolean checkNumber(int acctNum) {
        return super.checkNumber(acctNum);
    }
}

class BankingService {
    private IAcctDataStructure accounts;
    private ICustDataStructure customers;

    double getBalance(int forAcctNum) {

       Account acct;
       try {
           acct = accounts.findByNumber(forAcctNum);
       }
       catch(Exception e) {
           return 0;
       }
       return acct.getBalance();

    }

    double withdraw(int forAcctNum, double amt) {
        Account acct = accounts.findByNumber(forAcctNum);
        if (!acct.equals(null)) {
            acct.withdraw(amt);
            return amt;
        }
        return 0;
    }

    String login(String custname, int withPwd) throws CustomerNotFoundException, LoginFailedException{
        Customer cust = customers.findCustomer(custname, withPwd);
        if (!cust.equals(null)) {
            return "Welcome!";
        }
        return "Oops -- don't know this customer";
    }

}