package com.wdy.seata.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wdy.seata.entity.Order;
import org.apache.ibatis.annotations.Param;

/**
 * @author wangdy
 * @date 2020/3/9 13:55
 **/
public interface OrderDao  extends BaseMapper<Order> {
    /**
     * 1 新建订单
     * @param order
     * @return
     */
    int create(Order order);

    /**
     * 2 修改订单状态,从0改为1
     * @param userId
     * @param status
     * @return
     */
    int update(@Param("userId") Long userId,@Param("status") Integer status);
}