package com.jakipradip.sampleSpringBoot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
@DependsOn(value=("samplePropertyConfig"))
public class SampleAppConfig {
	
	@Value("${jms.userName}")
	private String userName;
	@Value("${jms.password}")
	private String password;
	@Value("${jms.url}")
	private String url;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "SampleAppConfig [userName=" + userName + ", password=" + password + ", url=" + url + "]";
	}
	
	
}
