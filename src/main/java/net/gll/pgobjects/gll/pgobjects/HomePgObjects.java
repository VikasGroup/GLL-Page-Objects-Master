package net.gll.pgobjects.gll.pgobjects;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;


public class HomePgObjects extends PageObject {
	@FindBy(xpath="/html/body/div[1]/header/div/div/div[4]/div[2]/a")
	WebElement loginreg; 
	@FindBy(xpath=".//*[@id='mainNavi']/ul/li[1]/a")
	WebElement products; 
	@FindBy(xpath=".//*[@id='mainNavi']/ul/li[1]/div/div/div[2]/ul/li[1]/ul/li[1]/a")
	WebElement homepure; 
	@FindBy(xpath=".//*[@id='header']/div/div[4]/a[2]")
	WebElement virtualoffice; 
	
       public void clickLogInReg(){
    	   
    	   loginreg.click();
       }
       public void clickVirtualOffice(){
    	   virtualoffice.click();
       }
       public void clickProductsTab(){
    	   products.click();
       }
       public void clickHomePure(){
    	   homepure.click();
       }
       
}
