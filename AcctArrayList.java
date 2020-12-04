import java.util.ArrayList;

public class AcctArrayList implements IAcctDataStructure {

    private ArrayList<Account> accounts;

    public Account findByNumber(int forAcctNum) {
        for (Account acct : accounts) {
            if (acct.checkNumber(forAcctNum))
                return acct;
        }
        return null;
    }
}
