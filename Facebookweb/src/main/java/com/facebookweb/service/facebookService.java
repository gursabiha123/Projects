package com.facebookweb.service;

import java.util.List;
import java.util.Map;

import com.Facbookweb.Utilitys.Daofactory;
import com.Facbookweb.Utilitys.instaexcept;
import com.facebookweb.entity.facebookwebUser;

//import facebookwebDAO.FacebookWebDAOInterface;
import facebookwebDAO.facebookWebDAOInterface;

public class facebookService implements facebookServiceInterface {
		
		private facebookWebDAOInterface fd=null;
		
		public facebookService() {
			fd=Daofactory.createObject("admindaoservice");
		}

		public int createprofileService(facebookwebUser iu)throws Exception {
			int i=fd.createProfileDAO(iu) ;
			
			return i;

		}
		public boolean loginProfile(facebookwebUser fe) {
			// TODO Auto-generated method stub
			return fd.loginProfile(fe);
		}

		@Override
		public List<facebookwebUser> friendProfile(facebookwebUser fe) {
			// TODO Auto-generated method stub
			return fd.friendlistdao(fe);
		}

		



}
