import java.io.UnsupportedEncodingException;

public class JavaRobotAlert extends SendUDP {

    private String alert = new String();


    public JavaRobotAlert(int i) {
		super((i+1));// 2 : ReadAlert / 3 : Reset Alert 
	}

    public String makeAlert(int index) {
		byte[] response = null;
		JavaRobotAlert js = new JavaRobotAlert(index);
		try {
			response = js.send();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(response[6] == 0){
			alert = null;
		}else{
			try {
				alert = new String(response, "UTF-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
		}
		
		return alert;
	}


}