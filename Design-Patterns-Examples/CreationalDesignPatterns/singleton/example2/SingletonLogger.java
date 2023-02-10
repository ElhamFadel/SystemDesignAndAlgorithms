package singleton.example2;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class SingletonLogger {

	private Logger logger;
	private static SingletonLogger instance;;
	
	private SingletonLogger(){
		logger = Logger.getLogger("log_file");
		try {
			logger.addHandler(new FileHandler("logFile.txt"));
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static synchronized SingletonLogger getInstance(){
		if(instance == null) instance = new SingletonLogger();
		return instance;
	}
	
	public Logger getLogger(){
		return logger;
	}
}
