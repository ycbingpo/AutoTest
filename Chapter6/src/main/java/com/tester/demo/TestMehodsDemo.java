package com.tester.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMehodsDemo {
    @Test
    public void test1(){
        Assert.assertEquals(1,2);
    }
    @Test
    public void test2(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void test3(){
        Assert.assertEquals("aaaa","aaaa");
    }
    @Test
    public void logDemo(){
        Reporter.log("这是我们自己的运行异常");
        throw new RuntimeException("运行异常");
    }
}
