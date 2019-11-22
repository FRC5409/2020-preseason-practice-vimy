/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class EndEffector extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.  
  private WPI_VictorSPX m_effectorWheels_victorSPX_C14;
  private WPI_VictorSPX m_effectorVacuum_victorSPX_C13;

  public EndEffector() {

    m_effectorWheels_victorSPX_C14 = new WPI_VictorSPX(14);
    m_effectorVacuum_victorSPX_C13 = new WPI_VictorSPX(13);
  }

  public void moveBall(double speed) {
    m_effectorWheels_victorSPX_C14.set(ControlMode.PercentOutput, speed);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
