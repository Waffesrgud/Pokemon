package poke.view;

import poke.controller.PokemonController;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class PokemonPanel extends JPanel
{
	public PokemonController baseController;

	public PokemonPanel(PokemonController baseController)
	{
		super();
		setBackground(Color.PINK);
		setBorder(new LineBorder(new Color(0, 0, 0), 3));
		this.baseController = baseController;
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		SpinnerListModel statList = new SpinnerListModel(baseController.statNames);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("Choose a Pokemon");
		springLayout.putConstraint(SpringLayout.NORTH, comboBox, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, comboBox, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, comboBox, 153, SpringLayout.WEST, this);
		add(comboBox);
		
		JLabel lblChooseAPokemon = new JLabel("Choose a Pokemon!");
		springLayout.putConstraint(SpringLayout.NORTH, lblChooseAPokemon, 6, SpringLayout.SOUTH, comboBox);
		springLayout.putConstraint(SpringLayout.WEST, lblChooseAPokemon, 0, SpringLayout.WEST, comboBox);
		add(lblChooseAPokemon);
		
		JLabel lblID = new JLabel("ID #:");
		springLayout.putConstraint(SpringLayout.NORTH, lblID, 6, SpringLayout.SOUTH, lblChooseAPokemon);
		springLayout.putConstraint(SpringLayout.WEST, lblID, 0, SpringLayout.WEST, comboBox);
		add(lblID);
		
		JLabel idNum = new JLabel("0");
		springLayout.putConstraint(SpringLayout.WEST, idNum, 6, SpringLayout.EAST, lblID);
		springLayout.putConstraint(SpringLayout.SOUTH, idNum, 0, SpringLayout.SOUTH, lblID);
		add(idNum);
		
		JSpinner spinner = new JSpinner(statList);
		spinner.setToolTipText("Choose a stat");
		springLayout.putConstraint(SpringLayout.NORTH, spinner, 12, SpringLayout.SOUTH, lblID);
		springLayout.putConstraint(SpringLayout.WEST, spinner, 13, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, spinner, 0, SpringLayout.EAST, lblChooseAPokemon);
		add(spinner);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setToolTipText("Associated score");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 6, SpringLayout.SOUTH, spinner);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, this);
		add(lblNewLabel);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
	
	}
}
