package org.usfirst.frc5409.Vimy.subsystems;


import org.usfirst.frc5409.Vimy.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;

import edu.wpi.first.wpilibj.Compressor;

public class Pneumatics extends Subsystem {

    private Compressor compressor1;
    public Pneumatics() {
        compressor1 = new Compressor(0);
        addChild("Compressor1",compressor1);
    }

    @Override
    public void initDefaultCommand() {

    }

    @Override
    public void periodic() {
    
    }
    public void compressAir(){
        compressor1.setClosedLoopControl(true);
    }
    public void releaseAir(){
        compressor1.setClosedLoopControl(false);
    }

}

