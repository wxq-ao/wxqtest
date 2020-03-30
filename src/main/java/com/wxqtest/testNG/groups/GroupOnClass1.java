package com.wxqtest.testNG.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupOnClass1 {

    public  void stu01(){
        System.out.println("GroupOnClass1---stu01");
    }

    public  void stu02(){
        System.out.println("GroupOnClass1---stu02");
    }
}
