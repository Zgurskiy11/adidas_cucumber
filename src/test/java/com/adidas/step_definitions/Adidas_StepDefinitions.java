package com.adidas.step_definitions;

import com.adidas.pages.AdidasPage;
import com.adidas.utilities.AdidasUtils;
import com.adidas.utilities.BrowserUtils;
import com.adidas.utilities.ConfigurationReader;
import com.adidas.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class Adidas_StepDefinitions {
    AdidasPage adidasPage = new AdidasPage();

    @Given("user is on the main page")
    public void user_is_on_the_main_page() {
       Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        BrowserUtils.sleep(1);

    }
    @When("user clicks on Laptop")
    public void user_clicks_on_laptop() {
        adidasPage.laptopButton.click();

    }
    @When("user chooses Sony vaio i5")
    public void user_chooses_sony_vaio_i5() {
        adidasPage.sonyVaioI5.click();

    }
    @When("user clicks on Add to cart")
    public void user_clicks_on_add_to_cart() {
        adidasPage.addTooCardButton.click();
        BrowserUtils.sleep(1);

    }
    @When("accepts pop up")
    public void accepts_pop_up() {
        AdidasUtils.acceptAlert();

    }
    @Then("user should be able see Sony in the cart")
    public void user_should_be_able_see_Sony_in_the_cart() {
        adidasPage.cartButton.click();
        Assert.assertEquals("Sony vaio i5", adidasPage.firstItemInTheCart.getText());

    }
    @When("user chooses Dell i7 8gb")
    public void user_chooses_dell_i7_8gb() {
        adidasPage.dellI78gb.click();
    }

    @Then("user should be able see Dell in the cart")
    public void userShouldBeAbleSeeDellInTheCart() {
        adidasPage.cartButton.click();
        Assert.assertEquals("Dell i7 8gb", adidasPage.secondItemInTheCart.getText());
    }

    @When("user clicks on Cart button")
    public void userClicksOnCartButton() {
        adidasPage.cartButton.click();
        BrowserUtils.sleep(2);
    }

    @When("user clicks on delete button referring to Dell i7 8gb laptop")
    public void user_clicks_on_delete_button_referring_to_dell_i7_8gb_laptop() {
        adidasPage.deleteButtonForDell.click();
        BrowserUtils.sleep(2);

    }
    @Then("Dell i7 8gb gets deleted from the list")
    public void dell_i7_8gb_gets_deleted_from_the_list() {
        Assert.assertEquals(adidasPage.itemsInCart.size(), 1);
    }

    @Given("user is on Cart page with items in the cart")
    public void userIsOnCartPageWithItemsInTheCart() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        BrowserUtils.sleep(1);
        adidasPage.laptopButton.click();
        adidasPage.sonyVaioI5.click();
        adidasPage.addTooCardButton.click();
        BrowserUtils.sleep(1);
        AdidasUtils.acceptAlert();
        adidasPage.homePage.click();
        adidasPage.laptopButton.click();
        adidasPage.dellI78gb.click();
        adidasPage.addTooCardButton.click();
        BrowserUtils.sleep(1);
        AdidasUtils.acceptAlert();
        adidasPage.cartButton.click();
        BrowserUtils.sleep(2);


    }
}
