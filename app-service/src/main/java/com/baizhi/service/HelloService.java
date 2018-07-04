package com.baizhi.service;

import com.baizhi.dao.HelloDAO;

/**
 * Created by LIU on 2018/7/4.
 */
public class HelloService {
    public String sayHelloService(String name){
        HelloDAO helloDAO = new HelloDAO();
        return helloDAO.sayHello(name);
    }
}
