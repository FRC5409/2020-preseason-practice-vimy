/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class DepositBall extends CommandGroup {
  /**
   * Add your docs here.
   */
  public DepositBall() {
    addParallel(new MoveElbow(1, -0.55));
    addParallel(new MoveWrist(0.5, -0.4));
    addSequential(new GrabOrReleaseBall(0.5, 0.3));
  }
}
