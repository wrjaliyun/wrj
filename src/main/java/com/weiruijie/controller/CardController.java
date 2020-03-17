package com.weiruijie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.weiruijie.pojo.Card;
import com.weiruijie.pojo.District;
import com.weiruijie.pojo.Mz;
import com.weiruijie.service.CardService;


@RestController
public class CardController {
	@Autowired
	private CardService cardService;
	
	@RequestMapping("/save")
	public int add(@RequestBody Card card) {
		
		return cardService.add(card);
				
	}
	//taskkill /im nginx.exe /f  //杀死进程
	@RequestMapping("/city")
	public List<District> city(Integer pid) {
		
		if(pid==null) {
			pid = 0;
		}	
		return cardService.city(pid);			
	}
	
	@RequestMapping("/minzu")
	public List<Mz> minzu() {
		
		
		return cardService.minzu();			
	}
	
	@RequestMapping("/del")
	public int del(@RequestBody Integer[] ids) {
		
		
		return cardService.del(ids);			
	}
	
	
	@RequestMapping("/list")
	public PageInfo<Card> getlist(@RequestParam(defaultValue="1")Integer pageNum,Card card) {
		
		PageHelper.startPage(pageNum,3);
		
		
		List<Card> list = cardService.getlist(card);
		
		
		PageInfo<Card> pageInfo = new PageInfo<Card>(list);
		
		return pageInfo;
	}
}
