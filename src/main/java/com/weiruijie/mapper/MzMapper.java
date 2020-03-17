package com.weiruijie.mapper;

import java.util.List;

import com.weiruijie.pojo.Mz;

public interface MzMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Mz record);

    int insertSelective(Mz record);

    Mz selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Mz record);

    int updateByPrimaryKey(Mz record);

	List<Mz> minzu();
}