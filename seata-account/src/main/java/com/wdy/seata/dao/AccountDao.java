package com.wdy.seata.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wdy.seata.entity.Account;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author zzyy
 * @date 2020/3/8 12:45
 **/
public interface AccountDao extends BaseMapper<Account> {
    /**
     * 扣减账户余额
     *
     * @param userId
     * @param money
     * @return
     */
    int decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}