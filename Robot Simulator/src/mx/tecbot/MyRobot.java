package mx.tecbot;

import mx.tecbot.alex.robot.Button;
import mx.tecbot.alex.robot.Command;
import mx.tecbot.alex.robot.DriveTrain;
import mx.tecbot.alex.robot.IterativeRobot;
import mx.tecbot.alex.robot.PneumaticController;
import mx.tecbot.alex.robot.Scheduler;

public class MyRobot extends IterativeRobot{
	
	

	int direction = 0;
	
	static PneumaticController pneum;
	static DriveTrain drive=new DriveTrain();
	
	public MyRobot(){
	super();
	System.out.println("MyRobot Constructor");
 pneum = new PneumaticController();
	
}
	static ArmSubsystem arm;
	protected void robotInit(){
	
		System.out.println("My robot init");
        
		Button a = new Button(Button.BUTTON_KEY_A, new TeleopCommand());
		
		Button s = new Button(Button.BUTTON_KEY_S, new TeleopCommand());
		
		Button g = new Button(Button.BUTTON_KEY_D, new ArmCommand());
}
	protected void autonomousInit(){
		direction =0;
		//System.out.println("MyRobot autonomous Init");
		Scheduler.getInstance().addCommand(new AutonomousCommand());
	}
	protected void autonomousPeriodic(){
		direction++;
		//System.out.println("varable direction: "+direction);
	Scheduler.getInstance().run();
	}
	
	protected void  teleopInit(){
	//System.out.println("My robot teleop init");
		
		Scheduler.getInstance().addCommand(new TeleopCommand());
	}
	
	protected void teleopPeriodic(){
		System.out.println("My robot teleop periodic");
		MyRobot.drive.drive(1,0);
		Scheduler.getInstance().run();
	
		
		
	}
}
