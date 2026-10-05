package Testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BusinessComponents.LidlPageFunctions;

public class LoginTestcase extends LidlPageFunctions{
	
	LidlPageFunctions lidl=new LidlPageFunctions();

	
	@BeforeMethod
	public void Login() throws InterruptedException {
		
		lidl.login();
		
	}
 
	@Test(priority = 1)
	public void Foodwine() throws InterruptedException
	{
		lidl.FoodWine();
	}
	
	
	@Test(priority = 2)
	public void Kitchenhousehold() throws InterruptedException
	{
		lidl.kitchenhouse();

	}
	
	@Test(priority = 3)
	public void DIYGarden() throws InterruptedException
	{
		lidl.DIYGarden();
	
	}
	
	@Test(priority =4)
	public void SportLeisure() throws InterruptedException
	{
		lidl.SportLeisur();

	}
	
	@Test(priority = 5)
	public void HomeLiving() throws InterruptedException
	{
		lidl.HomeLivingq();
	}
	
	@AfterMethod
	public void Logout()
	{
		lidl.logout();
	}

	}
