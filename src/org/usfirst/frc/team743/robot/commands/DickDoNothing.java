package org.usfirst.frc.team743.robot.commands;

import org.usfirst.frc.team743.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DickDoNothing extends Command {

	public DickDoNothing() {
		super("DickDoNothing");
		requires(Robot.dick);
		// 
	}

	public DickDoNothing(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public DickDoNothing(double timeout) {
		super(timeout);
		// TODO Auto-generated constructor stub
	}

	public DickDoNothing(String name, double timeout) {
		super(name, timeout);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
        Robot.dick.dickStop();
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
