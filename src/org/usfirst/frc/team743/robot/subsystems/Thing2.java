package org.usfirst.frc.team743.robot.subsystems;

import org.usfirst.frc.team743.robot.RobotMap;
import org.usfirst.frc.team743.robot.commands.Thing2DoNothing;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Thing2 extends Subsystem {

	Talon topActuators;

	
	
	public Thing2() { 
		super ("Thing2");
		topActuators = new Talon(RobotMap.TalonTopActuators);
	}
	
	public void actuatorTopUp () {
		topActuators.set(1.0);

	}
	
	public void actuatorTopDown () {
		topActuators.set(-1.0);
		
	}
	
	public void actuatorTopDoNothing () {
		topActuators.set(0);
	}
	
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand( new Thing2DoNothing());

	}
	
}