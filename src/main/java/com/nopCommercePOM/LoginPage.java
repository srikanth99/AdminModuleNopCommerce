package com.nopCommercePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ahmad on 19/01/2015.
 */
public class LoginPage  extends BaseClass{
    public LoginPage(WebDriver driver)
    {
        super(driver);
    }
    public void login(String username,String password)
    {
        driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Email")).sendKeys(username);
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.cssSelector("input.button-1.login-button")).click();

    }

    public void logout()
    {
        driver.findElement(By.id("welcome")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Logout")).click();

    }
}
