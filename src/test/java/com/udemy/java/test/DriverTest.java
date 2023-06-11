package com.udemy.java.test;

import com.supplier.DriverFactory;
import com.udemy.java.predicate.Rules;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.sql.Driver;
import java.util.List;
import java.util.function.Predicate;

public class DriverTest {
    private WebDriver driver;

    @BeforeTest
    @Parameters("browser")
    public void setDriver(@Optional("chrome") String browser){
       this.driver = DriverFactory.getDriver(browser);
    }



    @Test
    public void googleTest(){

        //you can take all text from google main page
        this.driver.get("https://google.com/");
        this.driver.findElements(By.tagName("a"))
                .forEach(e -> System.out.println(e.getText()));
    }


    @Test
    public void googleTestForPredicateAndRemoveBlankList(){
        this.driver.get("https://google.com/");
        List<WebElement> elements = this.driver.findElements(By.tagName("a"));

        //it will return with blank size and design
        System.out.println("Before :: " + elements.size());


        //I will call from Rules class
        //we are gettin all the rule //this list if removeIF rule is satisfied

        //  Rules.get().forEach(rule -> elements.removeIf(rule));
            //we can type also like this it will give same result like a above
        Rules.get().forEach(elements::removeIf);


        System.out.println("After :: " + elements.size());
        elements.forEach(e -> System.out.println(e.getText()));
    }

    @AfterTest
    public void quitDriver(){
        this.driver.quit();
    }
}
