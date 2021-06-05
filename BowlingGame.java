package Bowling;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class BowlingGame {
	List<Integer> Frame = new ArrayList<>();
	int[] ballsRolled;
	int currentRolls;
	int frame = 0;
	int frameCounter = 0;
	int Count =0;
	private static final int MAX_ATTEMPTS_PER_FRAME = 2;
	int attempts =0;
	private static final int MAX_FRAMES = 10;
	public BowlingGame()
	{
		this.ballsRolled = new int[21];
		for (int i=1; i<=10; i++)
		{
			Frame.add(i);
		}  
	}

	public int getCurrentFrame(int attempts)
	{ 

			if(attempts == 21) //Game Over
			{
				return Frame.get(9)+1;
			}
			else if (attempts < 2)
			{
				Count++;
				return Count;
			}
			else
			{
				System.out.println("This is a Strike!");
				return Frame.get(0);
				
			}
			

	}
	
	public int getCurrentBall()
	{
		if (ballsRolled[frame] == MAX_ATTEMPTS_PER_FRAME)
		{
			frameCounter+=2;
			return frameCounter;

		}
		else if (ballsRolled[frame] != MAX_ATTEMPTS_PER_FRAME)
		{
			frameCounter++;
			return frameCounter;
		}
		else
		{
			frameCounter+=3;
			return frameCounter;
		}

		
	
		
	}
	public void scoreBall(int pins)
	{
		ballsRolled[currentRolls++] = pins;
	}
	public int getBallScore(int frame, int ball)
	{
		int scoredPins=0;
		
		for(int i=1; i<=10; i++)
		{
			if(isStrike(frame)) //strike
			{
				scoredPins+= 10 + ballsRolled[frame+1] +ballsRolled[frame+2];
				frame++;
			}
		    else if(isSpare(frame)) //spare
			{
				scoredPins+=10 + ballsRolled[frame+2];
				frame+=2;
			} else {
				scoredPins+= ballsRolled[frame] +ballsRolled[frame+1];
				frame+=2;

			}
		}
		return scoredPins;

	
	}
	
	public boolean isStrike(int frame)
	{
		if(ballsRolled[frame] == 10)
			return true;
		else
			return false;
	}

	public boolean isSpare(int frame)
	{
		if(ballsRolled[frame] +ballsRolled[frame+1] == 10)
			return true;
		else
			return false;
	}

}
