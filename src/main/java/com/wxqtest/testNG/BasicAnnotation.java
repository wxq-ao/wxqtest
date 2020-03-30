package com.wxqtest.testNG;

import org.testng.annotations.*;

public class BasicAnnotation {

    //用来把方法标记为测试的一部分。最基本的注解
    @Test
    public  void  testCase1(){
        System.out.println("第一个testng注解");
    }

    @Test
    public  void  testCase2(){
        System.out.println("第二个testng注解");
    }

    //该注解是在执行测试类之前运行
    @BeforeMethod
    public  void  beforeMethod(){
        System.out.println("测试之前运行");
    }

    @AfterMethod
    public void  afterMethod(){
        System.out.println("afterMethod测试之后运行");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("在测试方法运行之前进行执行");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("在测试方法运行之后执行");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite类运行前执行");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite类运行后执行");
    }

}
