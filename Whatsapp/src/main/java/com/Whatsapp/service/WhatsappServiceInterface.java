package com.Whatsapp.service;
import com.Whatsapp.entity.whatsappuser;
public interface WhatsappServiceInterface {
	
	void deleteprofileservice();
	int createprofileservice(whatsappuser wu) throws Exception;
	void viewprofileservice();
	
	void updateprofileservice();
	void findprofileservice();
	void activeprofileservice();

}
