/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.usfirst.frc.team743.robot.subsystems;

import org.usfirst.frc.team743.robot.RobotMap;
import org.usfirst.frc.team743.robot.commands.DriveWithXbox;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author ACER
 */
public class DriveTrain extends Subsystem {

    RobotDrive motors;

    public DriveTrain() {
        super("DriveTrain");
        System.out.println("Instantiating drivetrain");
        motors = new RobotDrive( RobotMap.TalonBackRight, RobotMap.TalonBackLeft);
        
    }

    public void initDefaultCommand() {
        // Set he default command for a subsystem here.
        setDefaultCommand(new DriveWithXbox());
    }
    
   public void MotorTankDrive (Joystick stick) {
	   System.out.println("Drivetrain::MotorTankDrive");
	   // sorta works
	   //motors.arcadeDrive(stick);
	   
	   // doesn't really work
	   motors.tankDrive(stick.getRawAxis(1), stick.getRawAxis(5));
	   System.out.println("rawAxis(2) " + stick.getRawAxis(1) + " rawAxis(5) " + stick.getRawAxis(5));
	   //motors.arcadeDrive(stick.getRawAxis(1), stick.getRawAxis(0)*-1);
			   
   }

}
