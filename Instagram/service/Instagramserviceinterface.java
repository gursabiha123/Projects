package com.Instagram.service;

import java.util.*;
import com.Instagram.utility.instaexcept;
import com.Intagram.Entity.Instagramuser;
import java.util.List;
public interface Instagramserviceinterface {

	int createprofileService(Instagramuser iu) ;

	void editprofileService();

	int deleteprofileService(Instagramuser iu);

	List<Instagramuser> viewallprofileService();

	List<Instagramuser> searchprofileService(Instagramuser iu) throws instaexcept;
	
	int editprofilebyname(Instagramuser iu);

	Instagramuser viewprofileService(Instagramuser iu);

	Map<String, List<Instagramuser>> userdetailwithhistoryservice();

//	List<Instagramuser> userdetailService();


	
}
