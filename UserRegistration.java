package UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	static Scanner input = new Scanner (System.in);
	static String firstName;
	
	//Regex patterns
	static String FIRST_NAME = "[A-Z]{1}[a-z]{3,}";
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome to user registration program \nEnter first name");
		
		firstName = input.next();
		matchFirstName();
		input.close();
		
	}

	private static void matchFirstName() 
	{
		Pattern p = Pattern.compile(FIRST_NAME);
		Matcher m = p.matcher(firstName);
		
		if (m.find())
			System.out.println("Correct");
		else
			System.out.println("incorrect");
	}

}