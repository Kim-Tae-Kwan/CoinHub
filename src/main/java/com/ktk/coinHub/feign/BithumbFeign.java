package com.ktk.coinHub.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.ktk.coinHub.model.BithumbPriceResponse;
import com.ktk.coinHub.model.UpbitCoinPrice;

@FeignClient(name = "bithumb", url = "https://api.bithumb.com/public", configuration = TestFeignClientConfiguration.class)
public interface BithumbFeign {

	@GetMapping("/ticker/{coin}")
	BithumbPriceResponse getCoinPrice(@PathVariable("coin") String coin);
}
