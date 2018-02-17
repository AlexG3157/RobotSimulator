package mx.tecbot.alex.robot;

import java.util.Vector;

public class Scheduler {

	static Scheduler instance;
	Vector<Command> commands;
	public Scheduler(){
		commands = new Vector<Command>();
	}
	
	public void addCommand(Command c){
		commands.add(c);
	}
	public static Scheduler getInstance(){
		if(instance == null){
		instance = new Scheduler();
		}
		return instance;
	}
	public void run(){
		
		
		
		
		for(int i =0; i<commands.size();i++){
			
			
			Command c = commands.get(i);
			
			
			
			if(c.getState()==Command.NOT_STARTED){
				c.start();
				
					((Command)c)._start();
				
			}else if(c.getState() == Command.STARTED_NOT_INITIALIZED){
				c.initialize();
				
					((Command)c)._initialize();
			}
		else if(c.getState() == Command.INITIALIZED_NOT_RUNNING){
			c.excecute();
			
				((Command)c).excecute();
			
		}else if(c.getState() == Command.RUNNING){
			c.excecute();
		}else if(c.getState() == Command.FINISHED_NOT_ENDED){
			c.end();
			
			
				((Command)c).end();
		}
		if(c.getState() == Command.RUNNING && c.isFinished()){
			c.end();
			c._end();
		}
		
	


		}
	}
}
