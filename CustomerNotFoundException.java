public class CustomerNotFoundException extends Exception {

    private String msg;

    public CustomerNotFoundException(String msg) {
        this.msg = msg;
    }

    public String getCustomerMessage() {
        return msg;
    }
}
