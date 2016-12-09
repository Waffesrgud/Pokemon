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
		
	}
}

}
