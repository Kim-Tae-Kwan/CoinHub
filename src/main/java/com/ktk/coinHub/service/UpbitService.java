package com.ktk.coinHub.service;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import org.springframework.stereotype.Service;

import com.ktk.coinHub.feign.UpbitFeign;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UpbitService implements MarketService {
	
	private final UpbitFeign upbitFeign;
	
	@Override
	public String getPrice(String coinName) {
		NumberFormat formatter = new DecimalFormat("0.##");// 소수점 이하 2자리까지만 노출
		
		double currentPrice = upbitFeign.getCoinPrice("KRW-" + coinName).get(0).getTrade_price();
		return formatter.format(new BigDecimal(currentPrice).doubleValue());
	}

}
