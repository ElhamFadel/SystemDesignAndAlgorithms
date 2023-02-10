package singleton.example1;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class MyLoggerManager {

	private Logger logger;
	private static MyLoggerManager instance = null;
	
	private  MyLoggerManager() {
		logger = Logger.getLogger("my_logger");
		try {
			logger.addHandler(new FileHandler("log.txt"));
		} catch (SecurityException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static MyLoggerManager getInstance(){
		if(instance == null)
			instance = new MyLoggerManager();
		return instance;
	}
	
	public Logger getLogger(){
		return logger;
	}

}
