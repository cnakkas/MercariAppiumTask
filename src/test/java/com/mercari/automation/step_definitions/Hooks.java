package com.mercari.automation.step_definitions;

import com.mercari.automation.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp() { Driver.getDriver();}

    @After
    public void tearDown() {
        Driver.closeDriver();
    }
}
