
public class Bowling {
	int score = 0;
	
	public void addScore(int first, int second)
	{
		score = score + first + second;
	}

	public int getScore() {
		return score;
	}
}
