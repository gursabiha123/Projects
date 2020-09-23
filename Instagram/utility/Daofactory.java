package com.Instagram.utility;

import com.Instagram.Dao.InstagramDAOInterface;
import com.Instagram.service.Instagramservice;
import com.Instagram.Dao.InstagramDAO;

public class Daofactory {
	private Daofactory()
	{
		
	}
	
	public static InstagramDAOInterface createObject(String nn) {
		InstagramDAOInterface is=null;
		if(nn.equals("admindaoservice")) {
			is=new InstagramDAO();
		}
		return is;//return object
	}
}
