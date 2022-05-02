package com.saucedemo.www.pages;

import com.saucedemo.www.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPages extends Utility {
    By products = By.xpath("//div[@class='header_secondary_container']/span");
    By totalClass=By.xpath("//div[@class='inventory_item']");


    public String verifyProductsTitle() {
        return getTextFromElement(products);
    }
    public int verifyNoOfProducts() {
        List<WebElement> numOfProducts = driver.findElements(totalClass);
        int actNumber = numOfProducts.size();
        return actNumber;

    }
}
