// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package org.usfirst.frc78.FRC2012;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc78.FRC2012.commands.*;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
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
    public JoystickButton bridgeLowerButton;
    public JoystickButton bridgeRaiseButton;
    public JoystickButton driveFlipButton;
    public Joystick driverStick;
    public JoystickButton conveyorUpButton;
    public JoystickButton conveyorDownButton;
    public JoystickButton aimTargetButton;
    public JoystickButton shootBallButton;
    public JoystickButton hiShootBallButton;
    public JoystickButton loShootBallButton;
    public JoystickButton pickBallButton;
    public JoystickButton rejectBallButton;
    public Joystick payloadStick;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        payloadStick = new Joystick(2);
        
        rejectBallButton = new JoystickButton(payloadStick, 7);
        rejectBallButton.whileHeld(new RejectBall());
        pickBallButton = new JoystickButton(payloadStick, 5);
        pickBallButton.whileHeld(new PickBall());
        loShootBallButton = new JoystickButton(payloadStick, 3);
        loShootBallButton.whileHeld(new ShootBallKey2Pt());
        hiShootBallButton = new JoystickButton(payloadStick, 4);
        hiShootBallButton.whileHeld(new ShootBallKey3pt());
        shootBallButton = new JoystickButton(payloadStick, 2);
        shootBallButton.whileHeld(new ShootBallFender());
        aimTargetButton = new JoystickButton(payloadStick, 10);
        aimTargetButton.whileHeld(new TurretAim());
        conveyorDownButton = new JoystickButton(payloadStick, 8);
        conveyorDownButton.whileHeld(new SendBallDown());
        conveyorUpButton = new JoystickButton(payloadStick, 6);
        conveyorUpButton.whileHeld(new SendBallUp());
        driverStick = new Joystick(1);
        
        driveFlipButton = new JoystickButton(driverStick, 10);
        driveFlipButton.whenPressed(new FlipDriveDirection());
        bridgeRaiseButton = new JoystickButton(driverStick, 6);
        bridgeRaiseButton.whenReleased(new RaiseFangs());
        bridgeLowerButton = new JoystickButton(driverStick, 6);
        bridgeLowerButton.whenPressed(new LowerFangs());
	    
        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("LowerFangs", new LowerFangs());
        SmartDashboard.putData("RaiseFangs", new RaiseFangs());
        SmartDashboard.putData("FlipDriveDirection", new FlipDriveDirection());
        SmartDashboard.putData("PickBall", new PickBall());
        SmartDashboard.putData("RejectBall", new RejectBall());
        SmartDashboard.putData("SendBallUp", new SendBallUp());
        SmartDashboard.putData("SendBallDown", new SendBallDown());
        SmartDashboard.putData("ShootBallFender", new ShootBallFender());
        SmartDashboard.putData("ShootBallKey2Pt", new ShootBallKey2Pt());
        SmartDashboard.putData("ShootBallKey3pt", new ShootBallKey3pt());
        SmartDashboard.putData("TurretAim", new TurretAim());
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getdriverStick() {
        return driverStick;
    }
    public Joystick getpayloadStick() {
        return payloadStick;
    }
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}
