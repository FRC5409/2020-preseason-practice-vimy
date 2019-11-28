package org.usfirst.frc5409.Vimy.subsystems;

import org.usfirst.frc5409.Vimy.commands.*;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder.IndexingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;

public class Wrist extends PIDSubsystem {

    private Encoder s_xxxx_elbowAbsoluteEncoder;
    private WPI_VictorSPX m_wrist_victorSPX_C12;

    public Wrist() {
        
        super("Wrist", 1.0, 0.0, 0.0);
        setAbsoluteTolerance(0.2);
        getPIDController().setContinuous(false);
        getPIDController().setName("Wrist", "PIDSubsystem Controller");
        LiveWindow.add(getPIDController());


        s_xxxx_elbowAbsoluteEncoder = new Encoder(10, 11, false);
        addChild("s_xxxx_elbowAbsoluteEncoder",s_xxxx_elbowAbsoluteEncoder);
        s_xxxx_elbowAbsoluteEncoder.setDistancePerPulse(1.0);
        s_xxxx_elbowAbsoluteEncoder.setPIDSourceType(PIDSourceType.kRate);
        s_xxxx_elbowAbsoluteEncoder.setIndexSource(12, IndexingType.kResetOnRisingEdge);
        
        m_wrist_victorSPX_C12 = new WPI_VictorSPX(12);
        
    }

    @Override
    public void initDefaultCommand() {
  
    }

    @Override
    protected double returnPIDInput() {
        return s_xxxx_elbowAbsoluteEncoder.pidGet();

    }

    @Override
    protected void usePIDOutput(double output) {
      
        m_wrist_victorSPX_C12.pidWrite(output);

    }


}
