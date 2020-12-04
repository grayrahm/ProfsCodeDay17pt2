import java.util.Scanner;

class BankingConsole {
  private Scanner keyboard = new Scanner(System.in);
    private BankingService forService;
  
    public BankingConsole(BankingService forService){
      this.forService = forService;
    }

  public void loginScreen() {

    	try {
			forService.getBalance(123);
		}
    	catch (NullPointerException e) {
    		//do something here
		}

	    System.out.println("Welcome to the Bank.  Please log in.");
	    System.out.print("Enter your username: ");
	    String username = keyboard.next();
	    System.out.print("Enter your password: ");
	    int password = keyboard.nextInt();
	    try {
	    	forService.login(username, password);
	    }
	    catch (CustomerNotFoundException e) {
	    	System.out.println(e.getCustomerMessage());
	    	this.loginScreen();
	    }
	    catch (LoginFailedException e) {
	    	System.out.println(e.getLoginMessage());
	    	this.loginScreen();
	    }


	    System.out.println("Welcome " + username);

  }  
}