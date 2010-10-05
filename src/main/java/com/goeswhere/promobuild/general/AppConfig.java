package com.goeswhere.promobuild.general;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.goeswhere.pro18n.Procralisation;

@Configuration
public class AppConfig {
	@Bean
	public UiMsg uiMsg() {
		return Procralisation.make(UiMsg.class);
	}
}
