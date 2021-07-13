package com.adidas.utilities;

import io.cucumber.java.bs.A;
import org.openqa.selenium.Alert;

public class AdidasUtils {
    public static void acceptAlert() {
        Alert alert = Driver.getDriver().switchTo().alert();
        BrowserUtils.sleep(1);
        alert.accept();

    }



}
