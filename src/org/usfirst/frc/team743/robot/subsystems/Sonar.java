//author John Gregorowisc.
// This code activates the MAXBOTIC sensor to measeure distance

/* Sonar sensor bluprint:
 * attach 3 pins (ground, 5v, TX) to RoboRIO DIO port 4 (left pin, middle pin, right pin) 
 * attach 1 pin (RX) to RoboRIO DIO port 5 (Right pin)
 *  
 */


package org.usfirst.frc.team743.robot.subsystems;

import org.usfirst.frc.team743.robot.RobotMap;

import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.command.Subsystem;

/*public class Sonar extends Subsystem {

	Ultrasonic sonar;
	
	public Sonar()
	{
		
		sonar = new Ultrasonic(RobotMap.SonarPingChannel, RobotMap.SonarEchoChannel);
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}
	
	public double GetRangeInches()
	{
		return sonar.getRangeInches();
	}

}*/
