import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.util.Random;

import javax.swing.ImageIcon;


public class MouseMonitor implements Runnable{
	private Point mousePosition;
	private ImageIcon heartIcon;

	public void run() {
		while(true){
			/*try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			mousePosition = MouseInfo.getPointerInfo().getLocation();
			FlowerMake.boy.setLocation(mousePosition.x, mousePosition.y);
			for(int i=0;i<FlowerFalling.flowerNum;i++){
				if(((Math.pow(mousePosition.x - (FlowerMake.flower[i].getX() + FlowerMake.flower[i].sizeX/2), 2)
						+Math.pow(mousePosition.y - (FlowerMake.flower[i].getY() + FlowerMake.flower[i].sizeY/2), 2))
						<  Math.pow(FlowerMake.flower[i].sizeY/2, 2)) 
						&& FlowerMake.flower[i].isChanged == false ){
					heartIcon = new ImageIcon(getClass()
							.getResource("image/heartIcon"+(new Random().nextInt(7)+1)+".png"));
					heartIcon.setImage(heartIcon.getImage().getScaledInstance(FlowerMake.flower[i].sizeX, FlowerMake.flower[i].sizeY,
						    Image.SCALE_DEFAULT));
					FlowerMake.flower[i].setIcon(heartIcon);
					FlowerMake.flower[i].isChanged = true;
					new AudioPlay("E:/work/java/si/FlowerFalling/src/sound/changingSound.wav").start();
				}
			}
		}
	}
}
