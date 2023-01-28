package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.ProductPage;
import testbase.WebTestBase;

import javax.xml.namespace.QName;
import java.util.List;
import java.util.Properties;

public class HomeTest extends WebTestBase {

    HomePage homePage;


    public HomeTest(){

        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
         homePage = new HomePage();


    }

    @Test
    public void verifySearchOption() {
        SoftAssert softAssert = new SoftAssert();
        homePage.searchClick(prop.getProperty("productName"));
        homePage.getSearchTextBox();
        softAssert.assertEquals(driver.getTitle(),"croma","Title should be Match");

    }

    @AfterMethod
    public void afterMethod(){
        driver.close();
        }





            }




