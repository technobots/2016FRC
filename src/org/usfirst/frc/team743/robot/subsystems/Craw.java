package org.usfirst.frc.team743.robot.subsystems;

import org.usfirst.frc.team743.robot.RobotMap; 
import org.usfirst.frc.team743.robot.commands.CrawDoNothing;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/*This is the subsystem for the two bottom actuators*/


public class Craw extends Subsystem {

	Talon craw;
	
	
	public Craw() { 
		super ("craw");
		craw = new Talon(RobotMap.TalonCraw);
	
	}

	public void crawUp () {
		craw.set(1.0);
	}
	
	public void crawDown () {
		craw.set(-1.0);
	}
	
	public void crawDoNothing () {
		craw.set(0);
	}
	
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new CrawDoNothing());

	}

	public static void main(String[] args) {
		
	}

}
