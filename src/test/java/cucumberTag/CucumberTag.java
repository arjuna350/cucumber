package cucumberTag;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver; 

import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When; 

public class CucumberTag { 
   WebDriver driver = null; 
	
   @Given("^user navigates to facebook$") 
   public void goToFacebook() { 
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaising\\Documents\\software\\chrome_driver\\chromedriver.exe");
	  driver = new ChromeDriver(); 
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
	
   @Then("^User should be redirected to login retry$") 
   public void loginRetry() { 
      if(driver.getCurrentUrl().equalsIgnoreCase(
         "https://www.facebook.com/login.php?login_attempt=1&lwv=110")){ 
            System.out.println("Test Pass"); 
      } else { 
         System.out.println("Test Failed"); 
      } 
      driver.close(); 
   } 
}