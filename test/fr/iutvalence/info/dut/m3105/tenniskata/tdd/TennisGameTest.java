package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	private TennisGame tennisGame;
	
	@Test
	public void loveAllTest() {
		newTennisGame();
		checkScore(TennisGame.LOVE_ALL);
	}
	
	@Test
	public void fifteenLoveTest() {
		newTennisGame();
		tennisGame.serverScores();
		checkScore(TennisGame.FIFTEEN_LOVE);
	}
	
	@Test
	public void loveFifteenTest() {
		newTennisGame();
		tennisGame.receiverScores();
		checkScore(TennisGame.LOVE_FIFTEEN);
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
