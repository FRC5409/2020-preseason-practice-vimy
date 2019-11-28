package org.usfirst.frc5409.Vimy.commands;

import org.usfirst.frc5409.Vimy.Robot;

import edu.wpi.first.hal.sim.mockdata.RoboRioDataJNI;
import edu.wpi.first.wpilibj.command.Command;

public class ShoulderLevelThree extends Command {
  public ShoulderLevelThree() {
    requires(Robot.shoulder);
  }

  @Override
  protected void initialize() {
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
