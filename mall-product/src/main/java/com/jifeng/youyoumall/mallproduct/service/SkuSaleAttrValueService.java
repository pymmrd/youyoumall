package com.jifeng.youyoumall.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jifeng.common.utils.PageUtils;
import com.jifeng.youyoumall.mallproduct.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author jifeng
 * @email jifeng
 * @date 2022-03-27 20:55:48
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

