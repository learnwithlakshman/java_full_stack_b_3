package com.careerit.iplstat.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

import com.careerit.iplstat.domain.Player;
import com.careerit.iplstat.domain.Team;
import com.careerit.iplstat.repo.IplTeamRepo;

@Repository
public class IplTeamDaoImpl implements IplTeamDao {

	private MongoOperations mongoOperations;
	private IplTeamRepo iplTeamRepo;

	@Autowired
	public IplTeamDaoImpl(MongoOperations mongoOperations, IplTeamRepo iplTeamRepo) {
		this.mongoOperations = mongoOperations;
		this.iplTeamRepo = iplTeamRepo;
	}

	@Override
	public Team saveTeam(Team team) {
		return iplTeamRepo.save(team);
	}

	@Override
	public Team updateTeam(Team team) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Team getTeamById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteTeam(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Player savePlayer(String teamId, Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player updatePlayer(String teamId, Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deletePlayer(String teamId, String playerName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Team> getAllTeams() {
		return iplTeamRepo.findAll();
	}

}
