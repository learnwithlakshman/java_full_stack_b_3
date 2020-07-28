package com.lwl.json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Manager {

		public static void main(String[] args) {
			ObjectMapper mapper = new ObjectMapper();
			
			try {
				Players playerList = mapper.readValue(Manager.class.getResourceAsStream("/player.json"), Players.class);
				
				playerList.getPlayers().forEach(player->{
					System.out.println(player);
				});
				
				mapper.writeValue(new File("player_1.json"), playerList);
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
