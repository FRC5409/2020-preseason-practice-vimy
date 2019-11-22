/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.Encoder.IndexingType;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import frc.robot.Robot;

/**
 * Add your docs here.
 */
public class Elbow extends PIDSubsystem {
  /**
   * Add your docs here.
   */
  public WPI_VictorSPX m_elbow_victorSPX_C11 = new WPI_VictorSPX(11);

  public Elbow() {
    // Intert a subsystem name and PID values here
    super("Elbow", 1, 0, 0);
    setAbsoluteTolerance(0.2);
    getPIDController().setContinuous(false);
    getPIDController().setName("Elbow", "PIDSubsystem Controller");
    LiveWindow.add(getPIDController());

    Encoder s_xxxx_elbowAbsoluteEncoder = new Encoder(7, 8, false);
    addChild("s_xxxx_elbowAbsoluteEncoder",s_xxxx_elbowAbsoluteEncoder);
    s_xxxx_elbowAbsoluteEncoder.setDistancePerPulse(1.0);
    s_xxxx_elbowAbsoluteEncoder.setPIDSourceType(PIDSourceType.kRate);
    s_xxxx_elbowAbsoluteEncoder.setIndexSource(9, IndexingType.kResetOnRisingEdge);
    
 

    // Use these to get going:
    // setSetpoint() - Sets where the PID controller should move the system
    // to
    // enable() - Enables the PID controller.
  }

  public void setElbowMotor(double speed) {
    m_elbow_victorSPX_C11.set(ControlMode.PercentOutput, speed);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  @Override
  protected double returnPIDInput() {
	// Return your input value for the PID loop
    // e.g. a sensor, like a potentiometer:
    // yourPot.getAverageVoltage() / kYourMaxVoltage;
    return 0;
  }

  @Override
  protected void usePIDOutput(double output) {
    // Use output to drive your system, like a motor
    // e.g. yourMotor.set(output);
  }
}
