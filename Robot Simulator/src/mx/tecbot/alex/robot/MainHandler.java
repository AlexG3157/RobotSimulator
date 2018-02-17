package mx.tecbot.alex.robot;
import mx.tecbot.*;
public class MainHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println("Initializing System");
	
	MyRobot impl = new MyRobot();
	InputSimulator input = new InputSimulator();
	
RobotController robot = new RobotController(impl);


Thread mainRobot = new Thread(robot);
Thread inputSim = new Thread(input);

mainRobot.start();
inputSim.start();
try{
	while(mainRobot.isAlive()){
		mainRobot.join();
	}
	
}catch (InterruptedException e){
		
	}
	}

}
