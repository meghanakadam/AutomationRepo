package tests;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.ProductPage;
import testbase.WebTestBase;
import utils.Utility;

public class ProductTest extends WebTestBase {
    HomePage homePage;
    ProductPage productPage;

    public ProductTest() {

        super();
    }
    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
        productPage= new ProductPage();

    }
    @Test
    public void verifyWindowHandling()throws Exception {
        SoftAssert softAssert = new SoftAssert();
        homePage.searchClick(prop.getProperty("productName"));
        productPage.clickOnProductName();
        Thread.sleep(2000);
        softAssert.assertEquals(driver.getTitle(),"Search Laptops | Croma Electronics | Online Electronics Shopping | Buy Electronics Online","Title should be Match");
        softAssert.assertAll();
        productPage.windowHandles();
        productPage.checkBoxClick();



    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
}
}
