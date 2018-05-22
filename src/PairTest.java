import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PairTest {

	@Test
	void constructTest() {
		try {
			Pair P = new Pair(1,2);
		}
		catch (Exception e) {
			fail("did not construct Pair");
		}
	}
	
	@Test
	void GetXTest() {
		try {
			Pair P = new Pair(1,2);
			int x = P.getX();
			assertEquals(1, x);
		}
		catch (Exception e) {
			fail("did not get X");
		}
	}
	
	@Test
	void GetYTest() {
		try {
			Pair P = new Pair(3,6);
			int y = P.getY();
			assertEquals(6, y);
		} catch (Exception e) {
			fail("did not get Y");
		}
	}
}
