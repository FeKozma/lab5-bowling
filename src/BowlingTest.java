import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BowlingTest {

	@Test
	void addScore() {
		Bowling b = new Bowling();
		b.addScore(2, 2);
		//fail("Not yet implemented");
	}
	
	@Test
	void getScore() {
		Bowling b = new Bowling();
		b.addScore(4, 1);
		int s = b.getScore();
		assertEquals(5, s);
	}
	
	@Test
	void addScoreStrike()
	{
		Bowling b = new Bowling();
		b.addScore(10, 0);
		b.addScore(5, 2);

		int s = b.getScore();
		assertEquals(10+7+7, s);
	}
	
	@Test
	void addScoreSpare()
	{
		Bowling b = new Bowling();
		b.addScore(9, 1);
		b.addScore(5, 2);

		int s = b.getScore();
		assertEquals(10+5+7, s);
	}
	
	@Test
	void addScoreSpare2()
	{
		Bowling b = new Bowling();
		b.addScore(9, 1);
		b.addScore(8, 2);
		b.addScore(7, 3);
		b.addScore(5, 5);

		int s = b.getScore();
		assertEquals(18+17+15+10, s);
	}
	
	@Test
	void addScoreMultipleStrike()
	{
		Bowling b = new Bowling();
		b.addScore(10, 0);
		b.addScore(10, 0);
		b.addScore(7, 2);

		int s = b.getScore();
		assertEquals(27+19+9, s);
	}
	
	@Test
	void addScoreMultipleStrike2()
	{
		Bowling b = new Bowling();
		b.addScore(10, 0);
		b.addScore(10, 0);
		b.addScore(10, 0);
		b.addScore(7, 2);

		int s = b.getScore();
		assertEquals(30+27+19+9, s);
	}
	
	@Test
	void addScoreLastSpare()
	{
		Bowling b = new Bowling();
		b.addScore(1, 5);
		b.addScore(3, 6);
		b.addScore(7, 2);
		b.addScore(3, 6);
		b.addScore(4, 4);
		b.addScore(5, 3);
		b.addScore(3, 3);
		b.addScore(4, 5);
		b.addScore(8, 1);
		b.addScore(2, 8);
		//bonus throw
		b.addScore(7, 0);
		
		int s = b.getScore();
		assertEquals(90, s);
	}
	
	@Test
	void addScoreStrikeAtLastFrame()
	{
		Bowling b = new Bowling();
		b.addScore(1, 5);
		b.addScore(3, 6);
		b.addScore(7, 2);
		b.addScore(3, 6);
		b.addScore(4, 4);
		b.addScore(5, 3);
		b.addScore(3, 3);
		b.addScore(4, 5);
		b.addScore(8, 1);
		b.addScore(10, 0);
		//bonus throw
		b.addScore(7, 2);
		
		int s = b.getScore();
		assertEquals(92, s);
	}

}
