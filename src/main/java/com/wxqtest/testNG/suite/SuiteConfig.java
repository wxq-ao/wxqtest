package com.wxqtest.testNG.suite;

import org.testng.annotations.*;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite执行");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("afterSuite执行");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest执行");
    }

    @AfterTest
    public  void afterTest(){
        System.out.println("afterTest执行");
    }
//    @BeforeClass
//    public void beforeClass(){
//        System.out.println("beforeClass执行");
//    }
//
//    @AfterClass
//    public  void afterClass(){
//        System.out.println("afterClass执行");
//    }



}
