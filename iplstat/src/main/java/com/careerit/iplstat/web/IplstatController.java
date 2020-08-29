package com.careerit.iplstat.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.careerit.iplstat.dto.LabelDTO;
import com.careerit.iplstat.dto.PlayerDTO;
import com.careerit.iplstat.dto.RoleCountDTO;
import com.careerit.iplstat.service.IplstatService;

@RestController
@RequestMapping("/api/v1/ipl")
public class IplstatController {

	@Autowired
	private IplstatService iplstatService;

	@GetMapping("/team/labels")
	public LabelDTO getLabelNames() {
		return iplstatService.getTeamLabels();
	}

	@GetMapping("/team/{label}/rolecount")
	public List<RoleCountDTO> getRoleCountByTeam(@PathVariable("label") String label) {
		return iplstatService.getPlayersCountByRole(label);
	}

	@GetMapping("/team/{label}/players")
	public List<PlayerDTO> getPlayersByTeam(@PathVariable("label") String label) {
		return iplstatService.getPlayersByTeam(label);
	}

	@GetMapping("/team/{label}/{role}/players")
	public List<PlayerDTO> getPlayersByTeamAndRole(@PathVariable("label") String label,
			@PathVariable("role") String role) {
		return iplstatService.getPlayerByTeamAndRole(label, role);
	}

}
