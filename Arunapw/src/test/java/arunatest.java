import java.nio.file.Path;
import java.nio.file.Paths;

import org.xml.sax.ext.Locator2Impl;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class arunatest {

	
public static void main(String args[]) throws InterruptedException
{
	
	 try (Playwright playwright = Playwright.create()) {
         Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
         BrowserContext context=browser.newContext(); 
         Page page = browser.newPage();
         page.navigate("https://global.flixbus.com/");
         System.out.println(page.title());
         //Locator shoadowroot=page.locator("div#usercentrics-root");
    	 
         //shoadowroot.locator(".sc-gsFSXq vtTWk").click();
         
         UtilityLib.capturescreenshot(page);

         
         
         
			/*
			 * Page page1=context.waitForPage(()->{
			 * 
			 * 
			 * page.locator("//button[text()='Search']").click(); }); page1.bringToFront();
			 * UtilityLib.capturescreenshot(page1);
			 * page1.locator("//label[text()='Round Trip']").click();
			 * System.out.println("Round Trip");
			 * 
			 * UtilityLib.capturescreenshot(page1);
			 */
	     page.close();
	 } 
}

}
