package UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	static Scanner input = new Scanner (System.in);
	//Variables
	static String firstName;
	static String lastName;
	static String email;
	static String phoneNumber;
	
	//Regex patterns
	static String FIRST_NAME = "^[A-Z]{1}[a-z]{2,}$";
	static String LAST_NAME = "^[A-Z]{1}[a-z]{2,}$";
	static String EMAIL = "^[[a-z]]{1,}([._+-][0-9]{1,})*[0-9]{0,}@([0-9]|[[a-z]]){1,}[.][[a-z]]{2,4}([.][[a-z]]{2,4}){0,1}$";
	static String PHONE_NUMBER = "^(91){0,1}[7-9][0-9]{9}$";
	public static void main(String[] args) 
	{
		System.out.println("Welcome to user registration program");
		
		System.out.println("Enter first name");
		firstName = input.next();
		System.out.println("Enter last name");
		lastName = input .next();
		System.out.println("Enter email");
		email = input.next();
		System.out.println("Enter mobile number");
		phoneNumber = input.next();
		
		matchFirstName();
		matchLastName();
		matchEmail();
		matchPhoneNumber();
		
	}

	//To verify phone number
	private static void matchPhoneNumber() 
	{
		Pattern p = Pattern.compile(PHONE_NUMBER);
		Matcher m = p.matcher(phoneNumber);
		
		if (m.find())
			System.out.println("Phone number is correct");
		else
			System.out.println("Phone number is incorrect");
	}

	//To verify email
	private static void matchEmail() 
	{
		Pattern p = Pattern.compile(EMAIL);
		Matcher m = p.matcher(email);
		
		if (m.find())
			System.out.println("Email is correct.");
		else
			System.out.println("Email is incorrect.");
	}

	//To verify last name
	private static void matchLastName() 
	{
		Pattern p = Pattern.compile(LAST_NAME);
		Matcher m = p.matcher(lastName);
		
		if (m.find())
			System.out.println("Last name is correct.");
		else
			System.out.println("Last name is incorrect.");
	}

	//To verify first name
	private static void matchFirstName() 
	{
		Pattern p = Pattern.compile(FIRST_NAME);
		Matcher m = p.matcher(firstName);
		
		if (m.find())
			System.out.println("First name is correct.");
		else
			System.out.println("First name is incorrect.");
	}

}