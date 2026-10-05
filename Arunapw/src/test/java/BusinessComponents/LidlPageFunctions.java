package BusinessComponents;

import org.testng.Assert;
import org.testng.Reporter;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.LocatorAssertions;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

import PageObjects.LoginPage;

public class LidlPageFunctions extends LoginPage {
    Page page;
	public void login() throws InterruptedException
	{
		try (Playwright playwright = Playwright.create()) {

			CommonUtility ul=new CommonUtility();
		    Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		     page = browser.newPage();	
		
			 page.navigate("https://www.lidl.com/");
			 page.locator(popup).isVisible();
	         if(page.locator(popup).isVisible())
	         {
		         page.locator(popup).click();
 
	         }
			 page.locator(lidltitle).isVisible();
	         page.locator(lidltitle).click();
			 page.locator(search).isVisible();
	         page.locator(search).click();
			 page.locator(search).isEditable();
	         page.locator(search).fill("My Order");
			 page.locator(lidltitle).isVisible();
	         page.locator(lidltitle).click();
			 page.locator(lidltitle).isVisible();
	         CommonUtility.capturescreenshot(page);

	}
	}
		 
		 public void logout()
			{
            Reporter.log("Log out End Of Method");
			}

		 public void FoodWine() throws InterruptedException {

	         Reporter.log("Food And Wine");
	        // page.wait(10000);
	         page.locator(FoodWine).click();
	         //page.wait(10000);

	         CommonUtility.capturescreenshot(page);

		 }

		 public void kitchenhouse() throws InterruptedException {
			 
	         Reporter.log("Kitchen House");
	         //page.wait(10000);
	         page.locator(kitchenHousehold).click();
	        // page.wait(10000);

	         CommonUtility.capturescreenshot(page);
			
		 }

		 public void DIYGarden() throws InterruptedException {
			 
	         Reporter.log("DIY Garden");
	         //page.wait(10000);
	         page.locator(DIYGarden).click();
	         //page.wait(10000);
	         CommonUtility.capturescreenshot(page);
			
		 }

		 public void HomeLivingq() throws InterruptedException {
			 
	         Reporter.log("Home Living");
	        // page.wait(10000);
	         page.locator(HomeLiving).click();
	        // page.wait(10000);
	         CommonUtility.capturescreenshot(page);
			
		 }

		 public void SportLeisur() throws InterruptedException {
			 
	         Reporter.log("Sport Leisure");
	         //page.wait(10000);
	         page.locator(SportLeisure).click();
	        // page.wait(10000);
	         CommonUtility.capturescreenshot(page);
			
		 }

		 
	}


