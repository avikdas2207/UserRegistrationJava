package UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.runners.Parameterized.Parameters;

public class UserRegistration {
	
	static Scanner input = new Scanner (System.in).useDelimiter("\n");
	
	//Variables
	String firstName;
	String lastName;
	String email;
	String phoneNumber;
	String password;
	
	//Regex patterns
	static String FIRST_NAME = "^[A-Z]{1}[a-z]{2,}$";
	static String LAST_NAME = "^[A-Z]{1}[a-z]{2,}$";
	static String EMAIL = "^[[a-z]]{1,}([._+-][0-9]{1,})*[0-9]{0,}@([0-9]|[[a-z]]){1,}[.][[a-z]]{2,4}([.][[a-z]]{2,4}){0,1}$";
	static String PHONE_NUMBER = "^(91 ){0,1}[7-9][0-9]{9}$";
	static String PASSWORD = "^.{8}$";
	static String PASSWORD_2 = "[A-Z]{1,}";
	static String PASSWORD_3 = "[0-9]{1,}";
	static String PASSWORD_4 = "[^A-Za-z0-9]{1}";
	static String PASSWORD_5 = "[^A-Za-z0-9]{2,}";
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome to user registration program");
		
		UserRegistration register = new UserRegistration();

		System.out.println("Enter first name");
		register.firstName = input.next();
		System.out.println("Enter last name");
		register.lastName = input .next();
		System.out.println("Enter email");
		register.email = input.next();
		System.out.println("Enter mobile number");
		register.phoneNumber = input.next();
		System.out.println("Enter password");
		register.password = input.next();
				
		register.matchFirstName(register.firstName);
		register.matchLastName(register.lastName);
		register.matchEmail(register.email);
		register.matchPhoneNumber(register.phoneNumber);
		register.matchPassword(register.password);
		
	}

	//To verify password
	boolean matchPassword(String password) 
	{
		Pattern p = Pattern.compile(PASSWORD);
		Pattern p2 = Pattern.compile(PASSWORD_2);
		Pattern p3 = Pattern.compile(PASSWORD_3);
		Pattern p4 = Pattern.compile(PASSWORD_4);
		Pattern p5 = Pattern.compile(PASSWORD_5);
		
		Matcher m = p.matcher(password);
		Matcher m2 = p2.matcher(password);
		Matcher m3 = p3.matcher(password);
		Matcher m4 = p4.matcher(password);
		Matcher m5 = p5.matcher(password);

		
		if (m.find() && m2.find() && m3.find() && m4.find() && !m5.find())
			return true;
		else
			return false;
	}

	//To verify phone number
	boolean matchPhoneNumber(String phoneNumber) 
	{
		Pattern p = Pattern.compile(PHONE_NUMBER);
		Matcher m = p.matcher(phoneNumber);
		
		return m.find();
	}

	//To verify email
	boolean matchEmail(String email) 
	{
		Pattern p = Pattern.compile(EMAIL);
		Matcher m = p.matcher(email);
		
		return m.find();
	}

	//To verify last name
	boolean matchLastName(String lastName) 
	{
		Pattern p = Pattern.compile(LAST_NAME);
		Matcher m = p.matcher(lastName);
		
		return m.find();
	}

	//To verify first name
	boolean matchFirstName(String firstName) 
	{
		Pattern p = Pattern.compile(FIRST_NAME);
		Matcher m = p.matcher(firstName);
		
		return m.find();
	}

}