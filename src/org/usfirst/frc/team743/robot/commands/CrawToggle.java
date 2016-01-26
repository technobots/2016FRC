/* Author: John
package org.usfirst.frc.team743.robot.commands;

import org.usfirst.frc.team743.robot.Robot; 

import edu.wpi.first.wpilibj.command.Command;

public class CrawToggle extends Command {

	private static boolean isOpen = false;
	
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		requires(Robot.craw);
	}

	@Override
	protected void execute() {
		if (isOpen) {
			Robot.craw.CrawOpenorCloseClose();
			isOpen = false;
		} else {
			Robot.craw.CrawOpenorCloseOpen();
			isOpen = true;
		}
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

}*/
