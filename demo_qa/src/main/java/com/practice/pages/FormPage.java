package com.practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormPage  extends  CommonActionOnPages{

    private  final By name = By.id("firstName");
    private  final By lastname = By.id("lastName");


    public FormPage(WebDriver driver) {
        super(driver);
    }

    public  void fillMandatoryFields() {

        clearText(name);
        typeInto(name, "pedro");
        clearText(lastname);
        typeInto(lastname, "Diaz");


    }


}
