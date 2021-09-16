package com.organization.character;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CharacterTest2 {

	static final int TEST_HP = 30;

	
	@Test
	public void TestCharacterConstructorWithDefaultLevel()
	{
		
		
		Character character = new Character(30);
		
		
		Assert.assertEquals("Character Level and Starting Level is not equal",character.getLevel(), Character.STARTING_LEVEL);
		
		Assert.assertEquals(character.getMaxHitPoints(), TEST_HP);
		
	}
	
	@Test
	public void TestCharacterConstructorWithSpecifiedLevel()
	{
		
		
		
	}

}
