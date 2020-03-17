package com.wdy.seata.service.impl;

import com.wdy.seata.dao.AccountDao;
import com.wdy.seata.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * 账户业务实现类
 *
 * @author zzyy
 * @date 2020/3/8 15:56
 **/
@Service
@Slf4j
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountDao accountDao;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        log.info("*******->account-service中扣减账户余额开始");
        // 模拟异常,全局事务回滚
        int i = 1/0;
        accountDao.decrease(userId, money);
        log.info("*******->account-service中扣减账户余额结束");
    }
}