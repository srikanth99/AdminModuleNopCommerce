package com.nopCommercePOM;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ahmad on 19/01/2015.
 */
public class AdminLoginTest {
    static WebDriver driver;
    static Utils utils;

    @BeforeClass
    public static void before()
    {
        driver = new FirefoxDriver();
        driver.get("http://admin-demo.nopcommerce.com/login?ReturnUrl=%2fadmin%2f");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void adminLogin()
    {
        LoginPage l = new LoginPage(driver);
        l.login("admin@yourstore.com","admin");
        Utils.waitForFiveSeconds();

        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Logged in as: admin@yourStore.com"));

        HomePage home = new HomePage(driver);
        home.navToProducts();
        ManageProductsPage manage = new ManageProductsPage(driver);
        manage.addNewProduct();
        AddProductPage addProduct = new AddProductPage(driver);
        addProduct.addProduct();
        Utils.waitForFiveSeconds();
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("The new product has been added successfully."));
        Utils.waitForFiveSeconds();
        manage.searchProduct();
        Utils.waitForFiveSeconds();

        manage.editProduct();
        Utils.waitForFiveSeconds();
        //manage.deleteProduct();
        //Utils.waitForFiveSeconds();
    }

    @AfterClass
    public static void quitBrowser()
    {
        driver.quit();
    }


}
