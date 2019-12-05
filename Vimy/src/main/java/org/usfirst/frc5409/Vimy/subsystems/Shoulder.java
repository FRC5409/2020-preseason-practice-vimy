package org.usfirst.frc5409.Vimy.subsystems;

import org.usfirst.frc5409.Vimy.commands.*;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import com.revrobotics.CANError;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder.IndexingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;


public class Shoulder extends PIDSubsystem {

    private CANSparkMax m_shoulderMaster_SparkMax_C30;
    private CANSparkMax m_shoulderSlave_SparkMax_C31;
    private Encoder indexedEncoder1;

    public Shoulder() {
       
        super("Shoulder", 1.0, 0.0, 0.0);
        setAbsoluteTolerance(0.2);
        getPIDController().setContinuous(false);
        getPIDController().setName("Shoulder", "PIDSubsystem Controller");
        LiveWindow.add(getPIDController());

        m_shoulderMaster_SparkMax_C30 = new CANSparkMax(30, MotorType.kBrushless);
        
        m_shoulderMaster_SparkMax_C30.restoreFactoryDefaults();  
        m_shoulderMaster_SparkMax_C30.setInverted(false);
        m_shoulderMaster_SparkMax_C30.setIdleMode(IdleMode.kCoast);
  
        
        m_shoulderSlave_SparkMax_C31 = new CANSparkMax(31, MotorType.kBrushless);
        
        m_shoulderSlave_SparkMax_C31.restoreFactoryDefaults();  
        m_shoulderSlave_SparkMax_C31.setInverted(false);
        m_shoulderSlave_SparkMax_C31.setIdleMode(IdleMode.kCoast);
  
        
        indexedEncoder1 = new Encoder(4, 5, false);
        addChild("Indexed Encoder 1",indexedEncoder1);
        indexedEncoder1.setDistancePerPulse(1.0);
        indexedEncoder1.setPIDSourceType(PIDSourceType.kRate);
        indexedEncoder1.setIndexSource(6, IndexingType.kResetOnRisingEdge);
        
    }

    @Override
    public void initDefaultCommand() {

    }

    @Override
    protected double returnPIDInput() {
      
        return indexedEncoder1.pidGet();

    }

    @Override
    protected void usePIDOutput(double output) {
    
        m_shoulderMaster_SparkMax_C30.pidWrite(output);

    }


}
