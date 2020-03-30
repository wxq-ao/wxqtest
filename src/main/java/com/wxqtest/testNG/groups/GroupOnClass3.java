package com.wxqtest.testNG.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupOnClass3 {

    public  void tracher01(){
        System.out.println("GroupOnClass3---tracher01");
    }

    public  void tracher02(){
        System.out.println("GroupOnClass3---tracher02");
    }
}
