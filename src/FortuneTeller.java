import java.util.Scanner;
public class FortuneTeller {
	public static void main(String[] args) {
		// USER INPUT
		// [X] Ask the user for the user’s first name.
		// [X] Ask the user for the user’s last name.
		// [X] Ask the user for the user’s age.
		// [X] Ask the user for the user’s birth month (as an ‘int’).
		// [X] Ask the user for the user’s favorite ROYGBIV color.
		// [X] If the user does not know what ROYGBIV is, ask the user to enter “Help” to get a list of the ROYGBIV colors.
		// [X] Ask the user for the user’s number of siblings.
		Scanner input = new Scanner(System.in);
				
		System.out.println("What is your first name?");
		String firstName = input.nextLine().trim();
		
		System.out.println("What is your last name?");
		String lastName = input.nextLine().trim();
		
		System.out.println("What is your age?");
		int age = input.nextInt();
		
		System.out.println("What is the month of your birthday (in number format?)");
		int birthMonth = input.nextInt();
		
		System.out.println("What is your favorite ROYGBIV color? (If you do not know what ROYGBIV is, please type \"HELP\").");
		String color = input.next();
		if(color.toLowerCase().equals("help")){
			System.out.println("ROYGBIV Stands for Red, Orange, Yellow, Green, Blue, Indigo, and Violet.");
			System.out.println("Please enter color from above list: ");
			color = input.next();
		} else {
		input.nextLine();}
		
		System.out.println("How many siblings do you have (in digit format)?");
		int siblingsNumber = input.nextInt();
		
		// The user’s number of years until retirement will be based on whether the user’s age is odd or even.
		// If age is odd number, years until retirement is one decade,. If even, years until is two decades.
		String retirement = null;
	
		if (age%2 == 0 ) {
			retirement = "two decades";
		} else {
			retirement = "one decade";
		}
		
		// The location of the user’s vacation home will be based on how many siblings the user has. 
		// If the user enters a number less than zero, give the user a bad location!
		String vacation = null;
		
		if (siblingsNumber < 0) {
			vacation = "Anarctica";
		} if (siblingsNumber == 0) {
			vacation = "Ohio";
		} if (siblingsNumber == 1) {
			vacation = "North Carolina";
		} if (siblingsNumber == 2) {
			vacation = "California";
		} if (siblingsNumber == 3) {
			vacation = "Mexico";
		} if (siblingsNumber > 3) {
			vacation = "Austraila";
		}
		
		// The user’s mode of transportation will determined by the user’s favorite color.
		String transport = null;
		
		if(color.equalsIgnoreCase("red")) {
			transport = "Toyota";
		}
		if(color.equalsIgnoreCase("Orange")) {
			transport = "Jeep";
				}
		if(color.equalsIgnoreCase("Yellow")) {
			transport = "Roller Blades";
		}
		if(color.equalsIgnoreCase("Green")) {
			transport = "Bus";
		}
		if(color.equalsIgnoreCase("Blue")) {
			transport = "Metro";
		}
		if(color.equalsIgnoreCase("Indigo")) {
			transport = "Private Jet";
		}		
		if(color.equalsIgnoreCase("Indigo")) {
			transport = "Bicycle";
		}
		
		// The user’s bank balance at retirement will be based on the user’s birth month. 
		// If the user enters something other than 1-12 for birth month, the user’s balance will be $0.00.
		// conditions: 1-4, 5-8, 9-12, anything else = $0.00
		String bank = null;
		
		if(birthMonth >= 1 && birthMonth <= 4) {
			bank = "$1,000.00";
		} else if(birthMonth >= 5 && birthMonth <= 8) {
			bank = "$10,000.00";
		} else if(birthMonth >= 9 && birthMonth <= 12) {
			bank = "$100,000.00";
		} else {
			bank = "$0.00";
		}
		
		// FINAL RESPONSE: *[First Name]* *[Last Name]* will retire in *[# of years]* with *[bank balance]* in the bank,
		// a vacation home in *[location]*, and travel by *[mode of transporation]*.
		System.out.println(firstName + " " + lastName + " will retire in " + retirement + " with " + bank + " in the bank," + " a vacation home in " + vacation + ", and travel by " + transport + ".");

		// STRETCH: Give the user the ability to quit the program by typing “Quit” (should not be case sensitive) 
		// at any point where the program is looking for user input. 
		// The program should print “Nobody likes a quitter…” before ending.
	}
}
