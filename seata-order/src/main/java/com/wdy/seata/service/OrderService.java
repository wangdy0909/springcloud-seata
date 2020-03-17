package com.wdy.seata.service;


import com.wdy.seata.entity.Order;

/**
 * @author wangdy
 * @date 2020/3/9 13:55
 **/
public interface OrderService {
    /**
     * 创建订单
     * @param order
     */
    void create(Order order);
}