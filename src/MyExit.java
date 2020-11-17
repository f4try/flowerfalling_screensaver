import java.awt.KeyEventPostProcessor;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import com.sun.xml.internal.bind.v2.model.core.Adapter;

public class MyExit implements ActionListener{
	  public void actionPerformed(ActionEvent e)
	  {
	   if(e.getSource() == MyWindow.btnMyExit)
	   {
		   FlowerFalling.myWindow.dispose();
		   System.exit(0);
	   }
	  }
}


