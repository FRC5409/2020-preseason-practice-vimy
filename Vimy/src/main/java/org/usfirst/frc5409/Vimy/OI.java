package org.usfirst.frc5409.Vimy;

import org.usfirst.frc5409.Vimy.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class OI {
    
    public OI() {
    private XboxController driverController = new XboxController(0);
    
    public double getDriverRawAxis (int axis){
        return driverController.getRawAxis(axis);
    }
    }
}

