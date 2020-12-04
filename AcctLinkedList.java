import java.util.LinkedList;

public class AcctLinkedList implements IAcctDataStructure {

    private LinkedList<Account> accounts;

    public Account findByNumber(int forAcctNum) throws NullPointerException {
        for (Account acct : accounts) {
            if (acct.checkNumber(forAcctNum))
                return acct;
        }
        throw new NullPointerException();
    }
}
