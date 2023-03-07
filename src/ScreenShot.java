import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import testBase.TestBaseNew;
import utilities.TestUtilitiesPractice;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		
		
		
		WebDriver dr = TestBaseNew.getInstance();
		dr.get("https://testrigor.com/?utm_source=google&utm_medium=ppc&utm_campaign=code-maintenance&adgroup=code-maintenance&targetid=kwd-297798446061&placement=&utm_term=selenium%20tutorials&gclid=CjwKCAjwyaWZBhBGEiwACslQo6WmdIs9SH5gcPG8hBrtlhiOFZUzZ9XuyuxsLvWjWD0sdWG3zT-eihoCiNcQAvD_BwE&gclid=CjwKCAjwyaWZBhBGEiwACslQo6WmdIs9SH5gcPG8hBrtlhiOFZUzZ9XuyuxsLvWjWD0sdWG3zT-eihoCiNcQAvD_BwE");		
		TestUtilitiesPractice.screenshot();
	}
	
	
}
