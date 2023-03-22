package com.practice.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonActionOnPages {


    private WebDriver driver;

    public CommonActionOnPages(WebDriver driver) {
        this.driver = driver;
    }

    //funciones

    protected  void  typeInto(By locator, String value){
        driver.findElement(locator).sendKeys(value);
    }

    protected  void  clearText(By locator){
        driver.findElement(locator).clear();;
    }

    protected  void  click(By locator){
        driver.findElement(locator).click();
    }
}
