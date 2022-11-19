import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.security.*;


import javax.swing.JFrame;

public class hashWindow extends JFrame implements ActionListener 
{
	private Label fileLabel0, fileLabel1; 
	private static TextField fileOutput0, fileOutput1, hashChecker0, hashChecker1;
	private Label Blank; 
	private Button fileButton0, fileButton1, hashButton;
	
	public hashWindow() 
	{
		setTitle("Auto Hasher");
		setSize(350, 350);
		setLocation(750, 350);
		setResizable(false);
		setVisible(true);
		setLayout(new FlowLayout());
		
		fileButton0 = new Button("Choose File #1");
		add(fileButton0);
		
		fileOutput0 = new TextField(10);
		add(fileOutput0);
		
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
		
		String[] hashString0 = {"MD5", "SHA-256", "SHA-512", "NO-HASH"};
		final JComboBox<String> hashList0 = new JComboBox<String>(hashString0);
		add(hashList0);
		
		fileButton1 = new Button("Choose File #2");
		add(fileButton1);
		
		fileOutput1 = new TextField(10);
		add(fileOutput1);
		
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
		
		String[] hashString1 = {"MD5", "SHA-256", "SHA-512", "NO-HASH"};
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
				File file0 = new File(fileOutput0.getText());
				File file1 = new File(fileOutput1.getText());
					
				try 
				{
					if(hashList0.getSelectedItem().toString() != "HASH")
					{
						hashFile0(file0, hashList0.getSelectedItem().toString());
					}
					else if(hashList0.getSelectedItem().toString() == "HASH")
					{
						hashChecker0.setText("");
					}
					
					if(hashList1.getSelectedItem().toString() != "HASH")
					{
						hashFile1(file1, hashList1.getSelectedItem().toString());
					}
					
					else if(hashList1.getSelectedItem().toString() == "HASH")
					{
						hashChecker1.setText("");
					}
					
					
				}
				
					catch (NoSuchAlgorithmException | IOException e1) 
					{
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
			}
			
			
		}));
		
		hashChecker0 = new TextField(30);
		add(hashChecker0);
		
		hashChecker1 = new TextField(30);
		add(hashChecker1);
		
		addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent e) 
			{
				dispose();
			}
		});
	}
	
	private static void hashFile0(File file, String algorithm) throws IOException, NoSuchAlgorithmException
	{
	    try (FileInputStream inputStream = new FileInputStream(file)) 
	    {
	        MessageDigest digest = MessageDigest.getInstance(algorithm);
	 
	        byte[] bytesBuffer = new byte[1024];
	        int bytesRead = -1;
	 
	        while ((bytesRead = inputStream.read(bytesBuffer)) != -1) 
	        {
	            digest.update(bytesBuffer, 0, bytesRead);
	        }
	 
	        byte[] hashedBytes = digest.digest();
	        String hash = byteArrayToHex(hashedBytes);
	        hashChecker0.setText(hash);
	        return;
	    } 
	    
	}
	
	private static void hashFile1(File file, String algorithm) throws IOException, NoSuchAlgorithmException
	{
	    try (FileInputStream inputStream = new FileInputStream(file)) 
	    {
	        MessageDigest digest = MessageDigest.getInstance(algorithm);
	 
	        byte[] bytesBuffer = new byte[1024];
	        int bytesRead = -1;
	 
	        while ((bytesRead = inputStream.read(bytesBuffer)) != -1) 
	        {
	            digest.update(bytesBuffer, 0, bytesRead);
	        }
	 
	        byte[] hashedBytes = digest.digest();
	        String hash = byteArrayToHex(hashedBytes);
	        hashChecker1.setText(hash);
	        return;
	    } 
	    
	}
	
	public static String byteArrayToHex(byte[] a) 
	{
		   StringBuilder sb = new StringBuilder(a.length * 2);
		   for(byte b: a)
		   sb.append(String.format("%02x", b));
		   return sb.toString();
	}

	public static void main(String[] args) 
	{
		

	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
	}

}
