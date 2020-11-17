import javax.swing.JLabel;


public class Flower extends JLabel {
	public int num;
	public int size;
	public int sizeX,sizeY;
	public boolean isChanged=false;
	public Flower(int num, int size){
		this.num = num;
		this.size = size;
		setSizeXY(size);

		}
	public void setSizeXY(int size){
		switch(size){
		case 1 :
			sizeX=sizeY=16;
			break;
		case 2 :
			sizeX=sizeY=24;
			break;
		case 3 :
			sizeX=sizeY=32;
			break;
		case 4 :
			sizeX=sizeY=48;
			break;
		case 5 :
			sizeX=sizeY=64;
			break;
		case 6 :
			sizeX=sizeY=72;
			break;
		case 7 :
			sizeX=sizeY=96;
			break;
		}
		
	}
	
}
