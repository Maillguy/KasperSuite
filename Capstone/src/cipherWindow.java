import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class cipherWindow extends Frame implements ActionListener 
{

	private Button encryptButton, decryptButton;
	private Label plaintextLabel,shiftLabel, shiftLabel2, cyphertextLabel, decypheredLabel;
	private Label Blank;
	private Label cyphertextOutputLabel, plaintextOutputLabel;
	private TextField plaintextInput, cyphertextInput;
	private TextField cyphertextOutput, plaintextOutput;
	

	public cipherWindow() 
	{
		setLayout(new FlowLayout());
		
		setTitle("Caesar Cypher");
		setSize(400, 400);
		setLocation(750, 350);
		setVisible(true);

		plaintextLabel = new Label("Plaintext Input: ");
		add(plaintextLabel);

		plaintextInput = new TextField(30);
		add(plaintextInput);
		
		shiftLabel = new Label("Shift: ");
		add(shiftLabel);

		Integer[] shiftInt1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		final JComboBox<Integer> shiftList1 = new JComboBox<Integer>(shiftInt1);
		add(shiftList1);
		
		encryptButton = new Button(" v Encrypt v ");
		add(encryptButton);
		encryptButton.addActionListener((new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int key = shiftList1.getSelectedIndex();
				String plaintext = plaintextInput.getText();
				String alphabet = "abcdefghijklmnopqrstuvwxyz";
				plaintext = plaintext.toLowerCase();
				String cipherText = "";
				
				for (int i = 0; i < plaintext.length(); ++i) 
				{
					char ch = plaintext.charAt(i);
					
					if (ch >= 'a' && ch <= 'z') 
					{
						ch = (char) (ch + key);
						if (ch > 'z') {
							ch = (char)(ch - 'z' + 'a' - 1);
						}
						cipherText += ch;
					} 
					
					else if (ch >= 'A' && ch <= 'Z') 
					{
						ch = (char) (ch + key);
						
						if (ch > 'Z') 
						{
							ch = (char) (ch - 'Z' + 'A' - 1);
						}
						cipherText += ch;
					} 
					
					else 
					{
						cipherText += ch;
					}
				}
				cyphertextOutput.setText(cipherText);
			}
		}));
		
		
//		Blank = new Label("                        ");
//		add(Blank);
		
		cyphertextOutputLabel = new Label("Ciphertext Output: ");
		add(cyphertextOutputLabel);
		cyphertextOutputLabel.setAlignment(Label.LEFT);
		
		cyphertextOutput = new TextField(30);
		add(cyphertextOutput);
		
		shiftLabel2 = new Label("Shift: ");
		add(shiftLabel2);
		
		Integer[] shiftInt2 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		final JComboBox<Integer> shiftList2 = new JComboBox<Integer>(shiftInt1);
		add(shiftList2);

		cyphertextLabel = new Label("Cyphertext Input: ");
		add(cyphertextLabel);
		
		cyphertextInput = new TextField(30);
		add(cyphertextInput);
		//setLocation(750, 350);
		
		decryptButton = new Button(" ^ Decrypt ^ ");
		add(decryptButton);
		decryptButton.addActionListener(new ActionListener() 
		{

			public void actionPerformed(ActionEvent e) 
			{
				//Your code here
			}
			});
		 
		 
		

	

		addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent e) 
			{
				
				dispose();
//				System.exit(0); // calling the method is a must
			}
		});
	}

	public static void main(String[] args) 
	{

		new cipherWindow();
	}
	
	@Override
	public void actionPerformed(ActionEvent evt) 
	{
		
	}



}
