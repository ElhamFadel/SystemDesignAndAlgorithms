package observer.eventdriven.logger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import observer.eventdriven.Message;
import observer.eventdriven.handler.NetworkMessageHandler.NetworkMessageListener;

public class Logger implements NetworkMessageListener{
	private String filePath = System.getProperty("user.dir")+"/log.txt";
	File f;
	
	public Logger(){
		f = new File(filePath);
	}
	
	public void log(String msg){
		try {
		    BufferedWriter out = new BufferedWriter(new FileWriter(f, true));
		    
		    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		    Date date = new Date();
		    
		    out.write(dateFormat.format(date) + " : " + msg + "\n");
		    out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void update(Message msg) {
		this.log(msg.toString());
	}
}
