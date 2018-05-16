
public class Bowling {
	int score = 0;
	int strike =0;
	boolean spare = false;
	public void addScore(int first, int second)
	{
		score += first + second;
		
		//if previus was a strike
		if(strike > 0)
		{
			score += first + second;
			

			
			if(strike >= 2)
			{
				score += first;
				strike = 0;
			}
			
			//if this also is a strike remember that there wher 2 strikes in a row
			if(first == 10)
			{
				strike = 1;
			}

		}
		//if previus was a spare
		else if(spare)
		{
			score += first;
			spare = false;
		}
		
		//if this is a strike remember that
		if(first == 10)
		{
			strike += 1;
		}
		//if it was a spare remember that
		else if(first + second == 10)
		{
			spare = true;
			strike = 0;
		}
		else
		{
			strike = 0;
		}

	}

	public int getScore() {
		return score;
	}
}
