package com.wdy.seata.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wdy.seata.entity.Storage;
import org.apache.ibatis.annotations.Param;

/**
 * @author wangdy
 * @date 2020/3/17 14:42
 **/
public interface StorageDao extends BaseMapper<Storage> {

    /**
     * 减库存
     * @param productId
     * @param count
     * @return
     */
    int decrease(@Param("productId") Long productId, @Param("count") Integer count);
}