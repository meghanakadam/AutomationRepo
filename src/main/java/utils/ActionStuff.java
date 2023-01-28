package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import testbase.WebTestBase;

import java.util.List;
import java.util.Set;

public class ActionStuff  extends WebTestBase {
    public static void windowHandle(WebDriver driver) {
        String parentWindowId = driver.getWindowHandle();
        Set<String> allwindow = driver.getWindowHandles();

        for (String s : allwindow) {
            if (!parentWindowId.contentEquals(s)) {
                driver.switchTo().window(s);
                driver.close();
            }
        }
        driver.switchTo().window(parentWindowId);

    }

    public static void getFindElements(List<WebElement> element) {
        for (WebElement e : element) {
            System.out.println(e.getText());
            if (e.getText().equals("Price (Highest First)")) {
                e.click();
                break;
            }
        }
    }
}





















