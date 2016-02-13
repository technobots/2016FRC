package org.usfirst.frc.team743.robot.subsystems;

import org.usfirst.frc.team743.robot.RobotMap;
import org.usfirst.frc.team743.robot.commands.DickDoNothing;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Dick extends Subsystem {

	Talon motorbot;
	Talon motortop;
	
	public Dick() {
		super ("Dick");
		motorbot = new Talon(RobotMap.TalonDickBot);
		motortop = new Talon(RobotMap.TalonDickTop);
		// TODO Auto-generated constructor stub
	}

	public void Dickshoot () {
		motorbot.set(-1.0);
		motortop.set(1.0);
	}
	
	public void dickStop () {
		motorbot.set(0);
		motortop.set(0);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new DickDoNothing());
	}

}
