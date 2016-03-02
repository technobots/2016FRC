package org.usfirst.frc.team743.robot.subsystems;

import org.usfirst.frc.team743.robot.RobotMap; 
import org.usfirst.frc.team743.robot.commands.ThingDoNothing;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/*This is the subsystem for the two bottom actuators*/


public class Thing extends Subsystem {

	Talon botActuators;
	Talon topActuators;
	
	public Thing() { 
		super ("Thing");
		botActuators = new Talon(RobotMap.TalonBotActuators);
		topActuators = new Talon(RobotMap.TalonTopActuators);
	    
	}

	public void actuatorsUp () {
		botActuators.set(1.0);
		topActuators.set(1.0);
	}
	
	public void actuatorsDown () {
		botActuators.set(-1.0);
		topActuators.set(-1.0);
	}
	
	public void actuatorsDoNothing () {
		botActuators.set(0);
		topActuators.set(0);
	}
	
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand( new ThingDoNothing());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
