package com.wdy.seata.feign;

import com.wdy.seata.common.JsonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wangdy
 * @date 2020/3/17 11:35
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService {
    /**
     * 减库存
     *
     * @param productId
     * @param count
     * @return
     */
    @PostMapping(value = "storage/decrease")
    JsonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}