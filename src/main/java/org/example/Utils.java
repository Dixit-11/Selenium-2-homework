package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

// Add all the public static void or public void Method Here in Utils
// All this method are for reusable
public class Utils extends BasePage {
    public static void clickonElement(By by) {
        driver.findElement ( by ).click ();
    }
    public static void typeText(By by, String text) {
        driver.findElement ( by ).sendKeys ( text );
    }
    public static String getTextFromElement(By by) {
        return driver.findElement ( by ).getText ();
    }
    public static String randomDate() {
        DateFormat dateFormat = new SimpleDateFormat ( "ddmmyyyyhhmmss" );
        Date date = new Date ();
        return dateFormat.format ( date );
    }
    public static void selectbyVisibleText(By by, String text ) {
        Select select = new Select ( driver.findElement ( by ) );
        select.selectByVisibleText ( text );
    }
    public static void waitUntilElementIsVisible(int time,By by){
        WebDriverWait wait = new WebDriverWait ( driver, Duration.ofSeconds ( time ));
        wait.until ( ExpectedConditions.visibilityOfElementLocated (by));
    }
    public static void waitUntilElementIsClickable(int time,By by) {
        WebDriverWait wait = new WebDriverWait ( driver, Duration.ofSeconds ( time ) );
        wait.until ( ExpectedConditions.elementToBeClickable ( by ) );
    }
    public static void selectByIndex(By by, int index){
        Select select = new Select ( driver.findElement ( by ));
        select.selectByIndex ( index );
    }
    public static void selcetByValue(By by, String text){
        Select select = new Select ( driver.findElement ( by ));
        select.selectByValue ( text );
    }
    public static void explicitWaitMethod(By by)
    {
       WebElement driverWait = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(by));
    }

}
