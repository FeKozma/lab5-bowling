
public class Bowling {
	int score = 0;
	boolean strike =false;
	public void addScore(int first, int second)
	{
		score += first + second;
		//if previus was a strike
		if(strike)
		{
			score += first + second;
			strike = false;
		}
		//if this is a strike remember that
		if(first == 10)
		{
			strike = true;
		}

	}

	public int getScore() {
		return score;
	}
}
