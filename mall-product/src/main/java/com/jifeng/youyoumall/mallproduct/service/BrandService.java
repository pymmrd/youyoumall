package com.jifeng.youyoumall.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jifeng.common.utils.PageUtils;
import com.jifeng.youyoumall.mallproduct.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author jifeng
 * @email jifeng
 * @date 2022-03-27 20:55:48
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

