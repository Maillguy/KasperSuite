import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;


import java.util.*;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;


public class keylogWindow extends JFrame implements ActionListener, NativeKeyListener
{
	private Button keyStart;
	
	public keylogWindow() 
	{
		setTitle("KasperLogger");
		setSize(350, 350);
		setLocation(750, 350);
		setResizable(false);
		setVisible(true);
		setLayout(new FlowLayout());
		
		keyStart = new Button("START");
		add(keyStart);
		
		keyStart.addActionListener((new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		}));
		
		addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent e) 
			{
				dispose();
			}
		});
	}

	public static void main(String[] args) 
	{
		new keylogWindow();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}


	