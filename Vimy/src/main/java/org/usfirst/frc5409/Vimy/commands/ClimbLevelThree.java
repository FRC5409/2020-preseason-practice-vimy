package org.usfirst.frc5409.Vimy.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class ClimbLevelThree extends CommandGroup {

  public ClimbLevelThree() {
  addSequential(new ShoulderLevelThree());
  addSequential(new ElbowLevelThree());
  addSequential(new WristLevelThree());
  addSequential(new PneumaticPistonLevelThree());
  }
}
