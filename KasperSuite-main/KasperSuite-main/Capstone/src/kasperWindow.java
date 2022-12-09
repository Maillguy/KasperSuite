import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class kasperWindow extends JFrame implements ActionListener 
{
	private Button button1, button2, button3, button4, button5;
	private cipherWindow secondWindow = new cipherWindow();
	private hashWindow thirdWindow = new hashWindow();
	private integWindow fourthWindow = new integWindow();
	private keylogWindow fifthWindow = new keylogWindow();
	private KNLWindow sixthWindow = new KNLWindow();
	
	public kasperWindow() 
	{
		setTitle("KasperSuite");
		setSize(350, 350);
		setLocation(750, 350);
		setResizable(false);
		setVisible(true);
		
		secondWindow.setVisible(false);
		thirdWindow.setVisible(false);
		fourthWindow.setVisible(false);
		fifthWindow.setVisible(false);
		sixthWindow.setVisible(false);
		setLayout(new FlowLayout());
		
		button1 = new Button("KasperCipher");
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
				thirdWindow.setVisible(true);
			}
		});
		
		button3 = new Button("Integrity Checker");
		add(button3);
		button3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				fourthWindow.setVisible(true);
			}
		});
		
		button4 = new Button("KasperLogger");
		add(button4);
		button4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				//fifthWindow.setVisible(true);
				KeyLogger key = new KeyLogger();
				key.KEY();
				setVisible(false);
			}
		});
		
		button5 = new Button("KNL");
		add(button5);
		button5.addActionListener(new ActionListener()
		{
			public void actionPreformed(ActionEvent e)
			{
				sixthWindow.setVisible(true);
			}

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				
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
