package com.jay.order.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;
    //订单服务调用会员服务

    @RequestMapping("/getOrder")
    public String gerOrder(){
        String url = "http://app-member/getMember";
        String result = restTemplate.getForObject(url, String.class);
        System.out.println("订单调用会员返回结果："+result);
        return result;
    }

}
