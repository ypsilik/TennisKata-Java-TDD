package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	@Test
	public void loveAllTest() {
		TennisGame tennisGame = new TennisGame();
		Assert.assertEquals(tennisGame.getScore(),TennisGame.LOVE_ALL);
	}

}
