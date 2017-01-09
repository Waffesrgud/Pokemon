package poke.controller;

import poke.model.*;
import poke.view.*;
import java.util.*;

public class PokemonController {
PokemonFrame overlay = new PokemonFrame(this);
List<Pokemon> pokedex = new ArrayList<Pokemon>();
private Pokemon pokemon;

public PokemonController()
{
Pokemon pokemon = new Pokemon();
System.out.println("Booting up the pokedex...");	
	
pokemon.pokemonPresets("None");

System.out.println("You got through it pal.");

for (int i = 0; i < 6; i++)
{
	pokedex.add(pokemon);
}
pokedex.get(0).pokemonPresets("Gardevoir");
pokedex.get(1).pokemonPresets("Salamence");
pokedex.get(2).pokemonPresets("Altaria");
pokedex.get(3).pokemonPresets("Swablu");
pokedex.get(4).pokemonPresets("Goodra");
pokedex.get(5).pokemonPresets("Blaziken");
}
public void start()
{
	System.out.println("Hello, world!");
}

public PokemonFrame getBaseFrame() {

	return overlay;
}

public List getPokedex() {

	return pokedex;
}

}
