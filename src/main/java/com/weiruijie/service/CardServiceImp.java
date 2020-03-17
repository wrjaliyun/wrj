package com.weiruijie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weiruijie.mapper.CardMapper;
import com.weiruijie.mapper.DistrictMapper;
import com.weiruijie.mapper.MzMapper;
import com.weiruijie.pojo.Card;
import com.weiruijie.pojo.District;
import com.weiruijie.pojo.Mz;
@Service
public class CardServiceImp implements CardService{

	@Autowired
	private CardMapper cardMapper;
	
	@Autowired
	private DistrictMapper districtMapper;
	
	@Autowired
	private MzMapper mzMapper;
	
	@Override
	public int add(Card card) {
		// TODO Auto-generated method stub
		int re = 0;
		
		if(card.getId() ==null) {
			re = cardMapper.insertSelective(card);
		}else {
			re = cardMapper.updateByPrimaryKeySelective(card);
		}
		
		return re;
	}

	@Override
	public List<District> city(Integer pid) {
		// TODO Auto-generated method stub
		return districtMapper.city(pid);
	}

	@Override
	public List<Mz> minzu() {
		// TODO Auto-generated method stub
		return mzMapper.minzu();
	}

	@Override
	public List<Card> getlist(Card card) {
		// TODO Auto-generated method stub
		return cardMapper.getlist(card);
	}

	@Override
	public int del(Integer[] ids) {
		// TODO Auto-generated method stub
		return cardMapper.del(ids);
	}

}
