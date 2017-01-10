package poke.model;
import java.util.*;

public class Pokemon implements PokemonInterface{
int number;
HashMap<String, Integer> stats = new HashMap<String, Integer>();
String name;
Type type1 = new Type();
Type type2 = new Type();
int evolStage;
Move move1 = new Move();
Move move2 = new Move();

public Pokemon()
{
	pokemonPresets("Gardevoir");
	System.out.println("Values set to default");
}

public Pokemon(String pokemon)
{
	pokemonPresets(pokemon);
	System.out.println("Values set to input");
}

public Pokemon pokemonPresets(String pokemon)
{
	name = pokemon;
	switch(pokemon)
	{
	case "Gardevoir":
		setNumber(282);
		stats.put("hp", 68);
		stats.put("atk", 5);
		stats.put("def", 65);
		stats.put("spatk", 125);
		stats.put("spdef", 115);
		stats.put("spd", 80);
		type1.typePresets("Psychic");
		type2.typePresets("Fairy");
		setEvolStage(3);
		move1.movePresets("Draining Kiss");
		move2.movePresets("Moonblast");
		break;
	case "Salamence":
		setNumber(373);
		stats.put("hp", 95);
		stats.put("atk", 135);
		stats.put("def", 80);
		stats.put("spatk", 110);
		stats.put("spdef", 80);
		stats.put("spd", 100);
		type1.typePresets("Dragon");
		type2.typePresets("Flying");
		setEvolStage(3);
		move1.movePresets("Flamethrower");
		move2.movePresets("Dragon Breath");
		break;
	case "Altaria":
		setNumber(334);
		stats.put("hp", 75);
		stats.put("atk", 70);
		stats.put("def", 90);
		stats.put("spatk", 70);
		stats.put("spdef", 105);
		stats.put("spd", 80);
		type1.typePresets("Dragon");
		type2.typePresets("Flying");
		setEvolStage(2);
		move1.movePresets("Fury Attack");
		move2.movePresets("Dragon Breath");
		break;
	case "Swablu":
		setNumber(333);
		stats.put("hp", 45);
		stats.put("atk", 40);
		stats.put("def", 60);
		stats.put("spatk", 40);
		stats.put("spdef", 75);
		stats.put("spd", 50);
		type1.typePresets("Normal");
		type2.typePresets("Dragon");
		setEvolStage(1);
		move1.movePresets("Fury Attack");
		move2.movePresets("Moonblast");
		break;
	case "Goodra":
		setNumber(706);
		stats.put("hp", 90);
		stats.put("atk", 100);
		stats.put("def", 70);
		stats.put("spatk", 110);
		stats.put("spdef", 150);
		stats.put("spd", 80);
		type1.typePresets("Dragon");
		type2.typePresets("None");
		setEvolStage(3);
		move1.movePresets("Attract");
		move2.movePresets("Dragon Breath");
		break;
	case "Blaziken":
		setNumber(257);
		stats.put("hp", 80);
		stats.put("atk", 120);
		stats.put("def", 70);
		stats.put("spatk", 110);
		stats.put("spdef", 70);
		stats.put("spd", 80);
		type1.typePresets("Fire");
		type2.typePresets("Fighting");
		setEvolStage(3);
		move1.movePresets("Blaze Kick");
		move2.movePresets("Sky Uppercut");
		break;
	default:
		setNumber(0);
		stats.put("hp", 0);
		stats.put("atk", 0);
		stats.put("def", 0); 
		stats.put("spatk", 0);
		stats.put("spdef", 0);
		stats.put("spd", 0);
		type1.typePresets("None");
		type2.typePresets("None");
		setEvolStage(0);
		move1.movePresets("None");
		move2.movePresets("None");
		break;
	}
	return this;
}

public String getName()
{
	return name;
}

public int getNumber() {
	return number;
}

public void setNumber(int number) {
	this.number = number;
}

public int getEvolStage() {
	return evolStage;
}

public void setEvolStage(int evolStage) {
	this.evolStage = evolStage;
}

}
