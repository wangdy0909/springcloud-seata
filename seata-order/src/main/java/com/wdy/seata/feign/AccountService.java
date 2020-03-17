package com.wdy.seata.feign;

import com.wdy.seata.common.JsonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author wangdy
 * @date 2020/3/17 11:35
 */
@FeignClient(value = "seata-account-service")
public interface AccountService {
    /**
     * 减余额
     *
     * @param userId
     * @param money
     * @return
     */
    @PostMapping(value = "account/decrease")
    JsonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}