package com.demo.utility;

import com.demo.business.Demobusiness;
import com.demo.business.demosbusinessInterface;
import com.demo.dao.Demodao;
import com.demo.dao.demosdoaInterface;

public class DAOfactory {

	
	private DAOfactory()
	{
		
	}
	public static demosdoaInterface createObjects(String nn) {
		demosdoaInterface is=null;
		if(nn.equals("admindaoservice")) {
			is=new Demodao();
		}
		return is;//return object
	
}}
