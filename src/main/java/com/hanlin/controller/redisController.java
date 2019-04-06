package com.hanlin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hanlin.pojo.stock;
import com.hanlin.service.RedisService;


@Controller
public class redisController {

	@Autowired RedisService RedisService;
	
	//@GetMapping
	//@RequestMapping("buy")
	@GetMapping("buy")
    public @ResponseBody String buy (Integer stockId) {
		
		System.out.println("ok");
		RedisService.buy(stockId);
        return "OK";
    }
	@RequestMapping("ssp")
 public @ResponseBody String ssp(Integer stockId) {
		System.out.println("ok");
		RedisService.buy(stockId);
        return "OK";
    }
	@RequestMapping("add")
	public @ResponseBody String add(stock s) {
		System.out.println(s.getName());
		System.out.println("ok");
		RedisService.add(s);
		return "index";
	}
}
