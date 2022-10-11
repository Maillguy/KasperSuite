import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;



public class hashWindow extends Frame implements ActionListener
{
	private Label fileLabel0, fileLabel1; 
	private static TextField fileOutput0, fileOutput1, hashChecker;
	private Label Blank; 
	private Button fileButton0, fileButton1, hashButton;
	
	public hashWindow()
	{
		setTitle("Auto Hasher");
		setSize(350, 350);
		setLocation(750, 350);
		setVisible(true);
		setLayout(new FlowLayout());
		
		fileButton0 = new Button("Choose File for Hashing");
		add(fileButton0);
		
		fileButton0.addActionListener((new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource() == fileButton0)
				{
					JFileChooser fileChooser1 = new JFileChooser();
					int response = fileChooser1.showOpenDialog(null);
					
					if(response == JFileChooser.APPROVE_OPTION)
					{
						File file1 = new File(fileChooser1.getSelectedFile().getAbsolutePath());
						fileOutput0.setText(file1.getAbsolutePath());
					}
					
				}
				
			}
		}));

		fileOutput0 = new TextField(10);
		add(fileOutput0);
		
		String[] hashString0 = {"MD5", "SHA-256", "SHA-512", "crc32" };
		final JComboBox<String> hashList0 = new JComboBox<String>(hashString0);
		add(hashList0);
		
		

		
		fileButton1 = new Button("Choose File for Hashing");
		add(fileButton1);
		
		fileButton1.addActionListener((new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource() == fileButton1)
				{
					JFileChooser fileChooser2 = new JFileChooser();
					int response = fileChooser2.showOpenDialog(null);
					
					if(response == JFileChooser.APPROVE_OPTION)
					{
						File file1 = new File(fileChooser2.getSelectedFile().getAbsolutePath());
						fileOutput1.setText(file1.getAbsolutePath());
					}
					
				}
				
			}
		}));
		fileOutput1 = new TextField(10);
		add(fileOutput1);
		
		String[] hashString1 = {"MD5", "SHA-256", "SHA-512", "crc32" };
		final JComboBox<String> hashList1 = new JComboBox<String>(hashString1);
		add(hashList1);
		
		Blank = new Label("                          ");
		add(Blank);
		
		hashButton = new Button("HASH");
		add(hashButton);
		
		hashButton.addActionListener((new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				
			}
		}));
		
		
		hashChecker = new TextField(30);
		add(hashChecker);
		
		
		addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent e) 
			{
				dispose();
			}
		});
	}
	
	
	
	
	public static void main(String [] Args)
	{
		new hashWindow();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
	}
}
