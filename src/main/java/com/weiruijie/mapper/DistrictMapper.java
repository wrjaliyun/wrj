package com.weiruijie.mapper;

import java.util.List;

import com.weiruijie.pojo.District;

public interface DistrictMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(District record);

    int insertSelective(District record);

    District selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(District record);

    int updateByPrimaryKey(District record);

	List<District> city(Integer pid);
}