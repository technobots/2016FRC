/*
1 * To change this template, choose Tools | Templates
 * and open the template in the editor.
  n */
package org.usfirst.frc.team743.robot.commands;

import org.usfirst.frc.team743.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 * @author miguel
 */
public class NormalAutonomous extends CommandGroup {

    public NormalAutonomous() {
        
    	requires(Robot.drivetrain);
    	
    	// don't change
        double DRIVE_FORWARD = 0; // angle at which robot drives
        double DRIVE_BACKWARDS = 180;
        
        // can change
        double DRIVE_SPEED = .1; // speed goes from 0 to 1
        double secondsToDriveFor = 2.0;
        
        addSequential(new DriveAutonomous(DRIVE_SPEED, DRIVE_FORWARD, -.01), secondsToDriveFor);
        addSequential(new WaitCommand(1.5));
        addSequential(new PneumaticsUp()); // raise Pneumatics up
        addSequential(new WaitCommand(1.5));
        
        
        secondsToDriveFor = 4.0;
        DRIVE_SPEED = .3;
        
        addSequential(new DriveAutonomous(DRIVE_SPEED, DRIVE_BACKWARDS, -.01), secondsToDriveFor);
        addSequential(new PneumaticsDown());
        
    }
    
  
}
