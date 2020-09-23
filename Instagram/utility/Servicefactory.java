package com.Instagram.utility;

import com.Instagram.service.Instagramservice;
import com.Instagram.service.Instagramserviceinterface;

public class Servicefactory {

		private Servicefactory() {
			
		}
		
		public static Instagramserviceinterface createObject(String nn) {
			Instagramserviceinterface is=null;
			if(nn.equals("adminservice")) {
				is=new Instagramservice();
			}
			return is;//return object
		}
	
	
}
