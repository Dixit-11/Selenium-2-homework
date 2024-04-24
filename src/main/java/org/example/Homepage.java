package org.example;

import org.openqa.selenium.By;

public class Homepage extends Utils {
    public void ClickonRegisterbutton(){
        clickonElement ( By.linkText ("Register") );
    }
    public void ClickonLoginPage(){
        clickonElement ( By.className ("ico-login"));
    }
}
