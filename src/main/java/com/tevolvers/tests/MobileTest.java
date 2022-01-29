package com.tevolvers.tests;

import com.tevolvers.drivers.OwnDriver;
import com.tevolvers.pageboject.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.net.MalformedURLException;

import static com.tevolvers.pageboject.Calculator.*;
import static com.tevolvers.pageboject.Calculator.getCalculator;

public class MobileTest {


    @BeforeEach
    public void init() throws MalformedURLException {
        OwnDriver.initDriver();
    }

    @Test
    public void sumTest1() {
        initCalculator();
        getCalculator().clickNumber("24");
        getCalculator().clickOperand("+");
        getCalculator().clickNumber("32");
        Assertions.assertEquals("= 56",getCalculator().getResult());
    }

    @Test
    public void sumTest2() {
        initCalculator();
        getCalculator().clickNumber("24");
        getCalculator().clickOperand("+");
        getCalculator().clickNumber("32");
        Assertions.assertEquals("= 56",getCalculator().getResult());
    }



    @AfterEach
    public void after(){
        OwnDriver.getDriver().quit();
    }
}
