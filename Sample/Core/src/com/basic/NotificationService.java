package com.basic;

public class NotificationService {
	
	public static void main(String[] args) {
		
		
		
		
		
		NotifiacationFactory fac = new NotifiacationFactory();
		
        Notification no=fac.createNotifiacatio(1);
         no.notifyUser();
		
	}

}
