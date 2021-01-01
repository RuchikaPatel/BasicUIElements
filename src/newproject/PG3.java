package newproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// difference between close and quit
		//close will close only the browser window that webdriver is currently controlling whereas quit will close all the browser window that webdriver has opened
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
        driver.get("http://www.popuptest.com/popuptest2.html");
        
        driver.quit();  // using QUIT all windows will close
       

	}

}
