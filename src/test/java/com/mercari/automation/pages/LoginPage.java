package com.mercari.automation.pages;

import com.mercari.automation.utils.ConfigurationReader;
import com.mercari.automation.utils.Driver;
import com.mercari.automation.utils.MobileUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    //ios - iOSXCUITFindBy
    @AndroidFindBy(id = "SOMEIDHERE")
    private MobileElement getStartedBtn;

    @AndroidFindBy(id = "SOMEIDHERE")
    private MobileElement userNameInput;

    @AndroidFindBy(id = "SOMEIDHERE")
    private MobileElement passwordInput;

    @AndroidFindBy(id = "SOMEIDHERE")
    private MobileElement signInBtn;



    /**
     * this method does login
     */
    public void login(){

        MobileUtils.waitFor(3000);
        userNameInput.sendKeys("email");
        passwordInput.sendKeys("password");
        signInBtn.click();
        MobileUtils.waitFor(3000);
    }

    public void clickGetStarted(){
        MobileUtils.clickWithWait(getStartedBtn);
    }
}
