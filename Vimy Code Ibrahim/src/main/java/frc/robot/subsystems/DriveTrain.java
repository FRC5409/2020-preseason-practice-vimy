/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.TankDrive;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {

  TalonSRX m_leftDriveFront = new TalonSRX(RobotMap.m_leftDriveFront_ID);
  TalonSRX m_leftDriveRear = new TalonSRX(RobotMap.m_leftDriveRear_ID);
  TalonSRX m_rightDriveFront = new TalonSRX(RobotMap.m_rightDriveFront_ID);
  TalonSRX m_rightDriveRear = new TalonSRX(RobotMap.m_rightDriveRear_ID);
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new TankDrive());  
  }

  public void setLeftMotors(double speed) {
    m_leftDriveFront.set(ControlMode.PercentOutput, -speed);
    m_leftDriveRear.set(ControlMode.PercentOutput, -speed); 
  }

  public void setRightMotors(double speed) {
    m_rightDriveFront.set(ControlMode.PercentOutput, speed);
    m_rightDriveRear.set(ControlMode.PercentOutput, speed); 
  }
}
