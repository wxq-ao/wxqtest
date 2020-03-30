package com.wxqtest.testNG.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupOnMethod {

    @Test(groups = "server")
    public void groupTest01(){
        System.out.println("server组--01");
    }

    @Test(groups = "server")
    public void groupTest02(){
        System.out.println("server组--02");
    }
    @Test(groups = "client")
    public void groupTest03(){
        System.out.println("client组--01");
    }

    @Test(groups = "client")
    public void groupTest04(){
        System.out.println("client组--02");
    }

    @BeforeGroups("server")
    public void beforeGroups(){
        System.out.println("server测试之前");
    }


    @AfterGroups("server")
    public void afterGroups(){
        System.out.println("server测试之后");
    }

}
