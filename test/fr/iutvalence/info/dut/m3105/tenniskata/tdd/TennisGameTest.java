package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	private TennisGame tennisGame;
	
	@Test
	public void loveAllTest() {
		newTennisGame();
		checkScore(TennisGameScore.LOVE_ALL.getScoreString());
	}
	
	@Test
	public void fifteenLoveTest() {
		newTennisGame();
		tennisGame.serverScores();
		checkScore(TennisGameScore.FIFTEEN_LOVE.getScoreString());
	}
	
	@Test
	public void loveFifteenTest() {
		newTennisGame();
		tennisGame.receiverScores();
		checkScore(TennisGameScore.LOVE_FIFTEEN.getScoreString());
	}

	@Test
	public void fifteenAllTest() {
		newTennisGame();
		tennisGame.serverScores();
		tennisGame.receiverScores();
		checkScore(TennisGameScore.FIFTEEN_ALL.getScoreString());
		
		newTennisGame();
		tennisGame.receiverScores();
		tennisGame.serverScores();
		checkScore(TennisGameScore.FIFTEEN_ALL.getScoreString());
	}
	
	
	private void checkScore(String scoreWaited)
	{
		Assert.assertEquals(tennisGame.getScore(),scoreWaited);
	}

	private void newTennisGame()
	{
		this.tennisGame = new TennisGame();
	}

}
