package org.usfirst.frc.team743.robot.commands;

import org.usfirst.frc.team743.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class MobyPushOut extends Command {

	public MobyPushOut() {
		requires(Robot.moby);
		// TODO Auto-generated constructor stub
	}

	public MobyPushOut(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public MobyPushOut(double timeout) {
		super(timeout);
		// TODO Auto-generated constructor stub
	}

	public MobyPushOut(String name, double timeout) {
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
		Robot.moby.pushOut();
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
