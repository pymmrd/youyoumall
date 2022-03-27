package com.jifeng.youyoumall.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jifeng.common.utils.PageUtils;
import com.jifeng.youyoumall.mallproduct.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author jifeng
 * @email jifeng
 * @date 2022-03-27 20:55:48
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

