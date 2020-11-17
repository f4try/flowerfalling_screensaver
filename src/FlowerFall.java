import java.util.Date;
import java.util.Random;

import javax.swing.ImageIcon;


public class FlowerFall implements Runnable {


	private int i = MyWindow.j;
	private long t0;
	private long t1,t;
	private double aY = new Random().nextInt(10)+1;
	private double vY = new Random().nextInt(150)+10;
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep( new Random().nextInt(10000));
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		t0 = System.currentTimeMillis();
		while(true){
				if((FlowerMake.flower[i].getY()>FlowerMake.screenSize.height+100)
						||(FlowerMake.flower[i].getX()>FlowerMake.screenSize.width+100)){
					int size = new Random().nextInt(7)+1;
					FlowerMake.flower[i].setSizeXY(size);
					FlowerMake.flower[i].isChanged = false;
					ImageIcon flowerIcon = new ImageIcon(getClass()
							.getResource("image/flowerIcon"+size+".png"));
					t = new Random().nextInt(10)+10;
					FlowerMake.flower[i].setIcon(flowerIcon);
					FlowerMake.flower[i].setSize(flowerIcon.getIconWidth()
							, flowerIcon.getIconHeight());
					FlowerMake.flower[i].setLocation(0,0);
					t0 = System.currentTimeMillis();
					aY = new Random().nextInt(5)+5;
					vY = new Random().nextInt(50)+50;
				}
				t1 = System.currentTimeMillis();
				t = t1-t0;
				FlowerMake.flower[i].setLocation((int) (50*(1e-3)*t+20*(1e-6)*t*t)
						, (int) (vY*(1e-3)*t+aY*(1e-6)*t*t));
				
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
