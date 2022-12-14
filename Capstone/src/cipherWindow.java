import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


import javax.swing.JFrame;

public class cipherWindow extends JFrame implements ActionListener  
{
	private Button encryptButton, decryptButton;
	private Label plaintextLabel,shiftLabel, shiftLabel2, cyphertextLabel, decypheredLabel;
	private Label Blank;
	private Label cyphertextOutputLabel, plaintextOutputLabel;
	private TextField plaintextInput, cyphertextInput;
	private TextField cyphertextOutput, plaintextOutput;
	
	public cipherWindow() 
	{
		setTitle("Caesar Cypher");
		setSize(350, 350);
		setLocation(750, 350);
		setResizable(false);
		setVisible(true);
		setLayout(new FlowLayout());

		plaintextLabel = new Label("Plaintext Input: ");
		add(plaintextLabel);

		plaintextInput = new TextField(10);
		add(plaintextInput);
		
		shiftLabel = new Label("Shift: ");
		add(shiftLabel);

		Integer[] shiftInt1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		final JComboBox<Integer> shiftList1 = new JComboBox<Integer>(shiftInt1);
		add(shiftList1);
		
		encryptButton = new Button(" v Encrypt v ");
		add(encryptButton);
		encryptButton.setLocation(0, 0);
		
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
		
		Blank = new Label("											      ");
		add(Blank);
		
		cyphertextOutputLabel = new Label("Ciphertext Output: ");
		add(cyphertextOutputLabel);
		
		cyphertextOutputLabel.setAlignment(Label.LEFT);
		
		cyphertextOutput = new TextField(15);
		add(cyphertextOutput);
		
		Blank = new Label("");
		add(Blank);
		Blank = new Label("");
		add(Blank);
		Blank = new Label("");
		add(Blank);
		Blank = new Label("");
		add(Blank);
		Blank = new Label("");
		add(Blank);
		Blank = new Label("");
		add(Blank);
		Blank = new Label("");
		add(Blank);
		Blank = new Label("");
		add(Blank);
		Blank = new Label("");
		add(Blank);
		Blank = new Label("");
		add(Blank);
		Blank = new Label("");
		add(Blank);
		Blank = new Label("");
		add(Blank);
		Blank = new Label("");
		add(Blank);
		Blank = new Label("");
		add(Blank);
		Blank = new Label("");
		add(Blank);
		Blank = new Label("");
		add(Blank);
		
		cyphertextLabel = new Label("Cyphertext Input: ");
		add(cyphertextLabel);
		
		cyphertextInput = new TextField(11);
		add(cyphertextInput);
		
		
		shiftLabel2 = new Label("Shift: ");
		add(shiftLabel2);
		Integer[] shiftInt2 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		final JComboBox<Integer> shiftList2 = new JComboBox<Integer>(shiftInt1);
		add(shiftList2);
		
		Blank = new Label("");
		add(Blank);

		decryptButton = new Button(" v Decrypt v ");
		add(decryptButton);
		decryptButton.setLocation(100, 100);
		
		decryptButton.addActionListener((new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String alphabet = "abcdefghijklmnopqrstuvwxyz";
				String cyphertext = cyphertextInput.getText();
		        // converting the text to lowercase
		        String plaintext = "";
		        // initializing empty string to add alphabets iteratively
		        int shift = shiftList2.getSelectedIndex();
		        for (int i = 0; i < cyphertext.length(); i++) 
		        {
		            int mappingV = alphabet.indexOf(cyphertext.charAt(i));
		            int deVal = (mappingV - shift) % 26;
		            if (deVal < 0) // to handle the negative values
		            {
		                deVal = alphabet.length() + deVal;
		            }
		            char Val = alphabet.charAt(deVal); // the character to be replaced
		            plaintext = plaintext + Val; // adding to plaintext
		        }
		        plaintextOutput.setText(plaintext);
			}
		})); 
		
		Blank = new Label("");
		add(Blank);
		Blank = new Label("");
		add(Blank);
		Blank = new Label("");
		add(Blank);
		Blank = new Label("");
		add(Blank);
		Blank = new Label("");
		add(Blank);
		Blank = new Label("");
		add(Blank);
		Blank = new Label("    ");
		add(Blank);
		
		plaintextOutputLabel = new Label("Plaintext Output: ");
		add(plaintextOutputLabel);
		plaintextOutputLabel.setAlignment(Label.LEFT);
		
		plaintextOutput = new TextField(15);
		add(plaintextOutput);
		
		Blank = new Label("");
		add(Blank);
		Blank = new Label("");
		add(Blank);
		Blank = new Label("");
		add(Blank);
		Blank = new Label("");
		add(Blank);
		Blank = new Label("");
		add(Blank);
		Blank = new Label("");
		add(Blank);
		Blank = new Label("");
		add(Blank);
		Blank = new Label("");
		add(Blank);
		Blank = new Label("");
		add(Blank);
		Blank = new Label("");
		add(Blank);
		Blank = new Label("");
		add(Blank);
		Blank = new Label("");
		add(Blank);
		
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
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
	}

}
