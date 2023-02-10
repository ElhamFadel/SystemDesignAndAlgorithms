package singleton.example2;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerExample {
	public LoggerExample(){
		
		SingletonLogger.getInstance().getLogger().log(Level.INFO,"Hello");
		SingletonLogger.getInstance().getLogger().log(Level.INFO,"Hello");

		//try {
			//Logger logger = Logger.getLogger("log_file");
			//logger.addHandler(new FileHandler("log.txt"));
			//logger.info("Doing something...");
		//} catch (SecurityException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//} catch (IOException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}
	}
	
	public static void main(String args[]){
		new LoggerExample();
	}
}
