package org.usfirst.frc5409.Vimy;

import org.usfirst.frc5409.Vimy.commands.*;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc5409.Vimy.subsystems.*;

public class OI {
    public JoystickButton joystickButton1;
    public JoystickButton joystickButton2;
    public JoystickButton joystickButton3;
    public JoystickButton joystickButton4;
    public JoystickButton joystickButton5;
    public Joystick driveStick;
    public JoystickButton joystickButton6;
    public JoystickButton joystickButton7;
    public JoystickButton joystickButton8;
    public JoystickButton joystickButton9;
    public Joystick controlStick;
    
    public OI() {
        controlStick = new Joystick(1);
        
        joystickButton9 = new JoystickButton(controlStick, 4);
        joystickButton9.whileHeld(new AutonomousCommand());
        joystickButton8 = new JoystickButton(controlStick, 3);
        joystickButton8.whileHeld(new AutonomousCommand());
        joystickButton7 = new JoystickButton(controlStick, 2);
        joystickButton7.whileHeld(new AutonomousCommand());
        joystickButton6 = new JoystickButton(controlStick, 1);
        joystickButton6.whileHeld(new AutonomousCommand());
        driveStick = new Joystick(0);
        
        joystickButton5 = new JoystickButton(driveStick, 5);
        joystickButton5.whileHeld(new AutonomousCommand());
        joystickButton4 = new JoystickButton(driveStick, 4);
        joystickButton4.whileHeld(new AutonomousCommand());
        joystickButton3 = new JoystickButton(driveStick, 3);
        joystickButton3.whileHeld(new AutonomousCommand());
        joystickButton2 = new JoystickButton(driveStick, 2);
        joystickButton2.whileHeld(new AutonomousCommand());
        joystickButton1 = new JoystickButton(driveStick, 1);
        joystickButton1.whileHeld(new AutonomousCommand());

        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
    }

        public Joystick getdriveStick() {
            return driveStick;
        }
    
        public Joystick getcontrolStick() {
            return controlStick;
        }
public double GetDriverRawAxis(int axis){
    return driveStick.getRawAxis(axis);
    }
}


