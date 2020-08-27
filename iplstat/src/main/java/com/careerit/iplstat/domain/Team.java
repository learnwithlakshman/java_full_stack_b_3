package com.careerit.iplstat.domain;

import java.util.List;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Team {
	
		@Id
		private String id;
		private String label;
		private String name;
		private String city;
		private String home;
		private String coach;
		private List<Player> players;
		
}
