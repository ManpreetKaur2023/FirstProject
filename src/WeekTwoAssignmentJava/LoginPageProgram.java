package WeekTwoAssignmentJava;
import java.util.Scanner;
public class LoginPageProgram {
	
	String actualUserId="pivotAdmin";
	String enteredUserId;
	String  actualPassword="Admin123";
	String enteredPassword;
	
	int counter;
	
	Scanner sc =new Scanner(System.in);
	
	void checkPinIsCorrectUsingScanner() {
		
		for( counter=1 ; counter<=3;counter++)
		{
			System.out.println("Enter the Use Id");
			enteredUserId=sc.nextLine();
			System.out.println("Enter password");
			enteredPassword=sc.nextLine();
			if(actualUserId.equals(enteredUserId)  && actualPassword.equals(enteredPassword))
			{
			    System.out.println("You are logged into the application.");
			   
			break;
			}
			
			else
			{
				System.out.println("Incorrect user Id or Password.Try again.");
			
			}
			
		}
		 if(counter==4) {
				System.out.println("Account Locked...");
					
			}
	}
}

