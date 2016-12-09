package poke.model;

import java.util.*;

public abstract class Type {
	public HashMap<String, Double> match;
	public Type()
	{
		
	}
	public Type(String type)
	{
		 
	}
	public void typePresets(String type)
	{
		switch(type)
		{
		case "Normal":
			match.put("Normal", 1.0);
			match.put("Fire", 1.0);
			match.put("Water", 1.0);
			match.put("Grass", 1.0);
			match.put("Electric", 1.0);
			match.put("Ice", 1.0);
			match.put("Rock", 0.5);
			match.put("Ground", 1.0);
			match.put("Ghost", 0.0);
			match.put("Dragon", 1.0);
			match.put("Bug", 1.0);
			match.put("Flying", 1.0);
			match.put("Steel", 0.5);
			match.put("Fairy", 1.0);
			match.put("Psychic", 1.0);
			match.put("Poison", 1.0);
			match.put("Dark", 1.0);
			match.put("Fighting", 1.0);
			break;
		case "Fire":
			match.put("Normal", 1.0);
			match.put("Fire", 0.5);
			match.put("Water", 0.5);
			match.put("Grass", 2.0);
			match.put("Electric", 1.0);
			match.put("Ice", 2.0);
			match.put("Rock", 0.5);
			match.put("Ground", 1.0);
			match.put("Ghost", 1.0);
			match.put("Dragon", 0.5);
			match.put("Bug", 2.0);
			match.put("Flying", 1.0);
			match.put("Steel", 2.0);
			match.put("Fairy", 1.0);
			match.put("Psychic", 1.0);
			match.put("Poison", 1.0);
			match.put("Dark", 1.0);
			match.put("Fighting", 1.0);
			break;
		default:
			match.put("Normal", 1.0);
			match.put("Fire", 1.0);
			match.put("Water", 1.0);
			match.put("Grass", 1.0);
			match.put("Electric", 1.0);
			match.put("Ice", 1.0);
			match.put("Rock", 1.0);
			match.put("Ground", 1.0);
			match.put("Ghost", 1.0);
			match.put("Dragon", 1.0);
			match.put("Bug", 1.0);
			match.put("Flying", 1.0);
			match.put("Steel", 1.0);
			match.put("Fairy", 1.0);
			match.put("Psychic", 1.0);
			match.put("Poison", 1.0);
			match.put("Dark", 1.0);
			match.put("Fighting", 1.0);
		}
	}
}
