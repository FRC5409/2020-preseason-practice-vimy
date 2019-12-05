package org.usfirst.frc5409.Vimy.commands;

import org.usfirst.frc5409.Vimy.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ExtendPistons extends Command {
  public ExtendPistons() {
    requires(Robot.climber);
  }

  @Override
  protected void initialize() {
    Robot.climber.extend();
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
  
  }

  @Override
  protected void interrupted() {
    this.end();
  }
}
