package com.wxqtest.testNG;

import org.testng.annotations.Test;

public class DependsTest {

    @Test
    public void dependsTest01(){
        System.out.println("depends--01");
//        throw new RuntimeException();
    }

    @Test(dependsOnMethods = "dependsTest01")
    public void dependsTest02(){
        System.out.println("depends--02");
    }
}
