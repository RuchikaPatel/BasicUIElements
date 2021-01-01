package newproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;
public class PG1 {


    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	//System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use chrome
		System.setProperty("webdriver.chrome.driver","E://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 String baseUrl = "http://demo.guru99.com/test/newtours/";
		 driver.get(baseUrl);
		WebDriverWait myWait = new WebDriverWait(driver,60);
		
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName")));
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		driver.findElement(By.name("password")).sendKeys("tutorial");
       
       // String expectedTitle = "Welcome: Mercury Tours";
        //String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
       

        // get the actual value of the title
      //  actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
      /*  if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       */
        //close Fire fox
      //  driver.close();
       
    }

}