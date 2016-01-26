package org.usfirst.frc.team743.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

    // Talons
    public static final int TalonBackRight = 2,
                            TalonBackLeft  = 3,
                            TalonFrontRight = 0,
                            TalonFrontLeft  = 1;
    
    public static final int PneumaticsPortLeft = 0;
    public static final int PneumaticsPortRight = 1;
    
    /*public static final int CrawOpenorClosePort = 6,
    		                CrawUpDownPort = 8,
                            CrawSpinPort = 7;
    
    public static final int SonarPingChannel = 4,
    						SonarEchoChannel = 5;*/ 
}
