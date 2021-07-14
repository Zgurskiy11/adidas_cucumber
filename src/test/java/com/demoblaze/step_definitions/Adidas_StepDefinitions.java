package com.demoblaze.step_definitions;

import com.demoblaze.pages.AdidasPage;
import com.demoblaze.utilities.AdidasUtils;
import com.demoblaze.utilities.BrowserUtils;
import com.demoblaze.utilities.ConfigurationReader;
import com.demoblaze.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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
    @Given("Sony Laptop already in the cart")
    public void sony_laptop_already_in_the_cart() {
        adidasPage.laptopButton.click();
        adidasPage.sonyVaioI5.click();
        adidasPage.addTooCardButton.click();
        BrowserUtils.sleep(1);
        AdidasUtils.acceptAlert();
        adidasPage.homePage.click();
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
        Driver.getDriver();
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
    @Given("user is on Cart page with Sony laptop in the cart")
    public void user_is_on_cart_page_with_sony_laptop_in_the_cart() {
        Driver.getDriver();
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        BrowserUtils.sleep(1);
        adidasPage.laptopButton.click();
        adidasPage.sonyVaioI5.click();
        adidasPage.addTooCardButton.click();
        BrowserUtils.sleep(1);
        AdidasUtils.acceptAlert();
        adidasPage.cartButton.click();
    }
    @When("user clicks on Place Order button")
    public void user_clicks_on_place_order_button() {
        adidasPage.placeOrderButton.click();
    }
    @When("user fills out all form fields")
    public void user_fills_out_all_form_fields() {
        AdidasUtils.infoInput();
        BrowserUtils.sleep(2);
    }
    @When("user clicks on purchase")
    public void user_clicks_on_purchase() {
        adidasPage.purchaseButton.click();
    }
    @Then("user should be able to see purchase ID and Amount")
    public void user_should_be_able_to_see_purchase_id_and_amount() {
      String result =adidasPage.purchasingInfo.getText();
        result= result.substring(0,23);
        Assert.assertTrue(result.contains("Id"));
        Assert.assertTrue(result.contains("Amount"));
    }
    @Then("user should verify purchase amount")
    public void user_should_verify_purchase_amount() {
        BrowserUtils.sleep(1);
        String result =adidasPage.purchasingInfo.getText();
        result=result.substring(20,23);
        Assert.assertEquals("790", result);
    }

    @Then("clicks ok")
    public void clicks_ok() {
        adidasPage.okButton.click();
    }
    @Then("closes browser")
    public void closes_browser() {
       Driver.closeDriver();

        BrowserUtils.sleep(2);
    }

    @Given("user is on the home page")
    public void userIsOnTheHomePage() {
        Driver.getDriver();
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        adidasPage.homePage.click();
    }
}
