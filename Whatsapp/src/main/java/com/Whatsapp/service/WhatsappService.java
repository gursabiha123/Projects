package com.Whatsapp.service;

import com.Whatsapp.dao.WhatsappDAO;
import com.Whatsapp.entity.whatsappuser;
import com.Whatsapp.dao.WhatsappDAOInterface;
public class WhatsappService implements WhatsappServiceInterface{

private WhatsappDAOInterface wd;
	
	public WhatsappService(){
		wd=new WhatsappDAO();
	}
	
		public void deleteprofileservice()
		{
			wd.deleteprofileDAO();
		}
		public int createprofileservice(whatsappuser wu) throws Exception
		{
			
			int i=wd.createprofileDAO(wu);
			return i;
		}
		public void viewprofileservice()
		{
			wd.viewprofileDAO();
		}
		
		public void updateprofileservice() {
			wd.updateprofileDAO();
		}
		public void findprofileservice() {
			wd.findprofileDAO();
		}
		public void activeprofileservice() {
			wd.activeprofileDAO();
	}
	


}
