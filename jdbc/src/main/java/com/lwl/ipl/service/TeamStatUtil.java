package com.lwl.ipl.service;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lwl.ipl.domain.Team;

public final class TeamStatUtil {

	private TeamStatUtil() {

	}

	public static List<Team> loadFromJson(String fileName) {
		List<Team> list = null;
		ObjectMapper obj = new ObjectMapper();
		try {
			list = Arrays.asList(obj.readValue(TeamStatUtil.class.getResourceAsStream(fileName), Team[].class));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
}
