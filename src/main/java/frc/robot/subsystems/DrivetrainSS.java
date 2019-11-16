/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class DrivetrainSS extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public static WPI_TalonSRX leftMotor1;
  public static WPI_TalonSRX leftMotor2;
  public static WPI_TalonSRX rightMotor1;
  public static WPI_TalonSRX rightMotor2;

  public DrivetrainSS(){
    //constructor
    leftMotor1 = new WPI_TalonSRX(RobotMap.leftMotor1);
    leftMotor2 = new WPI_TalonSRX(RobotMap.leftMotor2);
    rightMotor1 = new WPI_TalonSRX(RobotMap.rightMotor1);
    rightMotor2 = new WPI_TalonSRX(RobotMap.rightMotor2);
  }

  public void ArcadeDrive() {  
    
  }

  public void halt(){
    leftMotor1.set(0);
    leftMotor2.set(0);
    rightMotor1.set(0);
    rightMotor2.set(0);
  }

  public void forward(){
    leftMotor1.set(1);
    leftMotor2.set(1);
    rightMotor1.set(1);
    rightMotor2.set(1);
  }

  public void set_speed(double leftspeed, double rightspeed){
    leftMotor1.set(leftspeed);
    leftMotor2.set(leftspeed);
    rightMotor1.set(rightspeed);
    rightMotor2.set(rightspeed);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
