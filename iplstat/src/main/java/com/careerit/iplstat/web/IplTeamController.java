package com.careerit.iplstat.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.careerit.iplstat.dto.TeamDTO;
import com.careerit.iplstat.service.IplTeamService;

@RestController
@RequestMapping("/api/v1/ipl/team")
public class IplTeamController {
		
		@Autowired
		private IplTeamService iplTeamService;
	
		@PostMapping	
		public TeamDTO addTeam(@RequestBody TeamDTO teamDTO) {
			return iplTeamService.addTeam(teamDTO);
		}
		
		@GetMapping
		public List<TeamDTO> getAllTeams(){
			return iplTeamService.getAllTeams();
		}
		
		@DeleteMapping("{id}")
		public String deleteTeam(@PathVariable("id")String id) {
			
			return "Delete status";
		}
		
		@GetMapping("{id}")
		public TeamDTO getTeamById(@PathVariable("id")String id) {
			
			return null;
		}
		
		@PutMapping
		public TeamDTO updateTeam(@RequestBody TeamDTO teamDTO) {
			
			return null;
		}
		
}
