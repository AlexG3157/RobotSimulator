package mx.tecbot;

import mx.tecbot.alex.robot.Command;

public class ArmCommand extends Command{

	int i =0;
	public void start(){i = 0;}
   public void initialize(){}
   public void execute(){
	   if(i<10){
	   MyRobot.arm.armUp();
	   i++;
	   }
   }
   public boolean isFinished(){
	  if(i>=10) return true;
	  
	  return false;
   }
   
}
