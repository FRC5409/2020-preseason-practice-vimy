// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5409.Vimy;

import org.usfirst.frc5409.Vimy.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    Joystick driverController = new Joystick(1);
    
    public double GetDriverRawAxis(){
        return driverController.getYAxis(2);

    }
   
     //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
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

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

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


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getdriveStick() {
        return driveStick;
    }

    public Joystick getcontrolStick() {
        return controlStick;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

