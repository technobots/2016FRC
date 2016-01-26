/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc.team743.robot.subsystems;

import org.usfirst.frc.team743.robot.RobotMap;
import org.usfirst.frc.team743.robot.commands.*;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 * @author ACER
 */
public class Pneumatics extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    Solenoid pneumaticsLeft;
    Solenoid pneumaticsRight;
    
    public Pneumatics()
    {
        super("ArmsPneumatic");
        pneumaticsLeft = new Solenoid(RobotMap.PneumaticsPortLeft);
        pneumaticsRight = new Solenoid(RobotMap.PneumaticsPortRight);
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new PneumaticsDoNothing());   
    }
    
    public void Down()
    {
    	pneumaticsLeft.set(false);
    	pneumaticsRight.set(false);
        
    }
    public void Up()
    {
    	pneumaticsRight.set(true);
    	pneumaticsLeft.set(true);
    }
}
