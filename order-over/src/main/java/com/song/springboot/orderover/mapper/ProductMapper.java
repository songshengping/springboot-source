package com.song.springboot.orderover.mapper;

import com.song.springboot.orderover.model.Product;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    int updateProductCount(@Param("id") Integer id, @Param("buyCount")Integer buyCount, @Param("updateUser")String updateUser, @Param("updateTime")Date updateTime);
}