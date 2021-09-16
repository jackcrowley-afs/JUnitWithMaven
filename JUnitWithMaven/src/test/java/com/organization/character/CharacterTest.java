package com.organization.character;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CharacterTest {

	static final int TEST_HP = 30;

	
	@Test
	public void TestCharacterConstructorWithDefaultLevel()
	{
		
		
		Character character = new Character(30);
		
		
		Assert.assertEquals("Character Level and Starting Level is not equal",character.getLevel(), Character.STARTING_LEVEL);
		
		Assert.assertEquals(character.getMaxHitPoints(), TEST_HP);
		
		Assert.assertEquals(character.getLevel(), Character.STARTING_LEVEL);
		
	}
	
	@Test
	public void TestCharacterConstructorWithSpecifiedLevel()
	{
		
		final int LEVEL = 2;
		
		Character character = new Character(30, LEVEL);
		
		
		Assert.assertEquals(character.getLevel(), LEVEL);
		
		Assert.assertEquals(character.getMaxHitPoints(), TEST_HP);
		
	}
	
	@Test
	public void CharacterBelowZeroIsDefeated()
	{
		Character character = new Character(TEST_HP);
		
		character.setCurrentHitPoints(0);
		
		
		Assert.assertEquals(true, character.isDefeated());
	}

}
