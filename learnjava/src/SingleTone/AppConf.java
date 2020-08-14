package SingleTone;

public class AppConf {

	private AppConf(){
		
	}
	private static AppConf obj=null;
	public static AppConf getInstance() {
		if(obj==null) {
			obj=new AppConf();  
		}
		return obj;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
