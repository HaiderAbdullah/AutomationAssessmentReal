package assesment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateUser {
    @FindBy(id = "j_username")
	private WebElement userLogin;
		
	@FindBy(name = "j_password")
	private WebElement userPassword;
	
	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(name = "password1")
	private WebElement password;
	
	@FindBy(name = "password2")
	private WebElement passwordAgain;
	
	@FindBy(name = "fullname")
	private WebElement fullname;
	
	@FindBy(name = "email")
	private WebElement email;
	
	@FindBy(name = "yui-gen1-button")
	private WebElement submitButton;


	
	public void login() throws InterruptedException {
		userLogin.sendKeys("Abdullah");
		userPassword.sendKeys("Hello123");
	     userPassword.submit();
	}
	
	public void search() throws InterruptedException {
		username.sendKeys("TEST1");
		password.sendKeys("TEST123");
		passwordAgain.sendKeys("TEST123");
		fullname.sendKeys("TEST1 TEST");
		email.sendKeys("TEST1@TEST.COM");
	
		
	}
	 
	public void submit() throws InterruptedException {
		
		submitButton.submit();
		
	}
	
	
}


