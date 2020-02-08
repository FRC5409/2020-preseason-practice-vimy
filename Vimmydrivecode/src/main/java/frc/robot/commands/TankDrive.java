/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.DriveCode;
import frc.robot.RobotContainer;

public class TankDrive extends CommandBase {
  private final DriveCode driveCodeSubsystem;
  /**
   * Creates a new TankDrive.
   */
  public TankDrive(DriveCode subsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    driveCodeSubsystem = subsystem;
    addRequirements(driveCodeSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double leftStickY = RobotContainer.GetDriverRawAxis(Constants.LEFT_STICK_Y);
    double rightStickY = RobotContainer.GetDriverRawAxis(Constants.RIGHT_STICK_Y);

    driveCodeSubsystem.setLeftMotors(leftStickY);
    driveCodeSubsystem.setRightMotors(rightStickY);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    driveCodeSubsystem.setLeftMotors(0);
    driveCodeSubsystem.setRightMotors(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}

