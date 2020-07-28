package com.lwl.ipl.service;

import java.util.List;
import java.util.Map;

import com.lwl.ipl.dto.PlayerDTO;
import com.lwl.ipl.dto.RoleCountDTO;
import com.lwl.ipl.dto.TeamAmountByRoleDTO;
import com.lwl.ipl.dto.TeamAmountDTO;
import com.lwl.ipl.dto.TeamDTO;

public interface TeamStatService {

	List<String> getTeamLabels();

	List<PlayerDTO> getPlayerByTeam(String label);

	List<RoleCountDTO> getCountByRole(String label);

	List<PlayerDTO> getPlayerByTeamAndRole(String label, String role);

	List<TeamDTO> getAllTeamDetails();

	List<TeamAmountDTO> getAmountSpentByTeams();

	List<TeamAmountByRoleDTO> getAmountSpentByTeamAndRole(String label, String role);

	List<PlayerDTO> getPlayersBySort(String fieldName);

	Map<String, List<PlayerDTO>> getMaxPaidPlayersByRole();
}
