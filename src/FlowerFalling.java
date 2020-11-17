


public class FlowerFalling {

	/**
	 * @param args
	 */
	public static MyWindow myWindow;
	public static int flowerNum = 20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		flowerNum = FlowerMake.screenSize.width/68;
		System.out.println(flowerNum);
		myWindow = new MyWindow();
	}
		

}
