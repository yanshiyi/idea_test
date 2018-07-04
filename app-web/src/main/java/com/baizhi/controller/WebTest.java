package com.baizhi.controller;

import com.baizhi.service.HelloService;

/**
 * Created by LIU on 2018/7/4.
 */
public class WebTest {
    public static void main(String[] args) {
        HelloService helloService = new HelloService();

        String sayHelloService = helloService.sayHelloService("zs");

        System.out.println(sayHelloService);
    }
}
