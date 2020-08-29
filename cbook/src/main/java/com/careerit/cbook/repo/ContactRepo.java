package com.careerit.cbook.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.careerit.cbook.domain.Contact;

public interface ContactRepo extends MongoRepository<Contact, String>{

			
}
