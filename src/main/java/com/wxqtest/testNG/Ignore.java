package com.wxqtest.testNG;

import org.testng.annotations.Test;

public class Ignore {

    @Test
    public void ignoreTest01(){

        System.out.println("不忽略");
    }

    @Test(enabled = false)
    public void ignoreTest02(){
        System.out.println("忽略");
    }

    @Test(enabled = true)
    public void ignoreTest03(){
        System.out.println("不忽略");
    }
}
