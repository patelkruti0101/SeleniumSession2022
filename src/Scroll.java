import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testBase.TestBaseNew;
import utilities.TestUtilitiesPractice;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriver dr = TestBaseNew.getInstance();
		dr.get("https://testrigor.com/?utm_source=google&utm_medium=ppc&utm_campaign=code-maintenance&adgroup=code-maintenance&targetid=kwd-297798446061&placement=&utm_term=selenium%20tutorials&gclid=CjwKCAjwyaWZBhBGEiwACslQo6WmdIs9SH5gcPG8hBrtlhiOFZUzZ9XuyuxsLvWjWD0sdWG3zT-eihoCiNcQAvD_BwE&gclid=CjwKCAjwyaWZBhBGEiwACslQo6WmdIs9SH5gcPG8hBrtlhiOFZUzZ9XuyuxsLvWjWD0sdWG3zT-eihoCiNcQAvD_BwE");
		
		/*JavascriptExecutor je = (JavascriptExecutor) dr;
		je.executeScript("window.scrollTo(0,800)", " ");
		je.executeScript("window.scrollBy(0,800)", " ");*/
		
		WebElement ele = dr.findElement(By.xpath("//a[text()='Salesforce Testing'][@href='/salesforce/']"));
		TestUtilitiesPractice.scrollToElement(ele);
				
		
	
		
	}
	
	
	

}
