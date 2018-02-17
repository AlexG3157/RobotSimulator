package mx.tecbot.alex.robot;

public class Button {
	
	Command command;
	int key = 0;
	
	public static int BUTTON_KEY_A = 65;
	public static  int BUTTON_KEY_S = 83;
	public static int BUTTON_KEY_D = 68;
	public static int BUTTON_KEY_F = 70;
	public static int BUTTON_KEY_G = 71;
	
	
	public Button(int b, Command c){
		key = b;
		command = c;
		
		RobotController.instance.addButton(this);
		
		Scheduler.getInstance().addCommand(c);
	}

	
	public void checkState(int keyPressed){
		if(keyPressed == key){
		
		if(command.getState() != Command.RUNNING){
			command.start();
			if(command.getState() != Command.STARTED_NOT_INITIALIZED)
			((Command)command).start();
			
		}
		}
	}
}
