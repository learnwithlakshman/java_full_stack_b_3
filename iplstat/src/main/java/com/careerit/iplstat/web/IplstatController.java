package com.careerit.iplstat.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.careerit.iplstat.dto.LabelDTO;
import com.careerit.iplstat.service.IplstatService;

@RestController
@RequestMapping("/api/v1/ipl")
public class IplstatController {
	
		@Autowired
		private IplstatService iplstatService;
		
		@GetMapping("/teams/label")
		public LabelDTO getLabelNames() {
			return iplstatService.getTeamLabels();
		}
}
