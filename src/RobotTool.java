/*
 * Modified on Dec. 13, 2016 by Y.W. Chen
 * right reserved by RFVLSI NCTU
 */
public interface RobotTool {
	public int x = 0;
	public int y = 0;
	public int z = 0;
	public int yaw = 0;
	public int pitch = 0;
	public int zr = 0;
	public int[] robotposi = new int[3];
	public int[] robotang = new int[3];
	public int toolnumber = 0;
	public int formnumber = 0;
	public int tZ = 0;
	

	public void Tool(int[] toolin);

	public void Tool();

	public void setrX(int input);

	public void setrY(int input);

	public void setrZ(int input);

	public void settX(int input);

	public void settY(int input);

	public int[] getSetting();

	public int getTheta();

	public int getPhi();

	public int getZr();
	
	public static int[] getPosition() {
		robotposi[0] = x;
		robotposi[1] = y;
		robotposi[2] = z;
		robotang[0] = pitch;
		robotang[1] = yaw;
		robotang[2] = zr;
		return robotposi;
	}
	public int getX();
	public int getY();
	public int getZ();
	public void setZ(int input);
	public void setY(int input);
	public void setX(int input);
	
}
