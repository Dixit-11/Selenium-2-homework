package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import javax.sound.midi.ShortMessage;

public class TestSuite extends BaseTest {

    Homepage homepage = new Homepage ();
    RegisterPage registerPage = new RegisterPage ();
    RegiterResultPage regiterResultPage = new RegiterResultPage ();
    LoginPage loginPage = new LoginPage ();
    ProductReferingToFriend productReferingToFriend = new ProductReferingToFriend ();
    BuildYourOwnComputer buildYourOwnComputer = new BuildYourOwnComputer ();
    AddProductIntoCartResult addProductIntoCartResult = new AddProductIntoCartResult ();

    @Test
    public void verifyUserShouldRegisterSuccessfully(){
        // click on register button
        homepage.ClickonRegisterbutton();
        // Enter Registration details
        registerPage.enterRegistrationdetails ();
        // verify user register Successfully
        regiterResultPage.EnterRegitrationisSuccessfull ();
    }

    @Test

    public  void verifyUserShouldLoginSuccessfully(){
        //click on Login page
        homepage.ClickonLoginPage ();
        loginPage.EnterYourLoginDetails ();
    }

    @Test
    public  void verifyRegisterusershouldReferAProduct(){
        productReferingToFriend.referProductToFriend ();
    }

    @Test
    public void UserShoulbeableToBuildOwnComputer(){
        buildYourOwnComputer.buildAComputer ();

    }
    @Test
    public void verifyUserShoulseeAddtocartMessage(){
        addProductIntoCartResult.VerifyProductNameAsYouAddProductInToCart ();

    }

}

