package mx.tecbot.alex.robot;

import java.util.Vector;

public class RobotController implements Runnable{
	
	PneumaticController  pneum;
	
	
	
	int robot_Init = 0;
	int disabled = 1;
	int autonomous_init = 2;
	int autonomous_periodic = 3;
	int teleop_Init = 4;
	int teleop_Periodic = 5;

	int state = 0;
	
	IterativeRobot robot;
	
	public  static RobotController instance;
	
	private Vector<Button> buttonlist;
	 
	public RobotController(IterativeRobot ir){
		
		
		buttonlist = new Vector<Button>();
		robot = ir;
		
		state = robot_Init;
		RobotController.instance = this;
	}
	
	public void addButton(Button b){
		
		buttonlist.addElement( b );
		
	
	}
	
public void start(){
	
}

/*0 forkey down,1 for key up*/
public void reciveKey(int key, int st){
	if(key == 81){
		state = this.autonomous_init;
		
	}
	if(key == 87){
		state = this.teleop_Init;}
	if(key == 69){
		state = this.disabled;}
	
	for(int i = 0; i<buttonlist.size(); i++){
		if(st==0){
		Button button = buttonlist.get(i);
		
		button.checkState(key);
		}
	}
}

public void run(){
	while(true){
		
		
		try{
			if(state == robot_Init){
				robot.robotInit();
				state = this.disabled;
			}
			if(state == autonomous_init){
			robot.autonomousInit();	
			state = autonomous_periodic;
			}
			if(state == autonomous_periodic){
				robot.autonomousPeriodic();
			}
			if(state == this.teleop_Init){
				robot.teleopInit();
				state = teleop_Periodic;
			}
			if(state == this.teleop_Periodic){
				robot.teleopPeriodic();
			}
			
		Thread.sleep(10);
		}catch(InterruptedException interrupted){
			
		}
		}
}
}
