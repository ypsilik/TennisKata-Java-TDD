package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

public class TennisGame
{

	private TennisGameScore score;

	
	public TennisGame() 
	{
		this.score = score.LOVE_ALL;
	}
	
	public void serverScores()
	{
		if (this.score == score.LOVE_FIFTEEN)
		{
			this.score = score.FIFTEEN_ALL;
		}
		else this.score = score.FIFTEEN_LOVE;
	}
	
	public void receiverScores()
	{
		if (this.score == score.FIFTEEN_LOVE)
		{
			this.score = score.FIFTEEN_ALL;
		}
		else this.score = score.LOVE_FIFTEEN;
	}
	
	
	
	public String getScore()
	{
		return score.getScoreString();
	}
}
