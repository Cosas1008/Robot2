
public class JavaRobotServo extends SendUDP {

	private Boolean status = new Boolean(false);
	//Constructor for JavaRobotServo
	public JavaRobotServo(int i) {
		super((i+3));// Servo 4: ON / 5: OFF
	}

	public Boolean makeServo(int index) {
		int[] response = null;
		JavaRobotServo js = new JavaRobotServo(index);
		try {
			response = js.sendint();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(response[6] == 0){
			status = true;
		}else{
			status = false;
		}
		
		return status;
	}
	
}