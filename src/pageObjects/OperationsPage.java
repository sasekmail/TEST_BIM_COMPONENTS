package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OperationsPage {

	
	public OperationsPage(WebDriver driver) {
        
        PageFactory.initElements(driver, this);
    }	
	
	 @FindBy(xpath = ".//*[@id='op_counterparties']//img")
	 public WebElement counterpartiesImg;
	 
	 
	 @FindBy(xpath = ".//*[@id='transfer_normal']//img")
	 public WebElement normalTransferImg;
	 
	 @FindBy(xpath = ".//*[@id='transfer_own']//img")
	 public WebElement ownTransferImg;
	 
	 
	
	
}
