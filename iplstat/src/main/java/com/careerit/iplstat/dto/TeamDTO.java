package com.careerit.iplstat.dto;

import java.util.ArrayList;
import java.util.List;

import com.careerit.iplstat.domain.Player;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeamDTO {
	
	private String id;
	private String label;
	private String name;
	private String city;
	private String home;
	private String coach;
	private List<Player> players;
}
