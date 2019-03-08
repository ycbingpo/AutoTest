package com.course.testng.suite;

import org.testng.annotations.*;

public class suiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite 套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite 套件");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest 之前");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("afterTest 之后");
    }
}
