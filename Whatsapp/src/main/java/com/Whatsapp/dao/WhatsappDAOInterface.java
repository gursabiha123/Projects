package com.Whatsapp.dao;
import com.Whatsapp.entity.whatsappuser;
public interface WhatsappDAOInterface {
	
	void deleteprofileDAO();
	int createprofileDAO(whatsappuser wu) throws Exception;
	void viewprofileDAO();
	
	void updateprofileDAO();
	void findprofileDAO();
	void activeprofileDAO();

}
