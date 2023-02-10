package observer.eventdriven;

import java.io.Serializable;


public class Message implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String sender;
	private String message;
	
	public Message(){}
	
	public Message(String sender, String message){
		this.sender = sender;
		this.message = message;
	}
	
	public void setMessage(String message){
		this.message = message;
	}
	
	public void setSender(String sender){
		this.sender = sender;
	}

	public String getMessage(){
		return message;
	}
	
	public String getSender(){
		return sender;
	}
	
	public String toString(){
		return sender+ " : "+message;
	}
}
