package com.nopCommercePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Ahmad on 19/01/2015.
 */
public class ManageProductsPage extends HomePage{
   public  ManageProductsPage(WebDriver driver)
   {
       super(driver);
   }

public void addNewProduct()
{
    driver.findElement(By.linkText("Add new")).click();
}
   /* public void deleteProduct()
    {
        driver.findElement(By.id("SearchProductName")).clear();
        driver.findElement(By.id("SearchProductName")).sendKeys("FROZEN");
        driver.findElement(By.id("search-products")).click();
        driver.findElement(By.xpath("//*[@id='products-grid']/table/tbody/tr/td[1]/input")).click();
        driver.findElement(By.id("delete-selected"));
    }*/

    public void editProduct()
    {
        driver.findElement(By.id("SearchProductName")).clear();
        driver.findElement(By.id("SearchProductName")).sendKeys("FROZEN");
        driver.findElement(By.id("search-products")).click();
        driver.findElement(By.linkText("Edit")).click();

    }

    public void searchProduct()
    {
        driver.findElement(By.id("SearchProductName")).clear();
        driver.findElement(By.id("SearchProductName")).sendKeys("FROZEN");
        driver.findElement(By.id("search-products")).click();
    }
}
