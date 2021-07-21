package com.demoblaze.pages;

import com.demoblaze.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AdidasPage {
    //also here can create productAdder() method, which accepts category and product.

    /**
     *  public int productAdder(String category, String product){
     *         Driver.getDriver().findElement(By.xpath("//a[.='"+category+"']")).click();
     *         BrowserUtils.sleep(1);
     *         Driver.getDriver().findElement(By.xpath("//a[.='"+product+"']")).click();
     *         BrowserUtils.sleep(1);
     *
     *         String amountString = purchasePrice.getText();
     *         String[] arrayAmount = amountString.split(" ");
     *         int amount = Integer.parseInt(arrayAmount[0].substring(1));
     *
     *         addCart.click();
     *         BrowserUtils.sleep(1);
     *         Alert alert = Driver.getDriver().switchTo().alert();
     *         alert.accept();
     *
     *         BrowserUtils.sleep(1);
     *
     *         homeLink.click();
     *
     *         return amount;
     *
     *     }  //will help us to get amount of purchase
     */
    //and remover

    /**
     * public int productRemover(String product){
     *         cart.click();
     *         BrowserUtils.sleep(1);
     *         int amount = Integer.parseInt(Driver.getDriver().findElement(By.xpath("//tbody//tr//td[.='"+product+"']/..//td[3]")).getText());
     *         Driver.getDriver().findElement(By.xpath("//table//tr//td[.='"+product+"']/..//td[.='Delete']/a")).click();
     *         BrowserUtils.sleep(3);
     *         return amount;
     *     }
     */


    public AdidasPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[.='Phones']")
    public WebElement phonesButton;

    @FindBy(xpath = "//a[.='Laptops']")
    public WebElement laptopButton;

    @FindBy(xpath = "//a[.='Monitors']")
    public WebElement monitorsButton;

    @FindBy(css="a#nava")
    public WebElement homePage;

    @FindBy(xpath = "//a[.='Sony vaio i5']")
    public WebElement sonyVaioI5;

    @FindBy(xpath = "//a[.='Add to cart']")
    public WebElement addTooCardButton;

    @FindBy(xpath = "//a[.='Dell i7 8gb']")
    public WebElement dellI78gb;

    @FindBy(xpath = "//a[.='Cart']")
    public WebElement cartButton;

    @FindBy(xpath = "//button[.='Place Order']")
    public WebElement placeOrderButton;

    @FindBy(css = "input#name")
    public WebElement inputName;

    @FindBy(css = "input#country")
    public WebElement inputCountry;

    @FindBy(css = "input#city")
    public WebElement inputCity;

    @FindBy(css = "input#card")
    public WebElement inputCreditCard;

    @FindBy(css = "input#month")
    public WebElement inputMonth;

    @FindBy(css = "input#year")
    public WebElement inputYear;

    @FindBy(xpath = "//button[.='Purchase']")
    public WebElement purchaseButton;

    @FindBy(xpath = "//button[.='OK']")
    public WebElement okButton;

    @FindBy(xpath = "(//table/tbody/tr/td)[2]")
    public WebElement firstItemInTheCart;

    @FindBy(xpath = "(//table/tbody/tr[1]/td)[2]")
    public WebElement secondItemInTheCart;

    @FindBy(css = "h3#totalp")
    public WebElement purchasePrice;

    @FindBy(xpath = "//p[@class='lead text-muted ']")
    public WebElement purchasingInfo;

    @FindBy(xpath = "//table//tbody/tr/td[.='Dell i7 8gb']/..//a[.='Delete']")
    public WebElement deleteButtonForDell;

    @FindBy(xpath = "//table//tbody/tr/td[.='Dell i7 8gb']")
    public WebElement dellInCart;

    @FindBy(xpath = "//img[contains(@src,'dell')]")
    public WebElement dellImageInCart;

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> itemsInCart;

    @FindBy(xpath = "//a[@class='hrefch']")
    public List<WebElement> products;




}















