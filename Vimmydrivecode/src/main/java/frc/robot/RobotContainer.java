
package frc.robot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.GenericHID;
import frc.robot.commands.TankDrive;
import frc.robot.subsystems.DriveCode;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;


/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();

  private final DriveCode driveCode = new DriveCode();

  private final static XboxController driverController = new XboxController(0);

  public RobotContainer() {
    // Default Commands
    driveCode.setDefaultCommand(new TankDrive(driveCode));
    // Configure the button bindings
    configureButtonBindings();
  }

  public static double GetDriverRawAxis(final int axis) {
    return driverController.getRawAxis(axis);
  }

  private void configureButtonBindings() {
  }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return null;
  }

}
