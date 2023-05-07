package com.eurotech.saucedemoaquaketi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// page_url = https://www.saucedemo.com/inventory.html
public class ProductsPage extends BasePage {
    @FindBy(xpath = "//*[text() = 'Products']")
    public WebElement header;

    
    

}