package org.example;

import org.openqa.selenium.By;

public class ProductReferingToFriend extends Utils{

    public void referProductToFriend(){
        // Click on product to refer
        clickonElement ( By.xpath ("//img[@title='Show details for Apple MacBook Pro 13-inch']"));
        //Click on email friend
        clickonElement (By.xpath("//button[normalize-space()='Email a friend']"));
        //Entre the friend email
        typeText(By.xpath("//input[@id='FriendEmail']"), "ddss@gmail.com");
        //Click on send email button
        clickonElement (By.xpath("//button[normalize-space()='Send email']"));



    }
}
