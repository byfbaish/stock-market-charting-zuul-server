package com.FTD.stockmarketchartingzuulserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class StockMarketChartingZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockMarketChartingZuulServerApplication.class, args);
	}

}
