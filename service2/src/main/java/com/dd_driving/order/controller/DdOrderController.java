package com.dd_driving.order.controller;

import com.dd_driving.order.entity.DdOrder;
import com.dd_driving.order.mapper.DdOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/order")
public class DdOrderController {

//    @Autowired
//    DdOrderService ddOrderService;
    @Autowired
    DdOrderMapper ddOrderMapper;

    @RequestMapping("getOrderById")
    @ResponseBody
    public DdOrder getOrderById() {
        DdOrder ddOrder = ddOrderMapper.selectById(1);
        System.out.println(ddOrder.toString());
        return ddOrder;
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "test";
    }

}
