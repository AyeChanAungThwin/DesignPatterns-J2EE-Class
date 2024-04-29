package io.github.ayechanaungthwin.design_patterns.structural.flyweight;

import java.util.HashMap;

public class PlayerFactory {

	private static HashMap<PlayerType, Player> hm = new HashMap<>();
	
	public static Player getPlayer(PlayerType playerType) {
		
		Player player = null;
		if (hm.containsKey(playerType)) {
			player = hm.get(playerType);
		}
		else {
			switch (playerType) {
				case Terrorist:
					player = new Terrorist();
					break;
				case CounterTerrorist:
					player = new CounterTerrorist();
			}
			// Once created insert it into the HashMap
            hm.put(playerType, player);
		}
		return player;
	}
}
