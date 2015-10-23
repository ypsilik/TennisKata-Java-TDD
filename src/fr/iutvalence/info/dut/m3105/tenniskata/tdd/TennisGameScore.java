package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

public enum TennisGameScore
{
	LOVE_ALL("love-all"),
	FIFTEEN_LOVE("fifteen-love"),
	LOVE_FIFTEEN("love-fifteen"),
	FIFTEEN_ALL("fifteen-all");
	
	private String scoreString;

	private TennisGameScore(String score)
	{
		this.scoreString = score;
	}

	public String getScoreString()
	{
		return scoreString;
	}
	
	
}