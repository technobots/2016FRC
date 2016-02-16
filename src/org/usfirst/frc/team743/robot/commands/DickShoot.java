package org.usfirst.frc.team743.robot.commands;

import org.usfirst.frc.team743.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DickShoot extends Command {

	public DickShoot() {
		super("DickShoot");
		requires(Robot.dick);
		// TODO Auto-generated constructor stub
	}


	public DickShoot(double timeout) {
		super(timeout);
		// TODO Auto-generated constructor stub
	}

	public DickShoot(String name, double timeout) {
		super(name, timeout);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void execute() {
		Robot.dick.Dickshoot();
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
