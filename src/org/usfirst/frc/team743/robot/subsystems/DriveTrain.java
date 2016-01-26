/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.usfirst.frc.team743.robot.subsystems;

import org.usfirst.frc.team743.robot.RobotMap;
import org.usfirst.frc.team743.robot.commands.DriveWithXbox;

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

        motors = new RobotDrive(RobotMap.TalonFrontLeft, 
                                RobotMap.TalonBackLeft, 
                                RobotMap.TalonFrontRight, 
                                RobotMap.TalonBackRight);

        motors.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, false);
        motors.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        motors.setInvertedMotor(RobotDrive.MotorType.kRearLeft, false);
        motors.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveWithXbox());
    }

    public void MecanumDrive(double magnitude, double direction, double rotation) {

         motors.mecanumDrive_Polar(magnitude, direction, rotation);
    }
}
