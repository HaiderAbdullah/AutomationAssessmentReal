package assesment;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class testing {
	

	public WebDriver driver = null;
	public static ExtentReports report;
	public static ExtentTest test;
	static int runs = 0;
	
	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		if(runs < 1)
		{
			report = new ExtentReports("C:\\Users\\Admin\\Desktop\\AssessmentReports\\Reports.html", true);
		}
		runs++;
	}

	
	@Given("^that you are on the create UserScreen$")
	public void that_you_are_on_the_create_UserScreen() throws Throwable  {
		
		    CreateUser userInfo = PageFactory.initElements(driver, CreateUser.class);
		
			driver.get(Constants.loginURL);
			
			userInfo.login();
		
		    driver.get(Constants.registerURL);
			test = report.startTest("Accessing website landing page");
			test.log(LogStatus.INFO, "Opening website");
			
			
			if(driver.getCurrentUrl().equals(Constants.registerURL))
			{
				test.log(LogStatus.PASS, "Correct domain loaded");
			}
			else
			{
				test.log(LogStatus.FAIL, "Incorrect Domain Loaded");
			}
			report.endTest(test);
			
			assertEquals("http://localhost:8080/securityRealm/addUser", driver.getCurrentUrl());
			throw new PendingException();
		} 
	

	@When("^the User details are entered on the Create UserScreen$")
	public void the_User_details_are_entered_on_the_Create_UserScreen() throws Throwable {
		CreateUser userInfo = PageFactory.initElements(driver, CreateUser.class);
		test = report.startTest("Registeration Information Input");
		userInfo.search();
		test.log(LogStatus.INFO, "Inserting Data");
		report.endTest(test);
		
		//assertEquals(By.xpath("//*[@id=\"yui-gen1-button\"]"), userInfo.search());
	    throw new PendingException();
	    
	}

   @When("^the details are submitted on the Create UserScreen$")
	public void the_details_are_submitted_on_the_Create_UserScreen() throws Throwable {
		CreateUser userInfo = PageFactory.initElements(driver, CreateUser.class);
	    //userInfo.submit();
		driver.findElement(By.xpath("//*[@id=\"yui-gen1-button\"]")).click();
	    throw new PendingException();
	}

	@Then("^the Username should be visible on the UsersScreen$")
	public void the_Username_should_be_visible_on_the_UsersScreen() throws Throwable {
	    driver.get(Constants.userInformation);
		
	    throw new PendingException();
	}

	@When("^the User details \"([^\"]*)\" username, \"([^\"]*)\" password, \"([^\"]*)\" confirm Password, and \"([^\"]*)\" Fullname are entered on the Create UserScreen$")
	public void the_User_details_username_password_confirm_Password_and_Fullname_are_entered_on_the_Create_UserScreen(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^the \"([^\"]*)\" username should be visible on the UsersScreen$")
	public void the_username_should_be_visible_on_the_UsersScreen(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^the \"([^\"]*)\" username is visible on the UsersScreen$")
	public void the_username_is_visible_on_the_UsersScreen(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^the \"([^\"]*)\" username is clicked on the UserScreen$")
	public void the_username_is_clicked_on_the_UserScreen(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^the User Profile should display the \"([^\"]*)\" username on the ProfileScreen$")
	public void the_User_Profile_should_display_the_username_on_the_ProfileScreen(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^the \"([^\"]*)\" Username's profile page has been loaded$")
	public void the_Username_s_profile_page_has_been_loaded(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^the configure button has been clicked on the profile page$")
	public void the_configure_button_has_been_clicked_on_the_profile_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I change the old FullName on the Configure Page to a new FullName \"([^\"]*)\"$")
	public void i_change_the_old_FullName_on_the_Configure_Page_to_a_new_FullName(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I save the changes to the Configure Page$")
	public void i_save_the_changes_to_the_Configure_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^the Configure Page should show the NewFullName \"([^\"]*)\"$")
	public void the_Configure_Page_should_show_the_NewFullName(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	    
	}
	
	
	@After
	public void tearDown() {
		report.flush();
		driver.quit();
		
	}
	
	@AfterClass
	public static void after() {
		
		
	}
	
	
}


