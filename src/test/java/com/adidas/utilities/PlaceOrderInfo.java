package com.adidas.utilities;

import com.adidas.pages.AdidasPage;
import com.github.javafaker.Faker;

public class PlaceOrderInfo {
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
