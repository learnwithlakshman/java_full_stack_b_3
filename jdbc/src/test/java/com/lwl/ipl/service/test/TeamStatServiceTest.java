package com.lwl.ipl.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.lwl.ipl.service.TeamStatService;
import com.lwl.ipl.service.TeamStatServiceImpl;

public class TeamStatServiceTest {

	
		
		@Test
		public void getTeamLabelTest() {
			TeamStatService service = new TeamStatServiceImpl();
			List<String> list = service.getTeamLabels();
			assertEquals(8, list.size());
		}
}
