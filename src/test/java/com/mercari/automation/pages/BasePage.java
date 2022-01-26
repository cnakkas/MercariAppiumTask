package com.mercari.automation.pages;

import com.mercari.automation.utils.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public abstract class BasePage {

    public BasePage(){
        // in Appium, we need to use AppiumFieldDecorator to enable @FindBY annotations
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }


}

