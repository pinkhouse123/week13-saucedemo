package com.saucedemo.www.pages;

import com.saucedemo.www.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By userName=By.id("user-name");
    By password=By.id("password");
    By loginBtn=By.id("login-button");

    public void enterUserName(String name){
        sendTextToElement(userName,name);
    }
    public void enterPassword(String pass){
        sendTextToElement(password,pass);
    }
    public void clickOnLoginBtn(){
        clickOnElement(loginBtn);
    }

}