import javax.swing.JButton;
import javax.swing.JWindow;
import com.sun.awt.AWTUtilities;


public class MyWindow extends JWindow {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static int j;
	public static Thread flowerFall[] = new Thread[FlowerFalling.flowerNum];
	public static JButton btnMyExit = new JButton("ÍË³ö");
	public MyWindow(){
		FlowerMake flowerMake = new FlowerMake();
		setSize(FlowerMake.screenSize);
		setLayout(null);
		setAlwaysOnTop(true);
		AWTUtilities.setWindowOpaque(this, false);
		//new AudioPlay("E:/work/java/si/FlowerFalling/src/sound/backgroudSound.wav").start();
		MusicPlay t = new MusicPlay("file:/E:/work/java/si/FlowerFalling/src/sound/ºì³¾¿ÍÕ».wav");
		t.start();
		add(FlowerMake.boy);
		add(btnMyExit);
		btnMyExit.setLocation(FlowerMake.screenSize.width-80, FlowerMake.screenSize.height/2);
		btnMyExit.addActionListener(new MyExit());
		btnMyExit.setSize(80, 30);
		for(int i=0;i<FlowerFalling.flowerNum;i++){
			add(FlowerMake.flower[i]);
		}
		for(j=0;j<FlowerFalling.flowerNum;j++){
			flowerFall[j]=new Thread(new FlowerFall());
			flowerFall[j].start();
		}
		Thread mouseMonitor = new Thread(new MouseMonitor());
		mouseMonitor.start();
		setVisible(true);
	}

}
