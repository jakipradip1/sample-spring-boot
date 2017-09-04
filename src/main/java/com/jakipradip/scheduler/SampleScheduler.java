package com.jakipradip.scheduler;

import org.springframework.scheduling.annotation.Scheduled;

import com.jakipradip.sampleSpringBoot.SampleAppConfig;

public class SampleScheduler {
	private SampleAppConfig sampleAppConfig;

	public SampleScheduler(SampleAppConfig sampleAppConfig) {
		this.sampleAppConfig = sampleAppConfig;
	}
	
	@Scheduled(fixedRate = 3000)
	public void printUserDetails(){
		System.out.println(sampleAppConfig);
	}
	
	
}
