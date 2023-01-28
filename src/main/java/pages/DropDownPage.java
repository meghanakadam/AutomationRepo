package pages;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.WebTestBase;
import utils.ActionStuff;

import java.util.List;

public class DropDownPage extends WebTestBase {

   @FindBy(xpath = "//div[@class='cp-select plp-cp-select']")
   WebElement dropDownBoxBtn;

   @FindBy(xpath = "//ul[@data-testid='sortinglist']//child::li")
   List<WebElement> dropDownValue;

   @FindBy(xpath="//label[@for='category-MacBooks']")
   WebElement checKBoxValue;

   @FindBy(xpath="//label[@for='category-Gaming Laptops']")
   WebElement getChecKBoxValue;


    public DropDownPage() {
        PageFactory.initElements(driver, this);
    }

    public void dropDownMethod() {
        dropDownBoxBtn.click();
        ActionStuff.getFindElements(dropDownValue);
    }

    public void checkBoxSelection(){
        checKBoxValue.click();
        getChecKBoxValue.click();
    }

    public void scrollDown() {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,8500)");
    }


}
