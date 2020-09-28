package com.facebookweb.service;
import java.util.List;

import com.facebookweb.entity.facebookwebUser;

public interface facebookServiceInterface 
{

		int createprofileService(facebookwebUser iu) throws Exception ;

		boolean loginProfile(facebookwebUser iu);

		List<facebookwebUser > friendProfile(facebookwebUser iu);

	
}
