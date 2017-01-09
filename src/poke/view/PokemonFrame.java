package poke.view;

import poke.controller.PokemonController;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;

public class PokemonFrame extends JFrame
{
private PokemonController baseController;
private PokemonPanel appPanel;

public PokemonFrame(PokemonController baseController)
{
	super();
	this.baseController = baseController;
	this.appPanel = new PokemonPanel(baseController);
	setupFrame();

}

private void setupFrame()
{
	this.setSize(new Dimension(800, 600));
	this.setTitle("Hello, Pokedex!");
	this.setVisible(true);
}

public PokemonPanel getBasePanel()
{
	return appPanel;
}

public PokemonController getBaseController()
{
	return baseController;
}
}
