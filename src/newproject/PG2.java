package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG2 {
	public static void main (String args[]) {
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl="http://www.facebook.com";
		//String tagName="";
		
		driver.get(baseUrl);
		//tagName = driver.findElement(By.id("loginbutton")).getTagName();
		System.out.println("The tag name is: "+driver.findElement(By.id("loginbutton")).getTagName());
		//System.out.println(tagName);
		
		driver.close();
	}

}
