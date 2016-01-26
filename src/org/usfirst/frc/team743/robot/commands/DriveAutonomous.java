/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc.team743.robot.commands;

import org.usfirst.frc.team743.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;


/**
 *
 * @author ACER
 */
public class DriveAutonomous extends Command {

    private double magnitude,
                   direction,
                   rotation;
    
    public DriveAutonomous(double magnitude, double direction, double rotation) {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.drivetrain);
        
        this.magnitude = magnitude;
        this.direction = direction;
        this.rotation = rotation;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.drivetrain.MecanumDrive(this.magnitude, this.direction, this.rotation);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        Robot.drivetrain.MecanumDrive(0, 0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}