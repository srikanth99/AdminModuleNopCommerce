package com.nopCommercePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

/**
 * Created by Ahmad on 20/01/2015.
 */
public class AddProductPage extends HomePage {
    public AddProductPage(WebDriver driver)
    {
        super(driver);
    }

    public void addProduct()
    {
        driver.findElement(By.id("Name")).clear();
        driver.findElement(By.id("Name")).sendKeys("FROZEN1");
        driver.findElement(By.id("ShortDescription")).clear();
        driver.findElement(By.id("ShortDescription")).sendKeys("a magical disney story ");
        driver.findElement(By.id("ShowOnHomePage")).click();
        Utils.waitForFiveSeconds();
        driver.findElement(By.xpath("//*[@id='group-prices']/tbody/tr[2]/td[2]/span[1]/span/span/span[1]/span")).click();
        Utils.waitForFiveSeconds();
        driver.findElement(By.xpath("//*[@id='group-prices']/tbody/tr[2]/td[2]/span[1]/span/span/span[1]/span")).click();
        Utils.waitForFiveSeconds();

        driver.findElement(By.name("save")).click();
        Utils.waitForFiveSeconds();
        //driver.findElement(By.linkText("Pictures")).click();
        //Utils.waitForFiveSeconds();
        //driver.findElement(By.xpath("//*[@id='picture1857828210']/div/div[2]/input")).click();
        //Utils.waitForFiveSeconds();
    }
}
