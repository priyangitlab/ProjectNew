package tpack1;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import pack1.Testbase;
import pack2.LoginPage;

public class LoginPageTest extends Testbase {

	
	LoginPage loginPage;
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod 
	public void setUp()
	{
		intialization();
		loginPage= new LoginPage();
	}
	
	@Test(priority=1)
	public void TitleTest()
	{
		String title=loginPage.ValidateLoginPage();
		Assert.assertEquals(title, "Sign in to GitHub · GitHub");
	}
	
	@Test(priority=2)
	public void loginTest()
	{
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}
	
	


}
