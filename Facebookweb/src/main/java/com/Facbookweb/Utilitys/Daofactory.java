package com.Facbookweb.Utilitys;

import facebookwebDAO.facebookDAO;
import facebookwebDAO.facebookWebDAOInterface;

public class Daofactory {
	private Daofactory()
	{
		
	}
	
	public static facebookWebDAOInterface createObject(String nn) {
		facebookWebDAOInterface is=null;
		if(nn.equals("admindaoservice")) {
			is=new facebookDAO();
		}
		return is;//return object
	}
}
