package com.careerit.iplstat.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RoleCountDTO> getPlayersCountByRole(String label) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerDTO> getPlayerByTeamAndRole(String label, String role) {
		// TODO Auto-generated method stub
		return null;
	}

}
