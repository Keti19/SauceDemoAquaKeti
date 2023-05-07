package com.eurotech.saucedemoaquaketi.pages;


import com.eurotech.saucedemoaquaketi.utilities.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

}
