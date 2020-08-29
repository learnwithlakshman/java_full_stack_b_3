package com.careerit.iplstat.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.careerit.iplstat.dao.IplTeamDao;
import com.careerit.iplstat.domain.Team;
import com.careerit.iplstat.dto.PlayerDTO;
import com.careerit.iplstat.dto.TeamDTO;

@Service
public class IplTeamServiceImpl implements IplTeamService {

	private Logger log = LoggerFactory.getLogger(IplTeamServiceImpl.class);
	private IplTeamDao iplTeamDao;
	private ModelMapper modelMapper;

	@Autowired
	public IplTeamServiceImpl(IplTeamDao iplTeamDao, ModelMapper modelMapper) {
		this.iplTeamDao = iplTeamDao;
		this.modelMapper = modelMapper;
	}

	@Override
	public TeamDTO addTeam(TeamDTO teamDTO) {
		Assert.notNull(teamDTO, "Team Details can't be empty or null");
		Team team = modelMapper.map(teamDTO, Team.class);
		Team savedTeam = iplTeamDao.saveTeam(team);
		log.info("Team saved with id:{}", savedTeam != null ? savedTeam.getId() : null);
		teamDTO = modelMapper.map(savedTeam, TeamDTO.class);
		return teamDTO;
	}

	@Override
	public TeamDTO updateTeam(TeamDTO teamDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TeamDTO getTeamById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteTeam(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PlayerDTO addPlayer(String teamId, PlayerDTO playerDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PlayerDTO updatePlayer(String teamId, PlayerDTO playerDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deletePlayer(String teamId, String playerName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<TeamDTO> getAllTeams() {
		List<Team> teams = iplTeamDao.getAllTeams();
		List<TeamDTO> list = teams.stream().map(e -> modelMapper.map(e, TeamDTO.class)).collect(Collectors.toList());
		log.info("Total teams found in DB:{}", teams.size());
		return list;
	}

}
