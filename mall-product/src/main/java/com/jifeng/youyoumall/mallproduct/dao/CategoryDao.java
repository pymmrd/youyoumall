package com.jifeng.youyoumall.mallproduct.dao;

import com.jifeng.youyoumall.mallproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author jifeng
 * @email jifeng
 * @date 2022-03-27 20:55:48
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
