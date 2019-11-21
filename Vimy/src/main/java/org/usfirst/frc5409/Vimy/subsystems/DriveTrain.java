// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5409.Vimy.subsystems;


import org.usfirst.frc5409.Vimy.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;

import com.ctre.phoenix.motorcontrol.ControlMode;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class DriveTrain extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private WPI_TalonSRX mot_leftDriveFront_talonSRX_C20;
    private WPI_TalonSRX mot_leftDriveRear_talonSRX_C21;
    private SpeedControllerGroup left_canSpeedGroup;
    private WPI_TalonSRX mot_rightDriveFront_talonSRX_C22;
    private WPI_TalonSRX mot_rightDriveRear_talonSRX_C23;
    private SpeedControllerGroup right_canSpeedGroup;
    private DifferentialDrive robotDiffDrive;
    private DoubleSolenoid dsl_leftShiftSoleniod;
    private DoubleSolenoid dsl_rightShiftSolenoid;
    private Encoder enc_xxxx_rightDrive_quadratureEncoder;
    private Encoder enc_xxxx_leftDrive_quadratureEncoder;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public DriveTrain() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        mot_leftDriveFront_talonSRX_C20 = new WPI_TalonSRX(20);
        
        
        
        mot_leftDriveRear_talonSRX_C21 = new WPI_TalonSRX(21);
        
        
        
        
        
        //Set SlaveSpeedControllers to Follow MasterSpeedController
        mot_leftDriveRear_talonSRX_C21.follow(mot_leftDriveFront_talonSRX_C20);
                
                
        
        mot_rightDriveFront_talonSRX_C22 = new WPI_TalonSRX(22);
        
        
        
        mot_rightDriveRear_talonSRX_C23 = new WPI_TalonSRX(23);
        
        
        
        
        
        //Set SlaveSpeedControllers to Follow MasterSpeedController
        mot_rightDriveRear_talonSRX_C23.follow(mot_rightDriveFront_talonSRX_C22);
                
                
        
        robotDiffDrive = new DifferentialDrive(left_canSpeedGroup, mot_leftDriveFront_talonSRX_C20);
        addChild("robotDiffDrive",robotDiffDrive);
        robotDiffDrive.setSafetyEnabled(true);
        robotDiffDrive.setExpiration(0.1);
        robotDiffDrive.setMaxOutput(1.0);

        
        dsl_leftShiftSoleniod = new DoubleSolenoid(0, 0, 1);
        addChild("d_leftShiftSoleniod",dsl_leftShiftSoleniod);
        
        
        dsl_rightShiftSolenoid = new DoubleSolenoid(0, 2, 3);
        addChild("d_rightShiftSolenoid",dsl_rightShiftSolenoid);
        
        
        enc_xxxx_rightDrive_quadratureEncoder = new Encoder(0, 1, false, EncodingType.k4X);
        addChild("s_xxxx_rightDrive_quadratureEncoder",enc_xxxx_rightDrive_quadratureEncoder);
        enc_xxxx_rightDrive_quadratureEncoder.setDistancePerPulse(1.0);
        enc_xxxx_rightDrive_quadratureEncoder.setPIDSourceType(PIDSourceType.kRate);
        
        enc_xxxx_leftDrive_quadratureEncoder = new Encoder(2, 3, false, EncodingType.k4X);
        addChild("s_xxxx_leftDrive_quadratureEncoder",enc_xxxx_leftDrive_quadratureEncoder);
        enc_xxxx_leftDrive_quadratureEncoder.setDistancePerPulse(1.0);
        enc_xxxx_leftDrive_quadratureEncoder.setPIDSourceType(PIDSourceType.kRate);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void setLeftMotor(double speed){
        mot_leftDriveFront_talonSRX_C20.set(ControlMode.PercentOutput, -speed);
        mot_leftDriveRear_talonSRX_C21.set(ControlMode.PercentOutput, -speed);
    }

    public void setRightMotor(double speed){
        mot_rightDriveFront_talonSRX_C22.set(ControlMode.PercentOutput, speed);
        mot_rightDriveRear_talonSRX_C23.set(ControlMode.PercentOutput, speed);
    }
}

