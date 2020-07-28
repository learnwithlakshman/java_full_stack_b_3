package com.lwl.ipl.domain;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Team {

		private String name;
		private String label;
		private String coach;
		private String city;
		private String home;
		private List<Player> players;
}
