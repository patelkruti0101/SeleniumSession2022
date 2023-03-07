package utilities;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import testBase.TestBaseNew;

public class TestUtilitiesPractice extends TestBaseNew {
	
	public static void scrollToElement(WebElement e) {
		JavascriptExecutor je1 = (JavascriptExecutor) driver;
		je1.executeAsyncScript("arguments[0].scrollIntoView();", e);
		//je1.executeAsyncScript("window.scrollBy(0,500)", " ");
		
	}
	
	public static void screenshot() throws IOException {
		
		String str ="C://screenshot";
		File f = new File(str);
		if(!f.isDirectory())
		{
			f.mkdir();
		}
		else
		{
			System.out.println("Screenshot folder exists");
		}
		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File(str+"/"+getDate()+"image.jpg"));
	}
	
	public static String getDate() {
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY_MMM_dd_HH_mm_ss_SSSS");
		String d = sdf.format(dt);
		System.out.println(d);
		
		return d;
	}

}
