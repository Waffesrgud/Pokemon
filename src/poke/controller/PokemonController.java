package poke.controller;

import poke.model.Pokemon;
import poke.view.*;
import java.util.*;

public class PokemonController {
PokemonFrame overlay = new PokemonFrame(this);
List<Pokemon> pokedex = new ArrayList<Pokemon>();
private Pokemon tempPokemon;

public PokemonController()
{
/*
	pokedex.add(tempPokemon.pokemonPresets("Gardevoir"));
	pokedex.add(tempPokemon.pokemonPresets("Salamence"));
	pokedex.add(tempPokemon.pokemonPresets("Altaria"));
	pokedex.add(tempPokemon.pokemonPresets("Swablu"));
	pokedex.add(tempPokemon.pokemonPresets("Goodra"));
	pokedex.add(tempPokemon.pokemonPresets("Blaziken"));
*/
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
