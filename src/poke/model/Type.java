package poke.model;

import java.util.*;

public abstract class Type {
	public String name;
	public HashMap<String, Double> match;
	public Type()
	{
		typePresets("None");
	}
	public Type(String type)
	{
		 typePresets(type);
	}
	public void typePresets(String type)
	{
		name = type;
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
		case "Water":
			match.put("Normal", 1.0);
			match.put("Fire", 2.0);
			match.put("Water", 0.5);
			match.put("Grass", 0.5);
			match.put("Electric", 1.0);
			match.put("Ice", 1.0);
			match.put("Rock", 2.0);
			match.put("Ground", 2.0);
			match.put("Ghost", 1.0);
			match.put("Dragon", 0.5);
			match.put("Bug", 1.0);
			match.put("Flying", 1.0);
			match.put("Steel", 1.0);
			match.put("Fairy", 1.0);
			match.put("Psychic", 1.0);
			match.put("Poison", 1.0);
			match.put("Dark", 1.0);
			match.put("Fighting", 1.0);
			break;
		case "Grass":
			match.put("Normal", 1.0);
			match.put("Fire", 0.5);
			match.put("Water", 2.0);
			match.put("Grass", 0.5);
			match.put("Electric", 1.0);
			match.put("Ice", 1.0);
			match.put("Rock", 2.0);
			match.put("Ground", 2.0);
			match.put("Ghost", 1.0);
			match.put("Dragon", 0.5);
			match.put("Bug", 0.5);
			match.put("Flying", 0.5);
			match.put("Steel", 0.5);
			match.put("Fairy", 1.0);
			match.put("Psychic", 1.0);
			match.put("Poison", 0.5);
			match.put("Dark", 1.0);
			match.put("Fighting", 1.0);
			break;
		case "Electric":
			match.put("Normal", 1.0);
			match.put("Fire", 1.0);
			match.put("Water", 2.0);
			match.put("Grass", 0.5);
			match.put("Electric", 0.5);
			match.put("Ice", 1.0);
			match.put("Rock", 1.0);
			match.put("Ground", 0.0);
			match.put("Ghost", 1.0);
			match.put("Dragon", 0.5);
			match.put("Bug", 1.0);
			match.put("Flying", 2.0);
			match.put("Steel", 1.0);
			match.put("Fairy", 1.0);
			match.put("Psychic", 1.0);
			match.put("Poison", 1.0);
			match.put("Dark", 1.0);
			match.put("Fighting", 1.0);
			break;
		case "Ice":
			match.put("Normal", 1.0);
			match.put("Fire", 0.5);
			match.put("Water", 0.5);
			match.put("Grass", 2.0);
			match.put("Electric", 1.0);
			match.put("Ice", 0.5);
			match.put("Rock", 1.0);
			match.put("Ground", 2.0);
			match.put("Ghost", 1.0);
			match.put("Dragon", 2.0);
			match.put("Bug", 1.0);
			match.put("Flying", 2.0);
			match.put("Steel", 1.0);
			match.put("Fairy", 1.0);
			match.put("Psychic", 1.0);
			match.put("Poison", 1.0);
			match.put("Dark", 1.0);
			match.put("Fighting", 1.0);
			break;
		case "Fighting":
			match.put("Normal", 2.0);
			match.put("Fire", 1.0);
			match.put("Water", 1.0);
			match.put("Grass", 1.0);
			match.put("Electric", 1.0);
			match.put("Ice", 2.0);
			match.put("Rock", 2.0);
			match.put("Ground", 1.0);
			match.put("Ghost", 0.0);
			match.put("Dragon", 1.0);
			match.put("Bug", 0.5);
			match.put("Flying", 0.5);
			match.put("Steel", 2.0);
			match.put("Fairy", 1.0);
			match.put("Psychic", 0.5);
			match.put("Poison", 0.5);
			match.put("Dark", 2.0);
			match.put("Fighting", 1.0);
			break;
		case "
		case "Psychic":
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
			match.put("Steel", 0.5);
			match.put("Fairy", 1.0);
			match.put("Psychic", 1.0);
			match.put("Poison", 2.0);
			match.put("Dark", 0.0);
			match.put("Fighting", 2.0);
			break;
		case "Fairy":
			match.put("Normal", 1.0);
			match.put("Fire", 0.5);
			match.put("Water", 1.0);
			match.put("Grass", 1.0);
			match.put("Electric", 1.0);
			match.put("Ice", 1.0);
			match.put("Rock", 1.0);
			match.put("Ground", 1.0);
			match.put("Ghost", 1.0);
			match.put("Dragon", 2.0);
			match.put("Bug", 1.0);
			match.put("Flying", 1.0);
			match.put("Steel", 0.5);
			match.put("Fairy", 1.0);
			match.put("Psychic", 1.0);
			match.put("Poison", 0.5);
			match.put("Dark", 2.0);
			match.put("Fighting", 2.0);
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
			break;
		}
	}
}
