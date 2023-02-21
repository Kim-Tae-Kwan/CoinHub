package com.ktk.coinHub.service;

import org.springframework.stereotype.Service;

import com.ktk.coinHub.feign.BithumbFeign;
import com.ktk.coinHub.model.BithumbPriceResponse;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BithumbService implements MarketService {
	
	private final BithumbFeign bithumbFeign;
	
	@Override
	public String getPrice(String coinName) {
		BithumbPriceResponse res = bithumbFeign.getCoinPrice(coinName);
		return res.getData().getAcc_trade_value();
	}

}
