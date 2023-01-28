package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DropDownPage;
import pages.HomePage;
import testbase.WebTestBase;

public class DropDownTest  extends WebTestBase {
    HomePage homePage;
    DropDownPage dropDownPage;

    public DropDownTest() {

        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
        dropDownPage = new DropDownPage();
}
@Test
public  void  verifyDropDown(){
        homePage.searchClick(prop.getProperty("productName"));
        homePage.getSearchTextBox();
       dropDownPage.dropDownMethod();
       dropDownPage.checkBoxSelection();
       dropDownPage.scrollDown();

    }


    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}



