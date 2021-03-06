package io.steria.pox3.got.game;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import io.steria.pox3.got.story.House;
import io.steria.pox3.got.story.HouseFactory;
import io.steria.pox3.got.tile.World;
import io.steria.pox3.war.Army;
import io.steria.pox3.war.Direction;
import io.steria.pox3.war.IArmy;

public class RoundTest {
	
	World world;
	Game game;
	Round round;
	House lannister,stark;
	Player a;
	Player b;

	IArmy a1;
	IArmy a2;
	IArmy a3;
	IArmy b1;
	
	@Before
	public void setUp() throws Exception {
		world = new World();
		world.generate();
		this.game = new Game();

		HouseFactory factory = new HouseFactory();
		this.stark = factory.getStark();
		this.lannister = factory.getLannister();
		
		this.a = new Player("Anne", lannister);
		this.b = new Player("Maxime", stark);
		
		game.players.add(this.a);
		game.players.add(this.b);
		
		a1=new Army(2,stark,world.getWinterfell6());
		a2=new Army(2,stark,world.getMeereen());
		a3=new Army(4,stark,world.getThrone());
		b1=new Army(1,stark,world.getTheEyrie4());
		
		round = new Round ();
	}

	@Test(expected=PlayerRoundEndedException.class)
	public void testEndPlayer() {
		
		a1.move(Direction.NORTH);
		round.end(a);
		a2.move(Direction.SOUTH);
		
		
	}

	@Test
	public void testEnd() {
		
		
		
	}
}
