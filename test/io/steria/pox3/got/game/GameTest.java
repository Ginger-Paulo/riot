package io.steria.pox3.got.game;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import io.steria.pox3.got.game.Game;
import io.steria.pox3.got.game.Player;
import io.steria.pox3.got.story.House;
import io.steria.pox3.got.story.HouseFactory;

public class GameTest {

	Game game;
	Player maxime;
	Player anne;
	House lannister,stark;
	
	@Before
	public void setUp(){
		System.out.println("reinitialize new game");
		this.game = new Game();

		HouseFactory factory = new HouseFactory();
		this.stark = factory.getStark();
		this.lannister = factory.getLannister();
		
		this.anne = new Player("Anne", lannister);
		this.maxime = new Player("Maxime", stark);
		
	}
	
	

	@Test
	public void testGetAvailableHouses() {
		assertEquals(8,game.getAvailableHouses().size());
		assertTrue(game.getAvailableHouses().size() ==8);
	
	}

	@Test
	public void testSavePlayer() {
		assertTrue(game.getAvailableHouses().size() ==8);
		
	
		anne.house= lannister;
		System.out.println(anne.house);
		
		game.savePlayer(anne);
		assertTrue(game.getAvailableHouses().size() ==7);
	}

}
