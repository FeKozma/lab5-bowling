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
	void addScoreMultipleStrike()
	{
		Bowling b = new Bowling();
		b.addScore(10, 0);
		b.addScore(10, 0);
		b.addScore(7, 2);

		int s = b.getScore();
		assertEquals(27+19, s);
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
		assertEquals(30+27+17+9, s);
	}

}
