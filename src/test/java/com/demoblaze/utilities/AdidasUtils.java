package com.demoblaze.utilities;

import com.demoblaze.pages.AdidasPage;
import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;

public class AdidasUtils {
    public static void acceptAlert() {
        Alert alert = Driver.getDriver().switchTo().alert();
        BrowserUtils.sleep(1);
        alert.accept();
    }

    public static void infoInput(){
        Faker x = new Faker();
        String name = x.name().firstName();
        String country = x.country().name();
        String city =x.address().city();
        String creditCard = x.finance().creditCard();
        String month = "July";
        String year = "2021";

        AdidasPage page = new AdidasPage();
        page.inputName.sendKeys(name);
        page.inputCountry.sendKeys(country);
        page.inputCity.sendKeys(city);
        page.inputCreditCard.sendKeys(creditCard);
        page.inputMonth.sendKeys(month);
        page.inputYear.sendKeys(year);


    }



}
