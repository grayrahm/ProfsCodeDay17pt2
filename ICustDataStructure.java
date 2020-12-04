public interface ICustDataStructure {

    public Customer findCustomer(String custname, int withPwd) throws LoginFailedException, CustomerNotFoundException ;
}
