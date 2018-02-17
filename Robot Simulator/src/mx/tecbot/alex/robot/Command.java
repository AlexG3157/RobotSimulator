package mx.tecbot.alex.robot;

public class Command {

	public static int NOT_STARTED = 0;
	public static int STARTED_NOT_INITIALIZED = 1;
	public static int INITIALIZED_NOT_RUNNING = 2;
	public static int RUNNING = 3;
	public static int FINISHED_NOT_ENDED = 4;
	public static int ENDED = 5;
	public static int INTERRUPTED = 6;
	public static int CANCELED = 7;
	public static int state = NOT_STARTED;
	
	public void _start(){state = STARTED_NOT_INITIALIZED;}
	public void _initialize(){state =INITIALIZED_NOT_RUNNING;}
	public void _excecute(){state = RUNNING;}
	public void _end(){state=ENDED;}
	public void _cancel(){state = CANCELED;}
	public void _interrupt(){state = INTERRUPTED;}
	
	public int getState(){return state;}
    public void requires(){}
	public void start(){}
	public void initialize(){}
	public void excecute(){}
	public boolean isFinished(){state = FINISHED_NOT_ENDED; return true;}
	public void end(){}
	public void cancel(){}
	public void interrupt(){}
	
}
