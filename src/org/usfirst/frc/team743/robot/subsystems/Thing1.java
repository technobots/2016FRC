package org.usfirst.frc.team743.robot.subsystems;

import org.usfirst.frc.team743.robot.RobotMap;
import org.usfirst.frc.team743.robot.commands.Thing1DoNothing;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Thing1 extends Subsystem {

	Talon botActuators;
	
	
	public Thing1() { 
		super ("Thing1");
		botActuators = new Talon(RobotMap.TalonBotActuators);
	   
	}
	
	public void actuatorBotUp () {
		botActuators.set(1.0);
	}
	
	public void actuatorBotDown () {
		botActuators.set(-1.0);
	}
	
	public void actuatorBotDoNothing () {
		botActuators.set(0);
	}
	
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand( new Thing1DoNothing());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
