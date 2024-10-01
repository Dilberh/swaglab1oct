package Stepdifination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdifination {
	
	public static WebDriver driver=null;
	
@Given("User launch chrome browser")
public void user_launch_chrome_browser() 
{
	 driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.saucedemo.com/");
   
}

@When("User Enters {string} and {string}")
public void user_enters_and(String string, String string2) {
    
    driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(string);
    driver.findElement(By.id("password")).sendKeys(string2);
}

@And("User click login")
public void user_click_login() 
{
	driver.findElement(By.id("login-button")).click();
}

@Then("User should navigate to homepage {string}")
public void user_should_navigate_to_homepage(String expetitle) 
{
   Assert.assertEquals(expetitle, driver.getTitle());
}

@And("browser closed")
public void browser_closed() 
{
driver.close();    
}




}
