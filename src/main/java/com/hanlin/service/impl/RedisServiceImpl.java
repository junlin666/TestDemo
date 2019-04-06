package com.hanlin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hanlin.mapper.stockMapper;
import com.hanlin.pojo.stock;
import com.hanlin.service.RedisService;

@Service
@Transactional
public class RedisServiceImpl implements RedisService {

	
	@Autowired stockMapper sstockMapper;
	
	@Override
	public void buy(int stockId) {
		sstockMapper.buy(stockId);
	}

	@Override
	public void add(stock s) {
		sstockMapper.insertSelective(s);
	}

}
