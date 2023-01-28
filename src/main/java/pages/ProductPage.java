package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.ActionStuff;
import utils.Utility;


public class ProductPage extends WebTestBase {

    @FindBy(xpath = "//a[starts-with(text(),'HP 15s-fq2672TU Intel')]")
    WebElement productId;


    @FindBy(xpath="//span[@class='text selected-text']")
  WebElement checkBoxBtn;


    public ProductPage() {
        PageFactory.initElements(driver, this);
    }


    public void clickOnProductName() {
        productId.click();

    }

    public void windowHandles() {
        ActionStuff.windowHandle(driver);
    }

    public void checkBoxClick(){
        checkBoxBtn.getText();
    }


    }










