package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Computers;
import dmacc.beans.OperatingSystem;

/**
 * Larry Paucar - Lpaucar
 * CIS175 -Spring 2024
 * Mar 28, 2024
 */
@Configuration
public class BeanConfiguration {
	
	@Bean
	public Computers computers() {
	Computers bean = new Computers();
	//bean.setBrand("Apple");
	//bean.setModel("Macbook Pro");
	//bean.setProcessor("M3 Pro");
	//bean.setRam(32);
	//bean.setStorage(512.00);
	return bean;
	}
	
	@Bean
	public OperatingSystem operatingSystem() {
		OperatingSystem bean = new OperatingSystem();
		return bean;
	}
}
