package mx.tecbot.alex.robot;



import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.*;




public class InputSimulator extends JFrame implements KeyListener, Runnable{

boolean ended = false;
int lastKeyUp;
int lastKeyDown;
JLabel label;
public InputSimulator(){
	
	super();
	
	label = new JLabel();
	label.setSize(500, 500);
	label.setText("Robot Status!!");
	this.getContentPane().add( label );
	
	this.addKeyListener(this);
	this.pack();
	this.setVisible(true);
	
	this.setSize(500, 500);
	
	
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String s ="";
		
		while(!ended){
			try{
			s = "<html>Last key up =" + lastKeyUp;
			s+= "<br>Last key down"+lastKeyDown;
			s+= "<br/>Motor 1: </html>";
			
			
				Thread.sleep(10);
			
				label.setText(s);
				
				this.repaint();
				this.validate();
			}catch(InterruptedException e){}
		}
		this.dispose();
		
	}
	public void end(){
		ended = true;
	}
	
	
	
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		lastKeyDown = e.getKeyCode();
		
		RobotController.instance.reciveKey(lastKeyDown, 0);
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		lastKeyUp = e.getKeyCode();
		
		RobotController.instance.reciveKey(lastKeyUp, 1);
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	

	
	

}
