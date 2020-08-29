package com.careerit.iplstat.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.careerit.iplstat.domain.Team;

public interface IplTeamRepo extends MongoRepository<Team,String> {
	
			
}
