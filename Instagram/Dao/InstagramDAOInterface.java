package com.Instagram.Dao;


import java.util.List;
import java.util.Map;

import com.Instagram.utility.instaexcept;
import com.Intagram.Entity.Instagramuser;

public interface InstagramDAOInterface {

	int createProfileDAO(Instagramuser iu) ;

	void editProfileDAO();
	
	int editprofilebynamedao(Instagramuser iu);

	int deleteProfileDAO(Instagramuser iu);

	 List<Instagramuser>searchProfileDAO(Instagramuser iu)throws instaexcept;

	 List<Instagramuser> viewallProfileDAO();

	Instagramuser viewProfileDAO(Instagramuser iu);

	Map<String, List<Instagramuser>> userdetailwithhistorydao();

	//List<Instagramuser> userssortDAO();

	
}
