package com.careerit.iplstat.dao;

import java.util.List;

import com.careerit.iplstat.dto.LabelDTO;
import com.careerit.iplstat.dto.PlayerDTO;
import com.careerit.iplstat.dto.RoleCountDTO;

public interface IplstatDao {
	
	public LabelDTO findTeamLabels();
	public List<PlayerDTO> findPlayersByTeam(String label);
	public List<RoleCountDTO> findPlayersCountByRole(String label);
	public List<PlayerDTO> findPlayerByTeamAndRole(String label,String role);
}
