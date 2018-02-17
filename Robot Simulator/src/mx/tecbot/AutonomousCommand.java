package mx.tecbot;
import mx.tecbot.alex.robot.Command;
public class AutonomousCommand extends Command{

	int timer = 0;
	

	public void excecute(){
		timer++;
		System.out.println("I´m gong!!!!!!!! autonomous");
		
	}
	public boolean isFinished(){
		if (timer > 1000){
			return true;
		}
		return false;
	}
}
