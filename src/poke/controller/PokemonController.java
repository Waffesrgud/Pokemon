package poke.controller;

import poke.model.Pokemon;
import poke.view.*;
import java.util.ArrayList;

public class PokemonController {
PokemonFrame overlay = new PokemonFrame(this);
ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
private Pokemon lastPokemon;
public PokemonController()
{
	initializePokedex();
}
public void start()
{
	System.out.println("Hello, world!");
}

public PokemonFrame getBaseFrame() {

	return overlay;
}

public ArrayList getPokedex() {

	return pokedex;
}

public void initializePokedex()
{
	pokedex.add(lastPokemon.pokemonPresets("Gardevoir"));
}
}
