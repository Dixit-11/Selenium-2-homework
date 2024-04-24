package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Utils {
    public void OpenBroweser() {
        driver = new ChromeDriver ();
        driver.manage ().timeouts ().implicitlyWait ( 30, TimeUnit.SECONDS );
        driver.manage ().window ().maximize ();
        //type URL
        driver.get ( "https://demo.nopcommerce.com/" );

        }
        //public void close(){

       // driver.quit ();
        }







