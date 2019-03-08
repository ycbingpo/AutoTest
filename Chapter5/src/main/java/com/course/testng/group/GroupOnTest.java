package com.course.testng.group;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupOnTest {
    @Test(groups = "server")
    public void server1(){
        System.out.println("这是服务端  server1");
    }
    @Test(groups = "server")
    public void server2(){
        System.out.println("这是服务端  server2");
    }
    @Test(groups = "client")
    public void client1(){
        System.out.println("这是服务端  client1");
    }
    @Test(groups = "client")
    public void client2(){
        System.out.println("这是服务端  client2");
    }
    @BeforeGroups("server")
    public void groupServer1(){
        System.out.println("分组 server  开始！！！！");
    }
    @AfterGroups("server")
    public void groupServer2(){
        System.out.println("分组 server  结束！！！！");
    }

    @BeforeGroups("client")
    public void groupServer3(){
        System.out.println("分组 client  开始！！！！");
    }
    @AfterGroups("client")
    public void groupServer4(){
        System.out.println("分组 client  结束！！！！");
    }
}
