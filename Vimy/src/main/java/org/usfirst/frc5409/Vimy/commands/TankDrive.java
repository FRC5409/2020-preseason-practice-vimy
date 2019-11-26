/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc5409.Vimy.commands;

import org.usfirst.frc5409.Vimy.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class TankDrive extends Command {
  public TankDrive() {
    requires(Robot.driveTrain);
  }

  @Override
  protected void initialize() {

  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    double leftStickY = Robot.oi.getDriverRawAxis(1);
    double rightStickY = Robot.oi.getDriverRawAxis(0);

    Robot.driveTrain.setLeftMotors(leftStickY*0.5);
    Robot.driveTrain.setRightMotors(rightStickY*0.5);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.driveTrain.setLeftMotor(0);
    Robot.driveTrain.setRightMotor(0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    this.end();
  }
}
