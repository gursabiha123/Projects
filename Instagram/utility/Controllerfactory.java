package com.Instagram.utility;


import com.Instagram.Controller.InstagramController;
import com.Instagram.Controller.InstagramControllerInterface;
//import com.Instagram.Controller.InstagramControllerInterface;

public class Controllerfactory {
	
	private Controllerfactory()
	{
		
	}
	public static InstagramControllerInterface createObject(String nn) {
		InstagramControllerInterface is=null;
		if(nn.equals("admincontrollerservice")) {
			is=new InstagramController();
		}
		return is;//return object
	}

	

}
