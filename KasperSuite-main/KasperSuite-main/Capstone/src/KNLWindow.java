import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.JFrame;

import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

public class KNLWindow extends JFrame implements ActionListener, NativeKeyListener
{

	public KNLWindow() 
	{
		setTitle("Kasper Network Listener");
		setSize(350, 350);
		setLocation(750, 350);
		setResizable(false);
		setVisible(true);
		setLayout(new FlowLayout());
		
		
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
		new KNLWindow();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
	}

}
