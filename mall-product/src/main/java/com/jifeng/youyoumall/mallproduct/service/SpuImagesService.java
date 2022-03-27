package com.jifeng.youyoumall.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jifeng.common.utils.PageUtils;
import com.jifeng.youyoumall.mallproduct.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author jifeng
 * @email jifeng
 * @date 2022-03-27 20:55:48
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

