package com.basic;

public class NotifiacationFactory {
	
	public Notification   createNotifiacatio(int c) {
		
		
		if(c==1) {
			return new SMS();
		}
		if(c==2){
			return new EmailNotifiacation();
		}
		return null;
		
	}

}
