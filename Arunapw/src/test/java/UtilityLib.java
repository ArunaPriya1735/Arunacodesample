import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.microsoft.playwright.Page;

public class UtilityLib {
	
	public static byte[] capturescreenshot(Page page)
	{
		SimpleDateFormat customformat=new SimpleDateFormat("dd_MM_yy_mm_ss");
		Date date=new Date();
		String finaldate=customformat.format(date);
        byte[] arr= page.screenshot(new Page.ScreenshotOptions().setFullPage(true).setPath(Paths.get("Screenshot/"+finaldate+".png")));
		return arr;
		
	}

}
