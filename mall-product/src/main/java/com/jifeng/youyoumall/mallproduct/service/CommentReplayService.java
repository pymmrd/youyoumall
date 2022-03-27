package com.jifeng.youyoumall.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jifeng.common.utils.PageUtils;
import com.jifeng.youyoumall.mallproduct.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author jifeng
 * @email jifeng
 * @date 2022-03-27 20:55:48
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

