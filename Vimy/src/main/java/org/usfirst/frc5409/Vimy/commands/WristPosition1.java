/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc5409.Vimy.commands;

public class WristPosition1 extends Cowpilibj.command.Command;

import org.usfirst.frc5409.Vimy.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class WristPosition1 extends Command {
  puistPositiirst..mmand
   g. requires(chassis);
}
import edu.wpi.first.wpilibj.command.Command;

public class WristPosition1 extends Command {
  public WristPosition1() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
  }
 // Use requires() here to declare subsystem dependencies
    requires(Robot.wrist);
  }

  double error = Robot.wrist.getSetpoint() - Robot.wrist.getWristAngle();


  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
