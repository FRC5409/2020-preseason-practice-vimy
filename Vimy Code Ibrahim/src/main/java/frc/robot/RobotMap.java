/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	public static final int m_leftDriveFront_ID = 20;
	public static final int m_leftDriveRear_ID = 21;
  public static final int m_rightDriveFront_ID = 22;
  public static final int m_rightDriveRear_ID = 23;

  public static final int driverControllerPort = 1;
  public static final int leftStickY = 1;
  public static final int rightStickY = 5;
  public static final int buttonX = 3;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
