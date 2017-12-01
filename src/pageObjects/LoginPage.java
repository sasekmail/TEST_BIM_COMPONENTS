package pageObjects;

import org.apache.http.impl.client.EntityEnclosingRequestWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static utils.Methods.*;
public class LoginPage {
	
	
	
	 public LoginPage(WebDriver driver) {
	        
	        PageFactory.initElements(driver, this);
	    }	
	
	
	 @FindBy(name = "nik")
	 public WebElement nikInputField;
	 
	 @FindBy(id = "password")
	 public WebElement passwordInputField;
	 
	 @FindBy(id = "login_button")
	 public WebElement loginButton;
	 
	 By nikin = By.name("nik");
	 
	  public void login(String login, String password){
		     
		    //sendTextBy(nikin, login);
		    sendText(this.nikInputField, login);
		    sendText(this.passwordInputField,password);
	        clickOn(this.loginButton);
	        

	    }

}
