package mx.tecbot.alex.robot;

public class IterativeRobot {
public IterativeRobot(){
	System.out.println("Iterative robot constructor");
}
protected void autonomousInit(){
	System.out.println("Iterative Robot autonomus init");
}
protected void autonomousPeriodic(){
	System.out.println("Iterative Robot autonomus Periodic");
}
protected void teleopInit(){
	System.out.println("Iterative Robot Teleop init");
}
protected void teleopPeriodic(){
	System.out.println("Iterative Robot autonomus init");
}
protected void robotInit(){
	System.out.println("Iterative Robot init");
}
}
