
public class Bowling {
	int score = 0;
	boolean strike =false;
	boolean spare = false;
	public void addScore(int first, int second)
	{
		score += first + second;
		//if previus was a strike
		if(strike)
		{
			score += first + second;
			strike = false;
		}
		else if(spare)
		{
			score += first;
			spare = false;
		}
		//if this is a strike remember that
		if(first == 10)
		{
			strike = true;
		}
		else if(first + second == 10)
		{
			spare = true;
		}

	}

	public int getScore() {
		return score;
	}
}
