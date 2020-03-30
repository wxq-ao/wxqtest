package com.wxqtest.testNG.suite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void TaoBaoLogin(){
        System.out.println("淘宝登陆成功");

    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass执行");
    }

    @AfterClass
    public  void afterClass(){
        System.out.println("afterClass执行");
    }
}
