package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testbase.WebTestBase;
import java.time.Duration;
import java.util.Set;

public class Utility extends WebTestBase {
    public static final long PAGE_LOAD_TIMEOUT = 20;
    public static final long IMPLICITLY_WAIT = 20;

    public static void waitUntilElementToBeClick(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(IMPLICITLY_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }
    public static void Cookies()throws Exception{
        Cookie addCookie= new Cookie("Google" ,"PoorDadRichDad");
        driver.manage().addCookie(addCookie);

        Set<Cookie>cookies= driver.manage().getCookies();
        for(Cookie c:cookies){
            System.out.println(c);
        }

        System.out.println("Get Cookies By Name");
        System.out.println(driver.manage().getCookieNamed("Google"));


        System.out.println("Delete Cookies");
        driver.manage().deleteCookie(addCookie);
        Set<Cookie> cookies1= driver.manage().getCookies();
        for(Cookie c:cookies1){
            System.out.println(c);
        }
        System.out.println("Delete Cookies By Name");
        driver.manage().deleteCookieNamed("Google");


    }






    }


