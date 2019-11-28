package org.usfirst.frc5409.Vimy.commands;

import org.usfirst.frc5409.Vimy.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class PneumaticPistonLevelThree extends Command {
  public PneumaticPistonLevelThree() {
    requires(Robot.pneumatics);
  }

  @Override
  protected void initialize() {
    Robot.pneumatics.Extend();
  }

  @Override
  protected void execute() {
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
    Robot.pneumatics.Retract();
  }

  @Override
  protected void interrupted() {
    this.end();
  }
}
