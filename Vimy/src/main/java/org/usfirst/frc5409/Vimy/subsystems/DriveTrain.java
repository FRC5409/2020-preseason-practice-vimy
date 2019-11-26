package org.usfirst.frc5409.Vimy.subsystems;


import org.usfirst.frc5409.Vimy.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;


public class DriveTrain extends Subsystem {

    private WPI_TalonSRX m_leftDriveFront_talonSRX_C20;
    private WPI_TalonSRX m_leftDriveRear_talonSRX_C21;
    private SpeedControllerGroup left_canSpeedGroup;
    private WPI_TalonSRX m_rightDriveFront_talonSRX_C22;
    private WPI_TalonSRX m_rightDriveFront_talonSRX_C23;
    private SpeedControllerGroup right_canSpeedGroup;
    private DifferentialDrive robotDiffDrive;
    private DoubleSolenoid d_leftShiftSoleniod;
    private DoubleSolenoid d_rightShiftSolenoid;
    private Encoder s_xxxx_rightDrive_quadratureEncoder;
    private Encoder s_xxxx_leftDrive_quadratureEncoder;

    public DriveTrain() {
    
        m_leftDriveFront_talonSRX_C20 = new WPI_TalonSRX(20); 
        m_leftDriveRear_talonSRX_C21 = new WPI_TalonSRX(21);
        
        //Set SlaveSpeedControllers to Follow MasterSpeedController
        m_leftDriveRear_talonSRX_C21.follow(m_leftDriveFront_talonSRX_C20);
                
                 
        m_rightDriveFront_talonSRX_C22 = new WPI_TalonSRX(22);
        m_rightDriveFront_talonSRX_C23 = new WPI_TalonSRX(23);
         
        //Set SlaveSpeedControllers to Follow MasterSpeedController
        m_rightDriveFront_talonSRX_C23.follow(m_rightDriveFront_talonSRX_C22);
                

        robotDiffDrive = new DifferentialDrive(left_canSpeedGroup, m_leftDriveFront_talonSRX_C20);
        addChild("robotDiffDrive",robotDiffDrive);
        robotDiffDrive.setSafetyEnabled(true);
        robotDiffDrive.setExpiration(0.1);
        robotDiffDrive.setMaxOutput(1.0);

        
        d_leftShiftSoleniod = new DoubleSolenoid(0, 0, 1);
        addChild("d_leftShiftSoleniod",d_leftShiftSoleniod);
        
        
        d_rightShiftSolenoid = new DoubleSolenoid(0, 2, 3);
        addChild("d_rightShiftSolenoid",d_rightShiftSolenoid);
        
        
        s_xxxx_rightDrive_quadratureEncoder = new Encoder(0, 1, false, EncodingType.k4X);
        addChild("s_xxxx_rightDrive_quadratureEncoder",s_xxxx_rightDrive_quadratureEncoder);
        s_xxxx_rightDrive_quadratureEncoder.setDistancePerPulse(1.0);
        s_xxxx_rightDrive_quadratureEncoder.setPIDSourceType(PIDSourceType.kRate);
        
        s_xxxx_leftDrive_quadratureEncoder = new Encoder(2, 3, false, EncodingType.k4X);
        addChild("s_xxxx_leftDrive_quadratureEncoder",s_xxxx_leftDrive_quadratureEncoder);
        s_xxxx_leftDrive_quadratureEncoder.setDistancePerPulse(1.0);
        s_xxxx_leftDrive_quadratureEncoder.setPIDSourceType(PIDSourceType.kRate);

    }

    @Override
    public void initDefaultCommand() {
        setDefaultCommand(new Drive());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    public void setLeftMotors(double speed){
        m_leftDriveFront_talonSRX_C20.set(ControlMode.PercentOutput, -speed);
    }
    public void setRightMotors(double speed){
        m_rightDriveFront_talonSRX_C22.set(ControlMode.PercentOutput, speed);
    }
}


