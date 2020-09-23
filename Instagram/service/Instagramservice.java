package com.Instagram.service;

import com.Instagram.Dao.InstagramDAO;import java.util.List;
import java.util.Map;

import com.Instagram.Dao.InstagramDAOInterface;
import com.Instagram.utility.Daofactory;
import com.Instagram.utility.instaexcept;
import com.Intagram.Entity.Instagramuser;
//import java.util.List;
public class Instagramservice implements Instagramserviceinterface {
	
	private InstagramDAOInterface id;
	
	public Instagramservice() {
		//id=new InstagramDAO();oldway
		id=Daofactory.createObject("admindaoservice");
	}

	public int createprofileService(Instagramuser iu) {
		int i=id.createProfileDAO(iu) ;
		
		return i;

	}

	public void editprofileService()  {
		id.editProfileDAO();//return j;

	}

	public int deleteprofileService(Instagramuser iu) {
		int i = id.deleteProfileDAO(iu);return i;

	}

	public List<Instagramuser> viewallprofileService() {
		return id.viewallProfileDAO();
		

	}
	
	
	public int editprofilebyname(Instagramuser iu)
	{
		int i= id.editprofilebynamedao(iu);return i;
	}

	public List<Instagramuser> searchprofileService(Instagramuser iu)throws instaexcept 
	{
		try {
		return id.searchProfileDAO(iu);
		//either write throws instaexcept or else use try catch to re-throw
		}
		catch(instaexcept e)
		{
			throw new instaexcept("");
		}
		
		
	}

	public Instagramuser viewprofileService(Instagramuser iu) {
		Instagramuser uu =id.viewProfileDAO(iu);
		return uu;

	}

	@Override
	public Map<String, List<Instagramuser>> userdetailwithhistoryservice() {
		// TODO Auto-generated method stub
		return id.userdetailwithhistorydao();
		
	}

	//@Override
	/*public List<Instagramuser> userdetailService() {
		return id.userssortDAO();
	}
*/
	//@Override
	/*
	  public int editprofileService(Instagramuser iu) throws Exception { // TODO
	  Auto-generated method stub return 0; }
	 */

}
