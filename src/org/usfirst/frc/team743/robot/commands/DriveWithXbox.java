/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc.team743.robot.commands;

import org.usfirst.frc.team743.robot.OI; 
import org.usfirst.frc.team743.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 * @author
 */
public class DriveWithXbox extends Command {

    public DriveWithXbox() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

        requires(Robot.drivetrain);
      //requires(Robot.sonar);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.drivetrain.MecanumDrive(	Robot.oi.getMagnitude(), 
        								Robot.oi.getDirection(), 
        								Robot.oi.getRotation());
        //System.out.println("Current Distance: " + Robot.sonar.GetRangeInches());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
