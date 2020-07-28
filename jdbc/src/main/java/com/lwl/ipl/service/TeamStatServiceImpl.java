package com.lwl.ipl.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.lwl.ipl.domain.Team;
import com.lwl.ipl.dto.PlayerDTO;
import com.lwl.ipl.dto.RoleCountDTO;
import com.lwl.ipl.dto.TeamAmountByRoleDTO;
import com.lwl.ipl.dto.TeamAmountDTO;
import com.lwl.ipl.dto.TeamDTO;

public class TeamStatServiceImpl implements TeamStatService {

	private String fileName = "/ipl2020.json";
	
	private List<Team> teams;
	
	public TeamStatServiceImpl() {
		teams = TeamStatUtil.loadFromJson(fileName);
	}
	
	
	@Override
	public List<String> getTeamLabels() {
		return teams.stream().map(t->t.getLabel()).collect(Collectors.toList());
	}

	@Override
	public List<PlayerDTO> getPlayerByTeam(String label) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RoleCountDTO> getCountByRole(String label) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerDTO> getPlayerByTeamAndRole(String label, String role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TeamDTO> getAllTeamDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TeamAmountDTO> getAmountSpentByTeams() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TeamAmountByRoleDTO> getAmountSpentByTeamAndRole(String label, String role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerDTO> getPlayersBySort(String fieldName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, List<PlayerDTO>> getMaxPaidPlayersByRole() {
		// TODO Auto-generated method stub
		return null;
	}

}
