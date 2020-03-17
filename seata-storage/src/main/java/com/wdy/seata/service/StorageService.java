package com.wdy.seata.service;

/**
 * @author wangdy
 * @date 2020/3/17 14:42
 **/
public interface StorageService {
    /**
     * 减库存
     *
     * @param productId
     * @param count
     * @return
     */
    void decrease(Long productId, Integer count);
}