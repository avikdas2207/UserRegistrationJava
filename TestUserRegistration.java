package UserRegistration;



import org.junit.Test;
import org.junit.Assert;




public class TestUserRegistration {
	
	static UserRegistration registartion  = new UserRegistration();
	
	//FirstName test cases_______________________________________________________________________
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() 
	{
		boolean result = registartion.matchFirstName("Avik");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenFirstName_WhenImproper_ShouldReturnFalse()
	{
		boolean result = registartion.matchFirstName("avik");
		Assert.assertEquals(false, result);
	}

	
	//LastName test cases_______________________________________________________________________
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue()
	{
		boolean result = registartion.matchLastName("Das");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenLastName_WhenImporper_ShouldReturnFalse()
	{
		boolean result = registartion.matchLastName("das");
		Assert.assertEquals(false, result);
	}
	
	
	//Password test cases_______________________________________________________________________
	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue()
	{
		boolean result = registartion.matchPassword("Abcd123$");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenPassword_WhenNoCapitalChar_ShouldReturnFalse()
	{
		boolean result = registartion.matchPassword("abcd123$");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenPassword_WhenNoSpecialChar_ShouldReturnFalse()
	{
		boolean result = registartion.matchPassword("Abcd1234");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenPassword_WhenNoNumberinPassword_ShouldReturnFalse()
	{
		boolean result = registartion.matchPassword("Abcdefgh");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenPassword_WhenMoreThanOneScpecialChar_ShouldReturnFalse()
	{
		boolean result = registartion.matchPassword("Abcd12#$");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenPassword_WhenPasswordLengthShortThan8_ShouldReturnFalse()
	{
		boolean result = registartion.matchPassword("Abd12#$");
		Assert.assertEquals(false, result);
	}
	
	
	//PhoneNumber test cases_______________________________________________________________________
	@Test
	public void givenPhoneNumber_WhenProper_ShouldReturnTrue()
	{
		boolean result = registartion.matchPhoneNumber("91 8249167495");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenPhoneNumber_WhenWithoutCountryCode_ShouldReturnTrue()
	{
		boolean result = registartion.matchPhoneNumber("8249167495");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenPhoneNumber_WhenNoSpaceAfterCountryCode_ShouldReturnFalse()
	{
		boolean result = registartion.matchPhoneNumber("918249167495");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenPhoneNumber_WhenImproper_ShouldReturnFalse()
	{
		boolean result = registartion.matchPhoneNumber("495");
		Assert.assertEquals(false, result);
	}
	
	
	//Email test cases_______________________________________________________________________
	@Test
	public void givenEmail_WhenImproper_ShouldReturnFalse()
	{
		String [] CorrectEmails = {"abc","abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com",".abc@abc.com","abc()*@gmail.com","abc@%*.com","abc..2002@gmail.com","abc.@gmail.com","abc@abc@gmail.com","abc@gmail.com.1a","abc@gmail.com.aa.au"};
		
		for (int i=0; i<13; i++)
		{
			boolean result = registartion.matchEmail(CorrectEmails[i]);
			Assert.assertEquals(false, result);
			
		}
	}
	
	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue()
	{

		String [] WrongEmails = {"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au","abc@1.com","abc@gmail.com.com","abc+100@gmail.com"};
		
		for (int i=0; i<9; i++)
		{
			boolean result = registartion.matchEmail(WrongEmails[i]);
			Assert.assertEquals(true, result);
			
		}
	
	}
}