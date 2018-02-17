package mx.tecbot;

import mx.tecbot.alex.robot.Subsystem;

public class ArmSubsystem extends Subsystem{

	Motor m = new Motor();
	
	public void armUp(){
		
		m.set(1);
		
	}
	public void armDown(){
		
		m.set(-1);
		
	}
	
	public void armRest(){
		
		m.set(0);
	}
	
}
