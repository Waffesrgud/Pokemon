package poke.controller;

import poke.model.*;
import poke.model.Pokemon;
import poke.model.pokemon.*;
import poke.view.*;
import java.util.*;

public class PokemonController {
PokemonFrame overlay = new PokemonFrame(this);
List<Pokemon> pokedex = new ArrayList<Pokemon>();
Gardevoir gardevoir = new Gardevoir();
Salamence salamence = new Salamence();
Altaria altaria = new Altaria();
Swablu swablu = new Swablu();
Goodra goodra = new Goodra();
Blaziken blaziken = new Blaziken();
public String [] statNames = {"hp", "atk", "def", "spatk", "spdef", "spd"};


public PokemonController()
{

System.out.println("Booting up the pokedex...");	

pokedex.add(gardevoir);
pokedex.add(salamence);
pokedex.add(altaria);
pokedex.add(swablu);
pokedex.add(goodra);
pokedex.add(blaziken);

System.out.println("You got through it pal.");
}

public void start()
{
	System.out.println("Hello, world!");
}

public PokemonFrame getBaseFrame() {

	return overlay;
}

public List<Pokemon> getPokedex() {

	return pokedex;
}

}
