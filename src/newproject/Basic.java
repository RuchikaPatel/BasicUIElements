package newproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// webdriver is an interface that provides all method to automate and thus to give the knowledge of webdriver 
		//to the object of driver we give webdriver as a return type
		
		driver.get("https://google.com");// this will hit the url
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
       
		//System.out.println(driver.getPageSource());
		
		
		}

}
