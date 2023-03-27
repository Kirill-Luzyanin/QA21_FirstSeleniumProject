package com.ait.qa21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumLocatorTestsHW {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("remote-allow-origins=*");
        driver = new ChromeDriver(options);

        driver.get("https://ilcarro.web.app/let-car-work");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void startFindLocatorsTestAtHome() {
        driver.findElement(By.id("class"));
        driver.findElement(By.className("hide-div"));
        //driver.findElement(By.className("error")); // не находит.. хотя есть (см. carClass)
        //driver.findElement(By.linkText("Car registration number")); // не работает
    }

    @Test
    public void startFindLocatorsTestCssAtHome() {
        driver.findElement(By.cssSelector("#class"));
        driver.findElement(By.cssSelector(".hide-div"));
        //driver.findElement(By.cssSelector(".error")); // не находит.. хотя есть (см. carClass)
        //driver.findElement(By.cssSelector("[for*='registration']")); // не работает
    }



    @AfterMethod
    public void tearDowm() {
        driver.quit();
    }


}
