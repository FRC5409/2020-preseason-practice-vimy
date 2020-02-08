/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.commands.TankDrive;

public class DriveCode extends SubsystemBase {
 private final WPI_TalonSRX motorLeft1;
 private final WPI_TalonSRX motorLeft2;
 private final WPI_TalonSRX motorRight1;
 private final WPI_TalonSRX motorRight2;
  /**
   * Creates a new DriveCode.
   */
  public DriveCode() {
    motorLeft1 = new WPI_TalonSRX(Constants.MOTOR_LEFT_1_ID);
    motorLeft2 = new WPI_TalonSRX(Constants.MOTOR_LEFT_2_ID);
    motorRight1 = new WPI_TalonSRX(Constants.MOTOR_RIGHT_1_ID);
    motorRight2 = new WPI_TalonSRX(Constants.MOTOR_RIGHT_2_ID);
  }

  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void setLeftMotors(double speed) {
    motorLeft1.set(ControlMode.PercentOutput, -speed);
    motorLeft2.set(ControlMode.PercentOutput, -speed);
  }
  public void setRightMotors(double speed) {
    motorRight1.set(ControlMode.PercentOutput, speed);
    motorRight2.set(ControlMode.PercentOutput, speed);
  }

}
