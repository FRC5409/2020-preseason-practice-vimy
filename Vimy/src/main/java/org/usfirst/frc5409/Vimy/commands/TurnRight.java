/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc5409.Vimy.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class TurnRight extends CommandGroup {
  //Command group for a right turn that can be used in conjunction with encoders to change values for precise pathing
  public TurnRight() {
    //Moves forward at half speed for two seconds
    addSequential(new Move(2,0.5,0.5));
    //Turn to the right at three quarters speed for five seconds
    addSequential(new Move(1.5,-0.75, 0.75));
    //Move forward at three quarters speed for two seconds 
    addSequential(new Move(2, 0.75, 0.75));
    // Add Commands here:
    // e.g. addSequential(new Command1());
    // addSequential(new Command2());
    // these will run in order.

    // To run multiple commands at the same time,
    // use addParallel()
    // e.g. addParallel(new Command1());
    // addSequential(new Command2());
    // Command1 and Command2 will run in parallel.

    // A command group will require all of the subsystems that each member
    // would require.
    // e.g. if Command1 requires chassis, and Command2 requires arm,
    // a CommandGroup containing them would require both the chassis and the
    // arm.
  }
}
