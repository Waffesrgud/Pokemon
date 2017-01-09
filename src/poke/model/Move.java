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
	
	
	public Move movePresets(String movename) {
		switch(movename)
		{
		case "Draining Kiss":
			moveType.typePresets("Fairy");
			power = 50;
			accuracy = 100;
			pp = 10;
			desc = "Draining Kiss deals damage and the user will recover 75 percent of the HP drained.";
			break;
		case "Moonblast":
			moveType.typePresets("Fairy");
			power = 96;
			accuracy = 100;
			pp = 15;
			desc = "Moonblast deals damage and has a 30 percent chance of lowering the target's Special Attack by one stage.";
			break;
		case "Dragon Breath":
			moveType.typePresets("Dragon");
			power = 60;
			accuracy = 100;
			pp = 20;
			desc = "Dragon Breath deals damage and has a 30 percent chance of paralyzing the target.";
			break;
		case "Flamethrower":
			moveType.typePresets("Fire");
			power = 90;
			accuracy = 100;
			pp = 15;
			desc = "Flamethrower deals damage and has a 10 percent chance of burning the target.";
			break;
		case "Fury Attack":
			moveType.typePresets("Normal");
			power = 90;
			accuracy = 100;
			pp = 20;
			desc = "Fury Attack deals damage and can hit 2-5 times.";
			break;
		case "Attract":
			moveType.typePresets("Normal");
			power = 0;
			accuracy = 100;
			pp = 15;
			desc = "Attract causes Pokemon of the opposite gender to become infatuated.";
			break;
		case "Blaze Kick":
			moveType.typePresets("Fire");
			power = 85;
			accuracy = 90;
			pp = 10;
			desc = "Blaze Kick deals damage and has a 10 percent chance of burning the target. It also has an increased critical hit ratio (1/8 instead of 1/16).";
			break;
		case "Sky Uppercut":
			moveType.typePresets("Fighting");
			power = 85;
			accuracy = 90;
			pp = 15;
			desc = "Hits the opponent, even during Fly.";
			break;
		default:
			moveType.typePresets("None");
			power = 0;
			accuracy = 0;
			pp = 0;
			desc = "This move does not exist.";
			break;
		}
		return this;
	}
}
