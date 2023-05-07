package com.eurotech.saucedemoaquaketi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// page_url = https://www.saucedemo.com/
public class LoginPage extends BasePage {
    @FindBy(xpath = "//input[@id='user-name']")
    public WebElement inputUsername;

    @FindBy(name = "password")
    public WebElement inputPassword;

    @FindBy(css = "#login-button")
    public WebElement inputLoginButton;


    public void login(String username, String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        inputLoginButton.click();
    }


}