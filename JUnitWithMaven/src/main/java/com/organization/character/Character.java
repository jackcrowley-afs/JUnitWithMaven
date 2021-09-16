package com.organization.character;

public class Character {

	private int currentHitPoints;
	private int maxHitPoints;
	
	private boolean defeated;
	
	private int level;

	public static final int STARTING_LEVEL = 1;
	
	public Character(int maxHitPoints, int level) {
		super();
		currentHitPoints = this.maxHitPoints = maxHitPoints;
		this.level = level;
		
		defeated = false;
	}
	
	public Character(int maxHitPoints) {
		super();
		currentHitPoints = this.maxHitPoints = maxHitPoints;
		this.level = STARTING_LEVEL;
		
		defeated = false;
	}

	public int getCurrentHitPoints() {
		return currentHitPoints;
	}

	public void setCurrentHitPoints(int currentHitPoints) {
		this.currentHitPoints = currentHitPoints;
	}

	public int getMaxHitPoints() {
		return maxHitPoints;
	}

	public void setMaxHitPoints(int maxHitPoints) {
		this.maxHitPoints = maxHitPoints;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public boolean isDefeated() {
		return defeated;
	}
	
	
	
	
}
