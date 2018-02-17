package mx.tecbot;

import mx.tecbot.alex.robot.Command;
import mx.tecbot.alex.robot.DriveTrain;
import mx.tecbot.alex.robot.PneumaticController;

public class TeleopCommand extends Command{

	int timer =0;


	public void start(){
		
	}
	public void initialize(){
		

		
	}
	
	
	
	
	public void execute(){
		
		
		MyRobot.pneum.doOn();

		DriveTrain drive = new DriveTrain();
		drive.drive(1, 0);
		System.out.println("si funciona!!!!!!!!!!!!!!!!!!!!!!!");
		
		
		
	}
	
	
	public boolean isFinished(){
		if(timer <100){
		return true;}
		return false;
	}
}
