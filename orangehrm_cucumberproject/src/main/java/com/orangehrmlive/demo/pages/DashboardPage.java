package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends Utility {

     @FindBy(css = "#welcome")
     WebElement _welcomeText;

     @FindBy(xpath = "//a[contains(text(),'Logout')]")
     WebElement _logOutLink;

     //Method to verify Welcome Text
     public String verifyWelcomeText(){
          return getTextFromElement(_welcomeText);
     }
     //Method to click on welcome link
     public void clickOnWelcomeLink(){
          clickOnElement(_welcomeText);
     }
     //Method to click on logout
     public void clickOnLogoutLink(){
          clickOnElement(_logOutLink);
     }



}
