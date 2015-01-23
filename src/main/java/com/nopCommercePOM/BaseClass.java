package com.nopCommercePOM;

import org.openqa.selenium.WebDriver;

/**
 * Created by Ahmad on 19/01/2015.
 */
public class BaseClass {
    protected WebDriver driver;

    public BaseClass(WebDriver driver)
    {
        this.driver = driver;
    }
}
