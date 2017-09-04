package com.jakipradip.sampleSpringBoot;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import com.jakipradip.scheduler.SampleScheduler;

@Configuration
@EnableScheduling
@Import({SampleAppConfig.class})
public class SampleSchedulingConfig implements SchedulingConfigurer {

	@Autowired
	private SampleAppConfig sampleAppConfig;
	
	@Bean
	public SampleScheduler configureScheduler(){
		return new SampleScheduler(sampleAppConfig);
	}
	
	@Override
	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
		taskRegistrar.setScheduler(taskExecutor());
	}
	
	@Bean(destroyMethod = "shutdown")
	public Executor taskExecutor(){
		return Executors.newScheduledThreadPool(10);
	}
}
