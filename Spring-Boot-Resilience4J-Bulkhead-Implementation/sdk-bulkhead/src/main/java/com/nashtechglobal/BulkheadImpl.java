package com.nashtechglobal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import java.util.stream.IntStream;

@SpringBootApplication
public class BulkheadImpl {

	public static void main(String[] args) {
		SpringApplication.run(BulkheadImpl.class, args);
		int i=1;
		IntStream.range(i,10).parallel().forEach(t->{
			String response = new RestTemplate().getForObject("http://localhost:8080/order", String.class);
		});
	}

}
