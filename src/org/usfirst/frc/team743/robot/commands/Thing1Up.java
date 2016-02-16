package org.usfirst.frc.team743.robot.commands;

import org.usfirst.frc.team743.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Thing1Up extends Command {

	public Thing1Up() {
		super("Thing1Up");
		requires(Robot.Thing1);
	}
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void execute() {
		Robot.Thing1.actuatorBotUp();
		
		// TODO Auto-generated method stub

	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}
