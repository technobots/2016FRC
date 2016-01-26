package org.usfirst.frc.team743.robot.commands;

import org.usfirst.frc.team743.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/*public class DriveUntilDistance extends Command {

	private double STOP_AT_DISTANCE = 0.0;  // stop driving at 0.0 inches away from something
	
	private double fullSpeed,
    				direction,
    				rotation,
    				distance;
	
	private boolean reachedDistance = false;
	private double currentSpeed = 0.01;
	
	
	public DriveUntilDistance(double fullSpeed, double direction, double rotation, double distance)
	{
		requires(Robot.drivetrain);
      //requires(Robot.sonar);
		
		this.fullSpeed = fullSpeed;
		this.direction = direction;
		this.rotation = rotation;
	}
	*/

	//@Override
	//protected void initialize() 
	//{
	//	reachedDistance = false;
	//}	

	//@Override
	/*protected void execute() 
	{
		double inchesAway = Robot.sonar.GetRangeInches();
		System.out.println("Current Distance: " + inchesAway + " inches");
		
		
		
	if (inchesAway > SLOW_DOWN_DISTANCE) 
		{
			if (this.currentSpeed <= this.fullSpeed) {
				this.currentSpeed += 0.01;
			}
			Robot.drivetrain.MecanumDrive(this.currentSpeed, this.direction, this.rotation);
		} 
		else if (inchesAway > STOP_AT_DISTANCE) 
		{
			// slow down to 1/3 the speed
			Robot.drivetrain.MecanumDrive(this.currentSpeed / 3.0, this.direction, this.rotation);
		} 
		else
		{
			Robot.drivetrain.MecanumDrive(0, 0, 0);
			reachedDistance = true;
		}
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return reachedDistance;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}
*/