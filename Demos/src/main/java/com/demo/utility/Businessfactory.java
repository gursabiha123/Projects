package com.demo.utility;

import com.demo.business.Demobusiness;
import com.demo.business.demosbusinessInterface;

public class Businessfactory {

	
	private Businessfactory()
	{
		
	}
	public static demosbusinessInterface createObject(String nn) {
		demosbusinessInterface is=null;
		if(nn.equals("adminbusinessservice")) {
			is=new Demobusiness();
		}
		return is;//return object
	}
	
}
