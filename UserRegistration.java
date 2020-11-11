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
	static String password;
	
	//Regex patterns
	static String FIRST_NAME = "^[A-Z]{1}[a-z]{2,}$";
	static String LAST_NAME = "^[A-Z]{1}[a-z]{2,}$";
	static String EMAIL = "^[[a-z]]{1,}([._+-][0-9]{1,})*[0-9]{0,}@([0-9]|[[a-z]]){1,}[.][[a-z]]{2,4}([.][[a-z]]{2,4}){0,1}$";
	static String PHONE_NUMBER = "^(91){0,1}[7-9][0-9]{9}$";
	static String PASSWORD = "^[0-9a-zA-Z]{8}$";
	static String PASSWORD_2 = "[A-Z]{1,}";
	static String PASSWORD_3 = "[0-9]{1,}";
	
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
		System.out.println("Enter password");
		password = input.next();
		
		matchFirstName();
		matchLastName();
		matchEmail();
		matchPhoneNumber();
		matchPassword();
		
	}

	//To verify password
	private static void matchPassword() 
	{
		Pattern p = Pattern.compile(PASSWORD);
		Pattern p2 = Pattern.compile(PASSWORD_2);
		Pattern p3 = Pattern.compile(PASSWORD_3);

		
		Matcher m = p.matcher(password);
		Matcher m2 = p2.matcher(password);
		Matcher m3 = p3.matcher(password);
		
		if (m.find() && m2.find() && m3.find())
			System.out.println("Password is valid");
		else
			System.out.println("Password is invalid");
	}

	//To verify phone number
	private static void matchPhoneNumber() 
	{
		Pattern p = Pattern.compile(PHONE_NUMBER);
		Matcher m = p.matcher(phoneNumber);
		
		if (m.find())
			System.out.println("Phone number is valid");
		else
			System.out.println("Phone number is invalid");
	}

	//To verify email
	private static void matchEmail() 
	{
		Pattern p = Pattern.compile(EMAIL);
		Matcher m = p.matcher(email);
		
		if (m.find())
			System.out.println("Email is valid.");
		else
			System.out.println("Email is invalid.");
	}

	//To verify last name
	private static void matchLastName() 
	{
		Pattern p = Pattern.compile(LAST_NAME);
		Matcher m = p.matcher(lastName);
		
		if (m.find())
			System.out.println("Last name is valid.");
		else
			System.out.println("Last name is invalid.");
	}

	//To verify first name
	private static void matchFirstName() 
	{
		Pattern p = Pattern.compile(FIRST_NAME);
		Matcher m = p.matcher(firstName);
		
		if (m.find())
			System.out.println("First name is valid.");
		else
			System.out.println("First name is invalid.");
	}

}