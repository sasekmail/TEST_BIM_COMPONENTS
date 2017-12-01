package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import main.Main;





public class CreateCounterpartyPage {
	
	protected WebDriver driver;
	
	 public CreateCounterpartyPage(WebDriver driver) {
	        
	        PageFactory.initElements(driver, this);
	        this.driver=driver;
	    }	
	
	 

	
	 
	 @FindBy(xpath = "//span[@class='v-button-caption'][contains(text(),'Zatw')]")
	 public WebElement confirmButton;
	 
	 @FindBy(xpath = "//div[contains(@class,'cbp-wizard-step-label-active')][contains(text(),'Potwierd')]")
	 public WebElement confirmationActiveLabel;
	
	
	 public WebElement returnCounterPartyFormField(String fieldName,String fieldType){
		
		String baseCounterPartyFormField ="//div[contains(text(),'"+fieldName+"')]/../../following :: div[1]//"+fieldType;
		 		 
		return  driver.findElement(By.xpath(baseCounterPartyFormField));
	 
	 }
	
	 public void fillCreateCounterPartyForm(String nazwa,String nrachunku, String nazwaNazwisko, String adres, String tytulPlatnosci ){
		    Main.logger.add("Write beneficiary short name: "+nazwa);
		    this.returnCounterPartyFormField("Nazwa skr","input").sendKeys(nazwa);
		    Main.logger.add("Write beneficiary account number: "+nrachunku);
			this.returnCounterPartyFormField("Numer","input").sendKeys(nrachunku);
			Main.logger.add("Write beneficiary name: "+nazwaNazwisko);
			this.returnCounterPartyFormField("nazwisko","input").sendKeys(nazwaNazwisko);
			Main.logger.add("Write beneficiary address: "+adres);
			this.returnCounterPartyFormField("Adres","textarea").sendKeys(adres);
			Main.logger.add("Write default transfer title: "+tytulPlatnosci);
			this.returnCounterPartyFormField("Domy","textarea").sendKeys(tytulPlatnosci);
			 
	 }
	 
	

}
