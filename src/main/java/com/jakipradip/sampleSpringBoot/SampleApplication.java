package com.jakipradip.sampleSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = SampleScanMarker.class)
public class SampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SampleApplication.class, args);
		SampleAppConfig appConfig = context.getBean(SampleAppConfig.class);
		System.out.println(appConfig);
	}
}
