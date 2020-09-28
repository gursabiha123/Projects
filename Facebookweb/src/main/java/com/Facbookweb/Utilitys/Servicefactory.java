package com.Facbookweb.Utilitys;

import com.facebookweb.service.facebookService;
import com.facebookweb.service.facebookServiceInterface;

public class Servicefactory {

		private Servicefactory() {
			
		}
		
		public static facebookServiceInterface createObject(String nn) {
			facebookServiceInterface is=null;
			if(nn.equals("adminservice")) {
				is=new facebookService();
			}
			return is;//return object
		}
	
	
}
