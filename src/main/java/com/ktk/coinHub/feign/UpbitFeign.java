package com.ktk.coinHub.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ktk.coinHub.model.UpbitCoinPrice;

@FeignClient(name = "upbit", url = "https://api.upbit.com/v1", configuration = TestFeignClientConfiguration.class)
public interface UpbitFeign {

	@GetMapping("/ticker")
	List<UpbitCoinPrice> getCoinPrice(@RequestParam("markets") String coin);
}
