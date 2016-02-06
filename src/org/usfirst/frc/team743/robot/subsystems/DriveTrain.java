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
 * @author miguel
 */
public class DriveTrain extends Subsystem {

    RobotDrive motors;

    public DriveTrain() {

        super("DriveTrain");
        motors = new RobotDrive( RobotMap.TalonBackLeft, RobotMap.TalonBackRight);
        
    }

    public void initDefaultCommand() {
        // Set he default command for a subsystem here.
        setDefaultCommand(new DriveWithXbox());
    }
    
   public void motortankdrive (Joystick stick) {
	   motors.arcadeDrive(stick);
   }

}
