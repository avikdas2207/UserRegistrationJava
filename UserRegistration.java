package UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	static Scanner input = new Scanner (System.in);
	//Variables
	static String firstName;
	static String lastName;
	
	//Regex patterns
	static String FIRST_NAME = "[A-Z]{1}[a-z]{3,}";
	static String LAST_NAME = "[A-Z]{1}[a-z]{3,}";
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome to user registration program");
		
		System.out.println("Enter first name");
		firstName = input.next();
		System.out.println("Enter last name");
		lastName = input .next();
		
		matchFirstName();
		matchLastName();
		input.close();
		
	}

	private static void matchLastName() 
	{
		Pattern p = Pattern.compile(LAST_NAME);
		Matcher m = p.matcher(lastName);
		
		if (m.find())
			System.out.println("Last name is correct.");
		else
			System.out.println("Last name is incorrect.");
	}

	private static void matchFirstName() 
	{
		Pattern p = Pattern.compile(FIRST_NAME);
		Matcher m = p.matcher(firstName);
		
		if (m.find())
			System.out.println("First name is Correct.");
		else
			System.out.println("First name is incorrect.");
	}

}