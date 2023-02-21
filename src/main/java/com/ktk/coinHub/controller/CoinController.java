package com.ktk.coinHub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ktk.coinHub.service.CoinService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/coin")
@RequiredArgsConstructor
public class CoinController {
	
	private final CoinService coinService;
	
	@GetMapping("/price")
	public String getPrice(@RequestParam String market, @RequestParam String coinName) {
		return coinService.getPrice(market, coinName);
	}
}	
