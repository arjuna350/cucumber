package hookTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When; 
/**
 * We can also indicate if we want before and after
	hooks to be executed with a specific tag only.
 	Example − @Before(‘@Web’). 
 	The same concept of tag logical and/or can be applied
  	with hooks as well.
   	Example − @Before(@dev,@wip), @Before(@dev,~@wip)
 * @author shaising
 *
 */
public class HookTest {
   WebDriver driver = null; 
	
   @Before public void setUp(){ 
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaising\\Documents\\software\\chrome_driver\\chromedriver.exe");
		  driver = new ChromeDriver(); 
   } 
	
   @Given("^user navigates to facebook$") 
   public void goToFacebook() { 
      driver.navigate().to("https://www.facebook.com/");
   } 
	
   @When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$") 
   public void I_enter_Username_as_and_Password_as(String arg1, String arg2) {
      driver.findElement(By.id("email")).sendKeys(arg1);
      driver.findElement(By.id("pass")).sendKeys(arg2);
      driver.findElement(By.id("loginbutton")).click(); 
   } 
	
   @Then("^login should be unsuccessful$") 
   public void validateRelogin() { 
      if(driver.getCurrentUrl().equalsIgnoreCase(
         "https://www.facebook.com/login.php?login_attempt=1&lwv=110")){ 
            System.out.println("Test Pass"); 
      } else { 
         System.out.println("Test Failed"); 
      } 
     
   } 
	
   @After public void cleanUp(){ 
      driver.close(); 
   } 
}