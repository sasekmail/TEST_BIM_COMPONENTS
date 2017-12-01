package pageObjects;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Helper;



public class CounterpartiesPage {
	
	protected WebDriver driver;
	
	 public CounterpartiesPage(WebDriver driver) {
	        
	        PageFactory.initElements(driver, this);
	        this.driver=driver;
	    }	
		

	 @FindBy(xpath = "//div//span[contains(text(),'Usu')]")
	 public WebElement deleteButton;
	 
	 
	 @FindBy(id = "button_create")
	 public WebElement createButton;
	 
	 @FindBy(xpath = "//input[contains(@class,'v-textfield-magnifier-background')]")
	 public WebElement searchInputField;
	 
	 @FindBy(xpath = "//input[starts-with(@id,'gwt-uid')]")
	 public List<WebElement> selectCounterpartiesCheckboxes;
	 
	 @FindBy(xpath = "//div[@class='v-window-wrap'][//div[contains(text(),'Operacja')][contains(text(),'pomy')]]")
	 public WebElement operationEndedSuccessfullyWindow;
	 
	 @FindBy(xpath = "//div[@class='v-window-wrap']//span[@class='v-button-caption']")
	 public WebElement closeInformationWindowButton;
	 
	 @FindBy(xpath = "//div[@id='recipients_table_body']//tr[contains(@class,'v-table-row')]/td[2]")
	 public List<WebElement> counterpartiesNameTableCells;
	 
	 @FindBy(xpath = "//div[@id='recipients_table_body']//tr[contains(@class,'v-table-row')]")
	 public List<WebElement> counterpartyTableRows;
	 
	 @FindBy(xpath = "//div[@class='popupContent']//h1[contains(text(),'Nie znaleziono')]")
	 public WebElement notFoundErrorMessage;
	 
	
	public boolean isCounterPartyOnTheList(String counterpartyName,int timeout){
		
		String counterpartyRowByName="//tr[td//div[contains(text(),'"+counterpartyName+"')]]//input[starts-with(@id,'gwt-uid')]";
		return Helper.isPresenceBy(counterpartyRowByName, timeout, driver); 	
		
	}
	 
	 
	 public void checkCounterparty(String counterpartyName){
		String counterpartyRowByName="//tr[td//div[contains(text(),'"+counterpartyName+"')]]//input[starts-with(@id,'gwt-uid')]";
		driver.findElement(By.xpath(counterpartyRowByName)).click();
		Helper.delay(1000);
	 }
	 
	  
	 public void searchCounterParty(String counterpartyName){
		 
     Helper.delay(50);	 
	 this.searchInputField.sendKeys(counterpartyName);
	 Helper.delay(50);
	 this.searchInputField.sendKeys(Keys.RETURN);	
	 Helper.delay(50);
	 
	 }
	 	 
	 public void clearCounterPartyFilter(){
		 this.searchInputField.clear();
		 this.searchInputField.sendKeys(Keys.RETURN);
		 
		 
	 }
	 
	
}
