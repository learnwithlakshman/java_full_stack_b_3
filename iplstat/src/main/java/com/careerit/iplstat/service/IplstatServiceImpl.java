package com.careerit.iplstat.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.careerit.iplstat.dao.IplstatDao;
import com.careerit.iplstat.dao.IplstatDaoImpl;
import com.careerit.iplstat.dto.LabelDTO;
import com.careerit.iplstat.dto.PlayerDTO;
import com.careerit.iplstat.dto.RoleCountDTO;

@Service
public class IplstatServiceImpl implements IplstatService {
	private Logger log = LoggerFactory.getLogger(IplstatDaoImpl.class);
	
	@Autowired
	private IplstatDao iplstatDao;

	@Override
	public LabelDTO getTeamLabels() {
		LabelDTO labelDto = iplstatDao.findTeamLabels();
		log.info("Team label details:{}", labelDto.getLabels());
		return labelDto;
	}

	@Override
	public List<PlayerDTO> getPlayersByTeam(String label) {
		Assert.notNull(label, "Label name can't be empty or null");
		List<PlayerDTO> playersList = iplstatDao.findPlayersByTeam(label);
		log.info("Player count for the team {} is {}",label,playersList.size());
		return playersList;
	}

	@Override
	public List<RoleCountDTO> getPlayersCountByRole(String label) {
		Assert.notNull(label, "Label name can't be empty or null");
		List<RoleCountDTO> roleCountList = iplstatDao.findPlayersCountByRole(label);
		log.info("Roles count {} for team {} ",roleCountList.size(),label);
		return roleCountList;
	}

	@Override
	public List<PlayerDTO> getPlayerByTeamAndRole(String label, String role) {
		Assert.notNull(label, "Label name can't be empty or null");
		Assert.notNull(role, "Role name can't be empty or null");
		List<PlayerDTO> playersList = iplstatDao.findPlayerByTeamAndRole(label, role);
		log.info("Player count for the team {} and role {} is {}",label,role,playersList.size());
		return playersList;
	}

}
