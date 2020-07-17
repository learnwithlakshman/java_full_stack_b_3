package com.lwl.cbook.day31;

import java.io.IOException;
import java.util.Properties;

public class PropertiesReading {

		public static void main(String[] args) {
			
			Properties properties = new Properties();
			
			try {
				properties.load(PropertiesReading.class.getResourceAsStream("/application.properties"));
	
				// .properties  <=> yaml/yml
				
				properties.entrySet().forEach(ele->{
					System.out.println(ele.getKey()+" = "+ele.getValue());
				});
				
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
}
