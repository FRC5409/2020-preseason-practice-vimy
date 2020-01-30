/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.RobotMap;

public class TankDrive extends Command {
  public TankDrive() {
    requires(Robot.driveCode);
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    double leftStickY = Robot.GetDriverRawAxis(RobotMap.LEFT_STICK_Y);
    double rightStickY = Robot.GetDriverRawAxis(RobotMap.RIGHT_STICK_Y);

    Robot.driveCode.setLeftMotors(leftStickY);
    Robot.driveCode.setRightMotors(rightStickY);
  }
`
  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.driveCode.setLeftMotors(0);
    Robot.driveCode.setRightMotors(0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    this.end();
  
  }


}
