import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class integWindow extends JFrame implements ActionListener 
{
	private Label intstructLabel0, intstructLabel1, hashLabel0, hashLabel1, Blank;
	private TextField hashField0, hashField1, checkField;
	private Button checkButton;
	
	public integWindow() 
	{
		setTitle("Integrity Checker");
		setSize(350, 350);
		setLocation(750, 350);
		setResizable(false);
		setVisible(true);
		setLayout(new FlowLayout());
		
		
		intstructLabel0 = new Label("Paste hash values you want to do an Integrity Check on");
		add(intstructLabel0);
		
		intstructLabel1 = new Label("Press the CHECK button to run the Integrity Checker");
		add(intstructLabel1);
		
		hashLabel0 = new Label("Checksum from File 1");
		add(hashLabel0);
		
		hashField0 = new TextField(15);
		add(hashField0);
		
		hashLabel1 = new Label("Checksum from File 2");
		add(hashLabel1);
		
		hashField1 = new TextField(15);
		add(hashField1);
		
		Blank = new Label("                   ");
		add(Blank);
		
		checkButton = new Button("CHECK");
		add(checkButton);
		
		checkField = new TextField(15);
		add(checkField);
		
		Blank = new Label("                          ");
		add(Blank);
		

		checkButton.addActionListener((new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String hashVal0 = hashField0.getText().toString();
				String hashVal1 = hashField1.getText().toString();
				
				if(hashVal0.equals(hashVal1) == true)
				{
					checkField.setText(("INTEGRITY KEPT"));
				}
				else
				{
					checkField.setText(("INTEGRITY FAILED"));
				}
			}
		}));
		
		Blank = new Label("                          ");
		add(Blank);
		
		// close the window
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
		new integWindow();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		
	}

}
