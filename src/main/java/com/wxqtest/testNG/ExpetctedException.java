package com.wxqtest.testNG;

import org.junit.rules.ExpectedException;
import org.testng.annotations.Test;

public class ExpetctedException {
    /**
     * 什么时候使用异常测试
     * 期望结果为某一个异常时。
     * 比如：传入不合法的参数，程序抛出了异常，预期结果就是一个异常
     *
     */

    //结果为：失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("失败的异常测试");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSucces(){
        System.out.println("成功的异常测试");
        throw new RuntimeException();
    }

}
