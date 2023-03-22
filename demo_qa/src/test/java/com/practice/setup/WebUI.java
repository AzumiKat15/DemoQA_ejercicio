package com.practice.setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.rmi.dgc.Lease;

import static com.google.common.base.StandardSystemProperty.USER_DIR;
import static com.practice.setup.ConstantSetup.DEMO_QA_URL;
import static com.practice.util.Log4j.LOG4J_PROPERTIES_FILE_PATH;

public class WebUI {


    protected WebDriver driver;



    private void setUpWebDriver() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(co);

    }
    private void setUpWebDriverUrl (){

        this. driver.get(DEMO_QA_URL);
        this.maximize();

    }
    protected void generalSetUp(){
        setUplog4j();
        setUpWebDriver();
        setUpWebDriverUrl();
    }

    protected void quiteDriver(){

        driver.quit();
    }

    private void maximize(){

        driver.manage().window().maximize();
    }

    private void setUplog4j(){

        PropertyConfigurator.configure(USER_DIR.value () + LOG4J_PROPERTIES_FILE_PATH.getValue());


    }


}
