package com.weiruijie.service;

import java.util.List;

import com.weiruijie.pojo.Card;
import com.weiruijie.pojo.District;
import com.weiruijie.pojo.Mz;

public interface CardService {

	int add(Card card);

	List<District> city(Integer pid);

	List<Mz> minzu();

	List<Card> getlist(Card card);

	int del(Integer[] ids);

}
