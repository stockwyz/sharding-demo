package com.sharding.demo.mapper;

import com.sharding.demo.model.TOrderItem;
import com.sharding.demo.model.TOrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ITOrderItemMapper {
    long countByExample(TOrderItemExample example);

    int deleteByExample(TOrderItemExample example);

    int deleteByPrimaryKey(Long orderItemId);

    int insert(TOrderItem record);

    int insertSelective(TOrderItem record);

    List<TOrderItem> selectByExample(TOrderItemExample example);

    TOrderItem selectByPrimaryKey(Long orderItemId);

    int updateByExampleSelective(@Param("record") TOrderItem record, @Param("example") TOrderItemExample example);

    int updateByExample(@Param("record") TOrderItem record, @Param("example") TOrderItemExample example);

    int updateByPrimaryKeySelective(TOrderItem record);

    int updateByPrimaryKey(TOrderItem record);
}