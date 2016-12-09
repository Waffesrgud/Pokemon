package poke.model;
import java.util.*;

public abstract class Pokemon implements PokemonInterface{
private int number;
private HashMap<String, Integer> stats;
private String name;
private Type type1;
private Type type2;
private int evolStage;

public Pokemon()
{
	pokemonPresets("Invalid");
}

public Pokemon(String pokemon)
{
	pokemonPresets(pokemon);
}

public void pokemonPresets(String pokemon)
{
	name = pokemon;
	switch(pokemon)
	{
	case "Gardevoir" :
		number = 282;
		stats.put("hp", 68);
		stats.put("atk", 5);
		stats.put("def", 65);
		stats.put("spatk", 125);
		stats.put("spdef", 115);
		stats.put("spd", 80);
		type1.typePresets("Psychic");
		type2.typePresets("Fairy");
		evolStage = 3;
		break;
	case "Salamence":
		number = 373;
		stats.put("hp", 95);
		stats.put("atk", 135);
		stats.put("def", 80);
		stats.put("spatk", 110);
		stats.put("spdef", 80);
		stats.put("spd", 100);
		type1.typePresets("Dragon");
		type2.typePresets("Flying");
		evolStage = 3;
		break;
	case "Altaria":
		number = 334;
		stats.put("hp", 75);
		stats.put("atk", 70);
		stats.put("def", 90);
		stats.put("spatk", 70);
		stats.put("spdef", 105);
		stats.put("spd", 80);
		type1.typePresets("Dragon");
		type2.typePresets("Flying");
		evolStage = 2;
		break;
	case "Swablu":
		number = 333;
		stats.put("hp", 45);
		stats.put("atk", 40);
		stats.put("def", 60);
		stats.put("spatk", 40);
		stats.put("spdef", 75);
		stats.put("spd", 50);
		type1.typePresets("Ground");
		type2.typePresets("Dragon");
		evolStage = 1;
		break;
	case "Goodra":
		number = 706;
		stats.put("hp", 90);
		stats.put("atk", 100);
		stats.put("def", 70);
		stats.put("spatk", 110);
		stats.put("spdef", 150);
		stats.put("spd", 80);
		type1.typePresets("Dragon");
		type2.typePresets("None");
		evolStage = 3;
		break;
	default:
		number = 0;
		stats.put("hp", 0);
		stats.put("atk", 0);
		stats.put("def", 0);
		stats.put("spatk", 0);
		stats.put("spdef", 0);
		stats.put("spd", 0);
		type1.typePresets("None");
		type2.typePresets("None");
		evolStage = 0;
		break;
	}
}

}
