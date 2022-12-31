package com.naveen.JSPFilters.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.naveen.JSPFilters.filters.JWTFilter;

@org.springframework.context.annotation.Configuration
public class Configuration {
	
	 @Bean
	    public FilterRegistrationBean requestJWTFilter() {
	        JWTFilter jwtFilter=new JWTFilter();
	        final FilterRegistrationBean reg = new FilterRegistrationBean(jwtFilter);
	        reg.addUrlPatterns("/*");
	        reg.setOrder(1); //defines filter execution order
	        return reg;
	    }
	
}
