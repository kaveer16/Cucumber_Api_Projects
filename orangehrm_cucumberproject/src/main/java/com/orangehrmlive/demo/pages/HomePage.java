package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    @FindBy(xpath = "//input[@id='txtUsername']")
    WebElement _userNameField;

    @FindBy(xpath = "//input[@id='txtPassword']")
    WebElement _passwordField;

    @FindBy(xpath = "//input[@id='btnLogin']")
    WebElement _loginButton;

    @FindBy(xpath = "//div[@id='logInPanelHeading']")
    WebElement _loginPanelText;

    //Method to enter username
    public void enterTextToUserNameField(String name){
        sendTextToElement(_userNameField,name);
    }
    //Method to enter password
    public void enterTextToPasswordField(String password){
        sendTextToElement(_passwordField,password);
    }
    //Method to click on login button
    public void clickOnLoginButton(){
        clickOnElement(_loginButton);
    }
    //Method to verify login panel text
    public String verifyLoginPanelText(){
        return getTextFromElement(_loginPanelText);
    }




}
