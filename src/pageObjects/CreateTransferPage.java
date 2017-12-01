package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CreateTransferPage {
	
	
	 public CreateTransferPage(WebDriver driver) {
	        
	        PageFactory.initElements(driver, this);
	    }	
	
	 @FindBy(xpath = ".//*[@id='select_account']//img")
	 public WebElement selectSourceAccountButton;
	 
	 @FindBy(xpath = ".//*[@id='select_benef_account']//img")
	 public WebElement selectDestinationAccountButton;
	 
	 @FindBy(xpath = ".//*[@id='select_benef']/input")
	 public WebElement counterpartyInputField;
	 
	 
	 @FindBy(id = "select_benef_account")
	 public WebElement beneficiaryAccountInputField;
	 
	 @FindBy(id = "text_benef_name")
	 public WebElement beneficiaryNameInputField;
	 
	 @FindBy(id = "text_title")
	 public WebElement transferTitleInputField;
	 
	 @FindBy(id = "text_amount")
	 public WebElement transferAmountInputField;
	 
	 @FindBy(id = "button_confirm_step_one")
	 public WebElement confirmTransferButton;
	 
	 @FindBy(id = "button_confirm_step_two")
	 public WebElement confirmTransferStepTwoButton;
	 
	 @FindBy(xpath = "//div[contains(@class,'cbp-wizard-step-label-active')][contains(text(),'Potwierd')]")
	 public WebElement confirmationActiveLabel;
	 
	 @FindBy(xpath = "//div[contains(@class,'cbp-account-name')][div[@class='ellipsis']]")
	 public List<WebElement> userAccountsList;
	 
	 @FindBy(xpath = "//div[@class='v-window-wrap'][//div[contains(text(),'dyspozycja')][contains(text(),'przyj')]]")
	 public WebElement transferOperationEndedSuccessfullyWindow;
	 
	 @FindBy(xpath = "//div[@class='v-window-wrap']//span[@class='v-button-caption'][contains(text(),'Zako')]")
	 public WebElement closeOperationWindowTransferStatus;
	 
	 
	 public void fillNormalTransferForm(int accountSourceNum,String beneficiaryAccount, String beneficiaryName, String trasferTitle, String transferAmount ){

		    this.selectSourceAccountButton.click();
			this.userAccountsList.get(accountSourceNum).click();
			this.beneficiaryAccountInputField.sendKeys(beneficiaryAccount);
			this.beneficiaryNameInputField.sendKeys(beneficiaryName);
			this.transferTitleInputField.sendKeys(trasferTitle);
			this.transferAmountInputField.sendKeys(transferAmount);
			
		
		 
		 
		 
	 }
	 
	 public void fillNormalTransferForm(int accountSourceNum,String beneficiaryName, String transferAmount ){

		    this.selectSourceAccountButton.click();
			this.userAccountsList.get(accountSourceNum).click();			
			this.counterpartyInputField.sendKeys(beneficiaryName);
			this.transferAmountInputField.sendKeys(transferAmount);		 
		 
	 }
	 
	 
	 
	 
	 public void fillInternalTransferForm(int accountSourceNum,int accountDestNum, String trasferTitle, String transferAmount ){

		    this.selectSourceAccountButton.click();
			this.userAccountsList.get(accountSourceNum).click();
			this.selectDestinationAccountButton.click();
			this.userAccountsList.get(accountDestNum).click();
			this.transferTitleInputField.sendKeys(trasferTitle);
			this.transferAmountInputField.sendKeys(transferAmount);
			
		
				 
		 
	 }
	 
}
