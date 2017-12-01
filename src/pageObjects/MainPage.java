package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
	
	
	public MainPage(WebDriver driver) {
        
        PageFactory.initElements(driver, this);
    }
	
	
	 @FindBy(xpath = "//div[contains(@class,'cbp-logged-user')][contains(text(),'Zalogowany')]")
	 public WebElement loggedLabel;
	 
	 @FindBy(xpath = "//div[contains(text(),'Wykonaj')]")
	 public WebElement operationTab;
	 
	 @FindBy(id = "logout_button")
	 public WebElement logoutButton;
	 
	 
	
}
