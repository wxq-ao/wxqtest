package com.wxqtest.testNG.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupOnClass2 {
    public  void stu01(){
        System.out.println("GroupOnClass2---stu01");
    }

    public  void stu02(){
        System.out.println("GroupOnClass2---stu02");
    }
}
