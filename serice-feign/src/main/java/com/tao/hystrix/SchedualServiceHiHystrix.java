package com.tao.hystrix;

import org.springframework.stereotype.Component;

import com.tao.service.SchedualServiceHi;

@Component
public class SchedualServiceHiHystrix implements SchedualServiceHi{

	@Override
	public String sayHiFromClientOne(String name) {
		
		return "熔断方法起效"+name;
	}

}
