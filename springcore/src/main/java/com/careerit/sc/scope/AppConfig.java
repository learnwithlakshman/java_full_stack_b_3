package com.careerit.sc.scope;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
		
		@Bean
		public ContactService contactService(@Qualifier("inMemory") ContactDao contactDao) {
			ContactService contactService=new ContactServiceImpl(contactDao);
			return contactService;
		}
	

		@Bean
		public ContactDao dbImpl() {
			return new ContactDaoImpl(dbConnectionUtil());
		}
		
		@Bean
		public ContactDao inMemory() {
			return new ContactDaoInMemoryImpl();
		}
		
		@Bean
		public DbConnectionUtil dbConnectionUtil() {
			return new DbConnectionUtil();
		}
		
}
