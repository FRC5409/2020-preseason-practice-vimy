package org.usfirst.frc5409.Vimy.commands;

import org.usfirst.frc5409.Vimy.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Drive extends Command {
  public Drive() {
    requires(Robot.driveTrain);
  }

  @Override
  protected void initialize() {

  }

  @Override
  protected void execute() {
    double leftStickY = Robot.oi.GetDriverRawAxis(0);
    double rightStickY = Robot.oi.GetDriverRawAxis(1);

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
    Robot.driveTrain.setLeftMotors(0);
    Robot.driveTrain.setRightMotors(0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    this.end();
  }
}
