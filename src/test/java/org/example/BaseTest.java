package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils{

    BrowserManager browserManager = new BrowserManager ();


    @BeforeMethod

    public void setUp(){
        browserManager.OpenBroweser ();
    }

   // @AfterMethod
   // public void tearDown(){
    //    browserManager.close ();

    }




