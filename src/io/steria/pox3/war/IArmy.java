package io.steria.pox3.war;

import io.steria.pox3.got.game.Player;
import io.steria.pox3.got.story.House;
import io.steria.pox3.got.tile.Domain;
import io.steria.pox3.got.tile.Tile;

public interface IArmy {

	int getTotalTroops();
	int getMovedTroops();
	int getReadyTroops();
	
	void move(int troops, Direction direction);
	void move(Direction direction);
	
	boolean attack(IArmy ennemy);
	
	
	
	Tile getPosition();
	House getHouse();	
	
	ArmyState getState();
	
	Player getPlayer();
}
