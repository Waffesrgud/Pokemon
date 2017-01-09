package poke.controller;

import poke.model.Pokemon;
import poke.view.*;
import java.util.*;

public class PokemonController {
PokemonFrame overlay = new PokemonFrame(this);
List<Pokemon> pokedex = new ArrayList<Pokemon>();
private Pokemon temporaryPokemon;

public PokemonController()
{
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

public void initializePokedex()
{

}
}
