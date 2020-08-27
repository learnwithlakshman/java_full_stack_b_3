package com.careerit.iplstat.service;

import java.util.List;

import com.careerit.iplstat.dto.LabelDTO;
import com.careerit.iplstat.dto.PlayerDTO;
import com.careerit.iplstat.dto.RoleCountDTO;

public interface IplstatService {
	
		public LabelDTO getTeamLabels();
		public List<PlayerDTO> getPlayersByTeam(String label);
		public List<RoleCountDTO> getPlayersCountByRole(String label);
		public List<PlayerDTO> getPlayerByTeamAndRole(String label,String role);
}
