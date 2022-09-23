import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class kasperWindow extends JFrame implements ActionListener 
{
	private Button button1, button2, button3;
	private cipherWindow secondWindow = new cipherWindow();

	public kasperWindow() 
	{
		
		setTitle("KasperSuite");
		setSize(400, 400);
		setLocation(750, 350);
		setVisible(true);
		
		secondWindow.setVisible(false);
		setLayout(new FlowLayout());

		button1 = new Button("Caesar Cipher");
		add(button1);
		button1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				secondWindow.setVisible(true);
			}
		});
		
		
		button2 = new Button("Auto Hasher");
		add(button2);
		button2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				// your code here
			}
		});


		// close the window
		addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent e) 
			{
				dispose();
				System.exit(0); // calling the method is a must
			}
		});

	}


	public static void main(String[] args) 
	{
		new kasperWindow();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}