package org.usfirst.frc.team743.robot.commands;

import org.usfirst.frc.team743.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class MobyPullIn extends Command {

	public MobyPullIn() {
		super("MobyPullIn");
		requires(Robot.moby);
	}

	public MobyPullIn(double timeout) {
		super(timeout);
	}

	public MobyPullIn(String name, double timeout) {
		super(name, timeout);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void execute() {
	    Robot.moby.pullIn();
	}

	@Override
	protected boolean isFinished() {
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
