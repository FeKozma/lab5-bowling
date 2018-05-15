import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PairTest {

	@Test
	void constructTest() {
		try {
			Pair P = new Pair(1,2);
		}
		catch (Exception e)
		{
			fail("did not construct Pair");
		}
		
	}

}
