public class Bowling {
	int score = 0;
	int strike = 0;
	int round = 0;
	boolean spare = false;
	
	public void addScore(int first, int second) {
		if (round != 10) {
			score += first + second;
			round++;
		}
		
		//If previous was a strike.
		if (strike > 0) {
			score += first + second;
			
			if (strike >= 2) {
				score += first;
				strike = 0;
			}
			
			// If this also is a strike, remember that there where 2 strikes in a row.
			if (first == 10) {
				strike = 1;
			}
		}
		
		// If previous was a spare.
		else if (spare) {
			score += first;
			spare = false;
		}
		
		// If this is a strike remember that.
		if (first == 10) {
			strike += 1;
		}
		// If it was a spare remember that.
		else if (first + second == 10) {
			spare = true;
			strike = 0;
		}
		else {
			strike = 0;
		}
	}

	public int getScore() {
		return score;
	}
}
