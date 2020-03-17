package com.wdy.seata.controller;

import com.wdy.seata.common.JsonResult;
import com.wdy.seata.entity.Order;
import com.wdy.seata.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wangdy
 * @date 2020/3/17 11:35
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("/createOrder")
    public JsonResult createOrder(Order order) {
        orderService.create(order);
        return JsonResult.ok();
    }

}
