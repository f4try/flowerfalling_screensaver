import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class FlowerMake {


	static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	public static Flower[] flower; //= new Flower[FlowerFalling.flowerNum];	
	public static JLabel boy = new JLabel();	
	private ImageIcon flowerIcon, boyIcon;
	public FlowerMake() {
		// TODO Auto-generated method stub	
		flower = new Flower[FlowerFalling.flowerNum];
		boyIcon = new ImageIcon(getClass().getResource("image/boyIcon.png"));
		boy.setIcon(boyIcon);
		boy.setSize(boyIcon.getIconWidth(), boyIcon.getIconHeight());
		boy.setLocation((int)0.75*screenSize.width,(int)0.75*screenSize.height);
		//for(JLabel element:flower){
		for(int i=0;i<FlowerFalling.flowerNum;i++){
			int size = new Random().nextInt(7)+1;

			flower[i] = new Flower(i,size);
			flowerIcon = new ImageIcon(getClass().getResource("image/flowerIcon"+size+".png"));
			flower[i].setSize(flowerIcon.getIconWidth(), flowerIcon.getIconHeight());
			flower[i].setIcon(flowerIcon);
			flower[i].setLocation(0,0);
		}
	}

}
