package org.usfirst.frc.team743.robot.subsystems;

import org.usfirst.frc.team743.robot.RobotMap;
import org.usfirst.frc.team743.robot.commands.MobyDoNothing;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 * 
 * This is the grabber that pulls in the ball
 *
 */
public class Moby extends Subsystem {

	Talon motor;
	
	public Moby() {
		super("Moby");
		motor = new Talon(RobotMap.TalonMoby);
	}
	
	public void pullIn () {
		motor.set(1.0);
	}

	public void pushOut () {
		motor.set(-1.0);
	}
	
	public void setSpeed (double speed) {
		motor.set(speed);
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new MobyDoNothing());
	}

}
