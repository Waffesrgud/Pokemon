package poke.model;

public class Move {
	
	public Type moveType;
	public int power;
	public int accuracy;
	public int pp;
	public String desc;
	
	public Move() {
		moveType.typePresets("None");
	}
	
	public Move(String movename) {
		movePresets(movename);
	}
	
	
	public void movePresets(String movename) {
		switch(movename)
		{
		case "Draining Kiss":
			moveType.typePresets("Fairy");
			power = 50;
			accuracy = 100;
			pp = 10;
			desc = "Draining Kiss deals damage and the user will recover 75% of the HP drained.";
			break;
		case "Moonblast":
			moveType.typePresets("Fairy");
			power = 96;
			accuracy = 100;
			pp = 15;
			desc = "Moonblast deals damage and has a 30% chance of lowering the target's Special Attack by one stage.";
			break;
		case "Dragon Breath":
			moveType.typePresets("Dragon");
			power = 60;
			accuracy = 100;
			pp = 20;
			desc = "Dragon Breath deals damage and has a 30% chance of paralyzing the target.";
			break;
		case "Flamethrower":
			moveType.typePresets("Fire");
			power = 90;
			accuracy = 100;
			pp = 15;
			break;
		case "Fury Attack":
			moveType.typePresets("Fury Attack");
			power = 90;
			accuracy = 100;
			pp = 20;
			desc = "Fury Attack deals damage and can hit 2-5 times.";
			break;
		case "5":
			break;
		case "6":
			break;
		default:
			break;
		}
	}
}
