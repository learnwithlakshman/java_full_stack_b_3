package com.careerit.iplstat.service;

import java.util.List;

import com.careerit.iplstat.dto.PlayerDTO;
import com.careerit.iplstat.dto.TeamDTO;

public interface IplTeamService {

			public TeamDTO addTeam(TeamDTO teamDTO);
			public TeamDTO updateTeam(TeamDTO teamDTO);
			public TeamDTO getTeamById(String id);
			public boolean deleteTeam(String id);
			public PlayerDTO addPlayer(String teamId,PlayerDTO playerDTO);
			public PlayerDTO updatePlayer(String teamId,PlayerDTO playerDTO);
			public boolean  deletePlayer(String teamId,String playerName);
			public List<TeamDTO> getAllTeams();
}
