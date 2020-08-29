package com.careerit.iplstat.dao;

import java.util.List;

import com.careerit.iplstat.domain.Player;
import com.careerit.iplstat.domain.Team;

public interface IplTeamDao {
	
	public Team saveTeam(Team team);
	public Team updateTeam(Team team);
	public Team getTeamById(String id);
	public boolean deleteTeam(String id);
	public Player savePlayer(String teamId,Player player);
	public Player updatePlayer(String teamId,Player player);
	public boolean  deletePlayer(String teamId,String playerName);
	public List<Team> getAllTeams();
}
