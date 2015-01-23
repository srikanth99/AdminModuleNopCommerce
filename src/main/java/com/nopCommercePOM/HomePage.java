package com.nopCommercePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ahmad on 19/01/2015.
 */
public class HomePage extends BaseClass {
    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    public void navToProducts()
    {
         WebElement catalog = driver.findElement(By.xpath("//*[@id='admin-menu']/li[2]/span"));
        Actions action = new Actions(driver);
        action.moveToElement(catalog).perform();
        Utils.waitForFiveSeconds();

        WebElement products = driver.findElement(By.xpath("//*[@id='admin-menu']/li[2]/div/ul/li[3]/span"));
        action.moveToElement(products).perform();
        Utils.waitForFiveSeconds();

        WebElement manageProducts = driver.findElement(By.xpath("//*[@id='admin-menu']/li[2]/div/ul/li[3]/div/ul/li[1]/a"));
        action.click(manageProducts).perform();
        Utils.waitForFiveSeconds();
    }

    public void logout()
    {
        driver.findElement(By.linkText("Logout?")).click();

        //Assert.assertEquals("Welcome, Please Sign In!", driver.findElement(By.cssSelector("h1")).getText());
    }
}
