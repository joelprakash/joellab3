package gui;
import java.awt.*;
import java.awt.event.*;

public class WindowHandler implements WindowListener 
{
	public void windowClosing(WindowEvent arg0) {
		((Window) arg0.getSource()).dispose();
		System.exit(0);	
	}	

	public void windowOpened(WindowEvent arg0) {}	
	public void windowClosed(WindowEvent arg0) {}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
