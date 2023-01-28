package pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.Utility;


public class HomePage extends WebTestBase {

    @FindBy( id = "search")
    WebElement searchtextBox;

@FindBy(xpath = "//span[@class='icon']")
WebElement getSearchtextBox;


    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    public void searchClick(String productName) {

        searchtextBox.sendKeys(productName);
        searchtextBox.sendKeys(Keys.ENTER);

    }

    public void getSearchTextBox(){

        getSearchtextBox.click();

    }

    public void cookiesMethod()throws Exception{
        Utility.Cookies();
    }

    }


