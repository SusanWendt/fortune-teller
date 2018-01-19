import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		// [ ] Ask the user for the user’s first name.
		// [ ] Ask the user for the user’s last name.
		// [ ] Ask the user for the user’s age.
		// [ ] Ask the user for the user’s birth month (as an ‘int’).
		// [ ] Ask the user for the user’s favorite ROYGBIV color.
		// [ ] If the user does not know what ROYGBIV is, 
		// ask the user to enter “Help” to get a list of the ROYGBIV colors.
		// [ ] Ask the user for the user’s number of siblings.
		Scanner input = new Scanner(System.in);
				
		System.out.println("What is your first name?");
		String firstName = input.nextLine().trim();
		
		System.out.println("What is your last name?");
		String lastName = input.nextLine().trim();
		
		System.out.println("What is your age?");
		int age = input.nextInt();
		
		System.out.println("What is the month of your birthday (in number format?)");
		int birthMonth = input.nextInt();
		
		System.out.println("What is your favorite ROYGBIV color? (If you do not know what ROYGBIV is, please type \"HELP\".");
		System.out.println("How many siblings do you have?");

	}

}
