package com.hanlin.service;

import org.springframework.stereotype.Service;

import com.hanlin.pojo.stock;



@Service
public interface RedisService {

	void buy(int stockId);

	void add(stock s);
	
	
}
