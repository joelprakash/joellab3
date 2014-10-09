package gui;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class FrameEX extends JFrame implements ActionListener

{
	

	public FrameEX(String label) {	
		super(label);		
		addWindowListener(new WindowHandler()); //create the listener
	}		
	public FrameEX() {
		this("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if( e.getSource() instanceof JMenuItem )
		{
	       if( e.getActionCommand().equals("Create") )
	       {
	    	FrameEX f2 = new FrameEX("New Address Book");
	   		f2.setSize(400, 300);
	   		f2.setVisible(true);	
	       }
	       else if(e.getActionCommand().equals("Save"))
	    	   System.out.println("Save") ;
		}
		
	}
	
	public static void main(String[] args)
	{		
		FrameEX f = new FrameEX("Address Book");
		f.setSize(400, 300);
		f.setVisible(true);	
		
		Container t = new Container();
		t = f.getContentPane();
		
		
		GridLayout g = new GridLayout();
		t.setLayout(g);
		
		JMenuBar menuBar = new JMenuBar( );
		    f.setJMenuBar( menuBar );

		    JMenu fileMenu = new JMenu( "File" );
		    menuBar.add( fileMenu );
		    JMenu editMenu = new JMenu( "Display" );
		    menuBar.add( editMenu );
		    JMenu searchMenu = new JMenu( "Add" );
		    menuBar.add( searchMenu );
		  	
		    
		    JMenuItem item;
			 
		    item = new JMenuItem ( "Create" );
		    item.addActionListener( f );
		    fileMenu.add( item );
		    item = new JMenuItem ( "Save" );
		    item.addActionListener( f);
			  fileMenu.add( item ); 
			
				 
		




	}

}
