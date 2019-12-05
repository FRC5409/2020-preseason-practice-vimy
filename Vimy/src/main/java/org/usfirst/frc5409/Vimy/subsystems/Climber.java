package org.usfirst.frc5409.Vimy.subsystems;


import org.usfirst.frc5409.Vimy.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.DoubleSolenoid;

public class Climber extends Subsystem {

    private DoubleSolenoid d_leftClimbSoleniod;
    private DoubleSolenoid d_rightClimbSolenoid;
    private WPI_VictorSPX m_climbDrive_victorSPX_C15;


    public Climber() {
      
        d_leftClimbSoleniod = new DoubleSolenoid(0, 4, 5);
        addChild("d_leftClimbSoleniod",d_leftClimbSoleniod);
        
        
        d_rightClimbSolenoid = new DoubleSolenoid(0, 6, 7);
        addChild("d_rightClimbSolenoid",d_rightClimbSolenoid);
        
        
        m_climbDrive_victorSPX_C15 = new WPI_VictorSPX(15);
        
    }

    @Override
    public void initDefaultCommand() {
       
    }

    @Override
    public void periodic() {

    }
    public void extend() {
        d_leftClimbSoleniod.set(DoubleSolenoid.Value.kForward);
        d_rightClimbSolenoid.set(DoubleSolenoid.Value.kForward);
    }

	public void retract() {
        d_leftClimbSoleniod.set(DoubleSolenoid.Value.kReverse);
        d_rightClimbSolenoid.set(DoubleSolenoid.Value.kReverse);
    }
}

