package UniformAppStepDef;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//@RunWith(Cucumber.class)
public class UniformStepDef {
	
	
 public WebDriver wd;


	/*
	 * @When("I click on My Account Icon") public void i_click_on_my_account_icon()
	 * throws InterruptedException { // Write code here that turns the phrase above
	 * into concrete actions
	 * wd.findElement(By.xpath("//a[@title='My Account']")).click();
	 * Thread.sleep(2000); }
	 */
/*
@When("I click on Register link")
public void i_click_on_register_link() throws InterruptedException {
	// Write code here that turns the phrase above into concrete actions
    wd.findElement(By.xpath("//a[contains(.,'Register')]")).click();
	Thread.sleep(5000);
}

@Then("I validate that Registration page is displayed")
public void i_validate_that_registration_page_is_displayed() {
	// Write code here that turns the phrase above into concrete actions
	String pageTitle = wd.getTitle();
	System.out.println(pageTitle);
	
	  if (pageTitle.equals("Register Account")) 
	  {
	  System.out.println("Registration page is displayed successfully"); 
	  }
	  else
	  {
		  System.out.println("Registration page is not displayed"); 
		  
	  }
}

@Then("I fill in the data in required fields")
public void i_fill_in_the_data_in_required_fields() throws InterruptedException {
	// Write code here that turns the phrase above into concrete actions
	wd.findElement(By.name("firstname")).sendKeys("Shiva");
	wd.findElement(By.name("lastname")).sendKeys("Shankar");
	wd.findElement(By.name("email")).sendKeys("shiva.shankarym@Yahoo.com");
	wd.findElement(By.name("telephone")).sendKeys("9483533965");
	wd.findElement(By.name("address_1")).sendKeys("14 Road");
	wd.findElement(By.name("address_2")).sendKeys("Land Mark TEMPLE");
	wd.findElement(By.name("city")).sendKeys("Bangalore");
	wd.findElement(By.name("postcode")).sendKeys("560097");
	Select country = new Select(wd.findElement(By.name("country_id")));
	country.selectByVisibleText("India");
	
	Select postcode = new Select(wd.findElement(By.id("input-zone")));
	postcode.selectByVisibleText("karnataka");
	wd.findElement(By.name("password")).sendKeys("Shiva123");
	wd.findElement(By.name("confirm")).sendKeys("Shiva123");
	wd.findElement(By.xpath("//input[@name='newsletter'][@value='0']")).click();
	wd.findElement(By.xpath("//input[@name='agree'][@value='1']")).click();
	Thread.sleep(5000);
	
	
	}


@Then("Click on Continue button")
public void click_on_continue_button() {
	// Write code here that turns the phrase above into concrete actions
	wd.findElement(By.xpath("//input[@type='submit'][@value='Continue']")).click();
}

@Then("I validate that Account is created successfully")
public void i_validate_that_account_is_created_successfully() {
	// Write code here that turns the phrase above into concrete actions
	String actText= wd.findElement(By.xpath("//p[contains(text(),'Congratulations')]")).getText();
	System.out.println(actText);
	String expText = "Congratulations! Your new account has been successfully created!";
	Assert.assertEquals(expText,actText);
	
}


@When("I click on Login link")
public void i_click_on_login_link() throws InterruptedException {
    
	wd.findElement(By.xpath("//li/a[contains(.,'Login')]")).click();
	Thread.sleep(5000);
}

@When("I enter valid login credentials")
public void i_enter_valid_login_credentials() {
   
	wd.findElement(By.name("email")).sendKeys("ptelharkar@mailinator.com");
	wd.findElement(By.name("password")).sendKeys("Prakash123");
}

@When("I click on Login button")
public void i_click_on_login_button() throws InterruptedException {
    
	wd.findElement(By.xpath("//input[@type='submit'][@value='Login']")).click();
	Thread.sleep(4000);
}

@Then("I validate that My Account page is displayed")
public void i_validate_that_my_account_page_is_displayed() {
    // Write code here that turns the phrase above into concrete actions
	String ExpLoginText = "MY ACCOUNT";
	String ActualLoginText = wd.findElement(By.xpath("//div[@class='col-sm-9']/h1")).getText();
	Assert.assertEquals(ExpLoginText, ActualLoginText);
}

@Then("I enter login credentials")
public void i_enter_login_credentials() {
    
	wd.findElement(By.name("email")).sendKeys("ptelharkar2@mailinator.com");
	wd.findElement(By.name("password")).sendKeys("Prakash12");
}

@Then("I validate that Warning message for No Match is displayed")
public void i_validate_that_warning_message_for_no_match_is_displayed() {
    
	String expWarningText = "Warning: No match for E-Mail Address and/or Password.";
	String actWarningText= wd.findElement(By.xpath("//div[contains(text(),'Warning: No match')]")).getText();
	Assert.assertEquals(expWarningText,actWarningText);
	
}

@Then("I click on Forgot Password link")
public void i_click_on_forgot_password_link() {
    
	
	wd.findElement(By.linkText("Forgotten Password")).click();
}

@Then("I validate that password retrieval page is displayed")
public void i_validate_that_password_retrieval_page_is_displayed() {
    
	String ExpPassPageText = "FORGOT YOUR PASSWORD?";
	String ActPassPageText = wd.findElement(By.xpath("//div[@class='col-sm-9']/h1")).getText();
	Assert.assertEquals(ExpPassPageText, ActPassPageText);
}

@Then("I enter registered email in email address text box")
public void i_enter_registered_email_in_email_address_text_box() {
    
	wd.findElement(By.name("email")).sendKeys("ptelharkar2@mailinator.com");
}

@Then("click on Continue button on forgot password page")
public void click_on_continue_button_on_forgot_password_page() {
    
	wd.findElement(By.xpath("//input[@type='submit'][@value='Continue']")).click();
}

@Then("I validate that appropriate message is displayed")
public void i_validate_that_appropriate_message_is_displayed() {
    
	String expConfText = "An email with a confirmation link has been sent your email address.";
	String actConfText= wd.findElement(By.xpath("//div[contains(text(),'An email with a confirmation link')]")).getText();
	Assert.assertEquals(expConfText, actConfText);
}

@Then("I close the browser")
public void i_close_the_browser() {
    try {
    wd.quit();
    }
    catch (Exception e) {
    	e.printStackTrace();
    }
}*/

@Given("^I Navigate to Virgo site by entering valid URL$")
public void I_Navigate_to_Virgo_site_by_entering_valid_URL() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\devan\\eclipse-workspace\\uniformapp\\Drivers\\chromedriver.exe"); 
	wd = new ChromeDriver();
	wd.manage().window().maximize();
    Thread.sleep(2000);
    // Navigating to URL
    wd.get("https://www.virgohealthcare.in/");
    Thread.sleep(5000);
}

@When("^I click on  My Account Icon$")
public void i_click_on_my_account_icon() throws Throwable {
	   wd.findElement(By.linkText("Account")).click();
	   Thread.sleep(5000);
	   Set <String>handles = wd.getWindowHandles();
	    String currentHandle = wd.getWindowHandle();
	    for (String handle : handles) {
	     if (!handle .equals(currentHandle))
	     {
	         wd.switchTo().window(handle);
	     }
	   }
}

@Then("^I validate that Registration page is displayed$")
public void i_validate_that_registration_page_is_displayed() throws Throwable {
	wd.findElement(By.xpath("//h2[contains(text(),'Register')]"));
}

@Then("^I fill in the (.+) and (.+)$")
public void i_fill_in_the_and (String arg1, String arg2)throws Throwable {
	wd.findElement(By.name("username")).sendKeys(arg1);
	List<WebElement>  listele = wd.findElements(By.name("password"));
	System.out.println(listele.size());
	listele.get(0).sendKeys(arg2);
}
@And("^Click on Register button$") 
public void click_on_register_button() throws Throwable {
 wd.findElement(By.xpath("//button[@name='login']")).click();
 Thread.sleep(5000);
}

@Then("^I validate that Account is created successfully$") 
public void i_validate_that_account_is_created_successfully() throws Throwable { 
wd.findElement(By.xpath("//a[contains(text(),'Logout')]"));
}

@Then("^I close the browser$")
public void i_close_the_browser() throws Throwable {
try {
    wd.quit();
    }
    catch (Exception e) 
    {
	e.printStackTrace();
    }
}
@When("^I click on the Search Icon$")
public void i_click_on_the_search_icon() throws Throwable {
	wd.findElement(By.xpath("//i[@class='icon icon-magnifier']")).click();
	wd.findElement(By.xpath("//input[@type='search' and @placeholder='Search Here..']")).sendKeys("Lycowerg");
	WebElement wb=wd.findElement(By.xpath("//*[@id=\"header-search\"]/div/div/div/div/form/button/i"));
	JavascriptExecutor js = (JavascriptExecutor)wd; 
	js.executeScript("arguments[0].click();",wb);
	}

@Then("^I search Lycowerg$")
public void i_search_lycowerg() throws Throwable {
    int xp=wd.findElements(By.xpath("//h2[contains(text(),'Lycowerg Q – CoQ10 & Lycopene')]")).size();
    System.out.println("The No of elements are"+xp);    
}
}



