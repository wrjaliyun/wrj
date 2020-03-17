package com.weiruijie.mapper;

import java.util.List;

import com.weiruijie.pojo.Card;

public interface CardMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Card record);

    int insertSelective(Card record);

    Card selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Card record);

    int updateByPrimaryKey(Card record);

	List<Card> getlist(Card card);

	int del(Integer[] ids);
}