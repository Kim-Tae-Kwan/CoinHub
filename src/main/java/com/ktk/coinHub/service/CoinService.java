package com.ktk.coinHub.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CoinService {
	
	private final Map<String, MarketService> marketServices;
	
	public String getPrice(String market, String coinName) {
		String serviceName = market + "Service";
		MarketService marketService = marketServices.get(serviceName);
		
		if(marketService == null) return String.format("%s 은/는 지원하지 않는 시장입니다.", market);
		
		return marketService.getPrice(coinName);
	}
}
