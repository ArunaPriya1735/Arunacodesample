import java.nio.file.Path;
import java.nio.file.Paths;

import org.xml.sax.ext.Locator2Impl;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class arunatest {

	
public static void main(String args[])
{
	
	 try (Playwright playwright = Playwright.create()) {
         Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
         Page page = browser.newPage();
         page.navigate("https://global.flixbus.com/");
         System.out.println(page.title());
         
         
         //page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("myscreenshot.png")));
        byte[] arr= page.screenshot(new Page.ScreenshotOptions().setFullPage(true).setPath(Paths.get("myscreenshot.png")));

         //page.locator("//p[text()='Discover Germany with FlixTrain']").screenshot(new Locator.ScreenshotOptions().setPath(Paths.get("MyelementScreenshot.png")));
	     page.close();
	 } 
}

}
