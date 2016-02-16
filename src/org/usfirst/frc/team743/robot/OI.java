package org.usfirst.frc.team743.robot;

import org.usfirst.frc.team743.robot.commands.DickShoot;
import org.usfirst.frc.team743.robot.commands.MobyPullIn;
import org.usfirst.frc.team743.robot.commands.MobyPushOut;
import org.usfirst.frc.team743.robot.commands.Thing1Down;
import org.usfirst.frc.team743.robot.commands.Thing1Up;
import org.usfirst.frc.team743.robot.commands.Thing2Down;
import org.usfirst.frc.team743.robot.commands.Thing2Up;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
//import org.usfirst.frc.team743.robot.commands.CrawToggle;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public Joystick xbox;
	Button buttonA, buttonB, buttonX, buttonY, buttonRB, buttonLB, buttonRT, buttonLT, buttonStart;
	
	public static final int SPEED = 35;
	
	public OI() {
		int A = 1,
			B = 2,
			X = 3,
			Y = 4,
			LB = 5,
			RB = 6,
			SELECT = 7,
			START = 8,
			LTRIGGER = 9,
			RTRIGGER = 10;
		
		int JOYSTICK_PORT = 0;
		
		xbox = new Joystick(JOYSTICK_PORT);
		
		buttonA = new JoystickButton(xbox, A);
		buttonB = new JoystickButton(xbox, B);
		buttonX = new JoystickButton(xbox, X);
		buttonY = new JoystickButton(xbox, Y);
		buttonLB = new JoystickButton(xbox, LB);
		buttonRB = new JoystickButton(xbox, RB);
		buttonLT = new JoystickButton(xbox, LTRIGGER);
		buttonRT = new JoystickButton(xbox, RTRIGGER);
		buttonStart = new JoystickButton(xbox, START);
		
		// To change controls, edit below
		

	  //buttonX.whenPressed(new CrawToggle());

		buttonLB.whileHeld(new MobyPullIn());
		buttonRB.whileHeld(new DickShoot());
		buttonStart.whileHeld(new MobyPushOut());
        buttonA.whileHeld(new Thing1Up());
        buttonB.whileHeld(new Thing1Down());
        buttonX.whileHeld(new Thing2Up());
        buttonY.whileHeld(new Thing2Down());
		
	}
	

//	
//	public double getRotation() {
//		
//		return this.Buffer(xbox.getRawAxis(4) * ((float)SPEED / 50.0));
//	}
//	public double getDirection() {
//		return this.Buffer(this.xbox.getDirectionDegrees());
//	}
//	public double getMagnitude() {
//		return this.Buffer(this.xbox.getMagnitude() * ((float)SPEED / 100.0));
//	}
	
	/**
	 * @param val
	 * @return val
	 * 
	 * Analog values from the xbox controller should be passed through
	 * this buffer class.  This has a threshold value that will be 
	 * ignored, such that small/accidental taps of the controls won't 
	 * do anything. 
	 */
	private double Buffer(double val)
	{
		double buffer = 0.05;
		if (Math.abs(val) < buffer) {
			val = 0.0;
		}
		return val;
	}
	
	
	
}

