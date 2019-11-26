package org.usfirst.frc5409.Vimy;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath.Axis;

import org.usfirst.frc5409.Vimy.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class OI {
    
    public OI() {
    XboxController driverController = new XboxController(0);
    public Joystick getControlStick(){
        return controlStick;
    }
    public double getDriverRawAxis(int axis){
        return driverController.getRawAxis(axis);
    }
    }
}

