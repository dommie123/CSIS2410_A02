package adventureApp;

import java.util.Arrays;
import java.util.Random;

/**
 * This is the character class for our Adventure app. It represents the characters
 * that the players create in the game.
 * @author Dominick Wiley
 *
 */
public class Character 
{
	private int id;
	private int playerID;
	private String name;
	private String Class;		// capitalized Class due to Java type class
	private int experience;
	private int strength;
	private int dexterity;
	private int constitution;
	private int wisdom;
	private int charisma;
	private int inteligence;
	
	public Character(int id, int playerID, String name, String Class)
	{
		this.id = id;
		this.playerID = playerID;
		this.Class = Class;
		experience = 0;
		rollStats();
	}

	/*
	 * Getters and Setters for Character Class
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getclass() {
		return Class;
	}

	public void setClass(String class1) {
		Class = class1;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getDexterity() {
		return dexterity;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	public int getConstitution() {
		return constitution;
	}

	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}

	public int getWisdom() {
		return wisdom;
	}

	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}

	public int getCharisma() {
		return charisma;
	}

	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}

	public int getInteligence() {
		return inteligence;
	}

	public void setInteligence(int inteligence) {
		this.inteligence = inteligence;
	}

	public int getId() {
		return id;
	}

	public int getPlayerID() {
		return playerID;
	}
	// end of getters and setters
	
	/**
	 * This method creates the character statistics using randomly-generated numbers.
	 */
	private void rollStats()
	{
		int[] stats = new int[6];
		
		stats[0] = rollStat(strength);
		stats[1] = rollStat(dexterity);
		stats[2] = rollStat(constitution);
		stats[3] = rollStat(wisdom);
		stats[4] = rollStat(charisma);
		stats[5] = rollStat(inteligence);
		
	}
	
	/**
	 * Randomly generates four numbers between 1 and 6, adds the cumulative
	 * total of the highest three numbers, and assigns the total to a new
	 * character stat (this is one method of obtaining a character's stats in D&D).
	 * 
	 * @param i - the stat to generate
	 * @return - the newly generated stat
	 */
	private int rollStat(int i)
	{
		Random r = new Random();
		int temp = 0;
		
		int t1 = r.nextInt(5) + 1;
		int t2 = r.nextInt(5) + 1;
		int t3 = r.nextInt(5) + 1;
		int t4 = r.nextInt(5) + 1;
		
		int[] vals = new int[4];
		
		vals[0] = t1;
		vals[1] = t2;
		vals[2] = t3;
		vals[3] = t4;
		
		Arrays.parallelSort(vals);
		
		temp += vals[1];
		temp += vals[2];
		temp += vals[3];
		
		vals = null;
		return temp;
	}
	
	
}
