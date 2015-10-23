package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

public class TennisGame
{

	public static final String LOVE_ALL = "love-all";
	public static final String FIFTEEN_LOVE = "fifteen-love";
	public static final String LOVE_FIFTEEN = "love-fifteen";

	private String score;
	
	
	
	public TennisGame() 
	{
		this.score = LOVE_ALL;
	}
	
	public void serverScores()
	{
		this.score = FIFTEEN_LOVE;
	}
	
	public void receiverScores()
	{
		this.score = LOVE_FIFTEEN;
	}
	
	public String getScore()
	{
		return score;
	}
}
