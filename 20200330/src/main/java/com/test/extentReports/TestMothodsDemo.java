package com.test.extentReports;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMothodsDemo {

    @Test
    public void test1(){
        System.out.println("报告测试01");
    }

    @Test
    public void test2(){
        Assert.assertEquals(1,1);
    }

    @Test
    public void test3(){
        Assert.assertEquals("aa","bb");
    }

    @Test
    public void test4(){
        Reporter.log("这是自己输出的日志");
        throw new RuntimeException();
    }
}
