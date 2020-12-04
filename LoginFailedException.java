public class LoginFailedException extends Exception {

    private String msg;

    public LoginFailedException(String msg) {
        this.msg = msg;
    }

    public String getLoginMessage() {
        return msg;
    }

}
