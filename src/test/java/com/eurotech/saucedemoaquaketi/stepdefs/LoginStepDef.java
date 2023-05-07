package com.eurotech.saucedemoaquaketi.stepdefs;

import com.eurotech.saucedemoaquaketi.pages.LoginPage;
import com.eurotech.saucedemoaquaketi.pages.ProductsPage;
import com.eurotech.saucedemoaquaketi.utilities.utilities.ConfigurationReader;
import com.eurotech.saucedemoaquaketi.utilities.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {

    LoginPage loginPage = new LoginPage();

    ProductsPage productsPage = new ProductsPage();

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("the user enters {string} and {string}")
    public void theUserEntersAnd(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("the user should be able to login successfully")
    public void theUserShouldBeAbleToLoginSuccessfully() {
        String expectedHeader = "Products";
        String actualHeader = productsPage.header.getText();
        Assert.assertEquals(expectedHeader, actualHeader);
    }
}
