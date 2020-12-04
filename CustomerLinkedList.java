import java.util.LinkedList;

public class CustomerLinkedList implements ICustDataStructure {

    private LinkedList<Customer> customers;

    public Customer findCustomer(String custname, int withPwd)
            throws LoginFailedException, CustomerNotFoundException {
        for (Customer cust:customers) {
            if (cust.checkName(custname)) {
                if (cust.checkPassword(withPwd))
                    return cust;
                else
                    throw new LoginFailedException("Customer found, but login failed.");
            }}
        throw new CustomerNotFoundException("Customer Not Found!");
    }
}
