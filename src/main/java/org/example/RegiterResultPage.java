package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegiterResultPage extends Utils {
    String expectedMsg = "Your registration completed";

    public void EnterRegitrationisSuccessfull() {
        waitUntilElementIsVisible ( 5,By.className ( "result"  ) );

        String actual = getTextFromElement ( By.className ( "result" ) );
        Assert.assertEquals ( actual, expectedMsg, "You are not registered" );


    }
}


