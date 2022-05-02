package com.saucedemo.www.testsuite;

import com.saucedemo.www.pages.HomePage;
import com.saucedemo.www.pages.ProductPages;
import com.saucedemo.www.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    HomePage homePage= new HomePage();
    ProductPages productsPage=new ProductPages();
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        homePage.enterUserName("standard_user");
        homePage.enterPassword("secret_sauce");
        homePage.clickOnLoginBtn();
        String actualText=productsPage.verifyProductsTitle();
        String expectedText="PRODUCTS";
        Assert.assertEquals(actualText,expectedText,"Products Text Validation");

    }
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        homePage.enterUserName("standard_user");
        homePage.enterPassword("secret_sauce");
        homePage.clickOnLoginBtn();
        int actualNum=productsPage.verifyNoOfProducts();
        int expectedNum=6;
        Assert.assertEquals(actualNum,expectedNum,"Numbers of products");
    }

}
