package com.jakipradip.sampleSpringBoot;

import java.io.IOException;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
public class SamplePropertyConfig {
	@Bean
	public PropertyPlaceholderConfigurer propertyPlaceholderConfigurer() throws IOException {
		PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
		ppc.setLocations(new ClassPathResource("myapp.properties"));
		ppc.setIgnoreUnresolvablePlaceholders(true);
		return ppc;
	}
}
