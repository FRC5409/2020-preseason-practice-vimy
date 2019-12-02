/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc5409.Vimy.commands;

import org.usfirst.frc5409.Vimy.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class MoveShoulder extends Command {
  //Set up doubles that can be manipulated for set values
  double m_time, m_speed;

  public MoveShoulder(double time, double speed) {
    m_time=time;
    m_speed=speed;
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.shoulder);
  }

  // Called just before this Command runs the first time
  public MoveShoulder() {
}

@Override
  protected void initialize() {
    Robot.shoulder.setMotors(m_speed);
    setTimeout(m_time);
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return isTimedOut();
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.shoulder.setMotors(0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
