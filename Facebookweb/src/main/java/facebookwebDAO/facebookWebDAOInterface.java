package facebookwebDAO;

import java.util.List;
import java.util.Map;

import com.Facbookweb.Utilitys.instaexcept;
import com.facebookweb.entity.facebookwebUser;

public interface facebookWebDAOInterface {



		int createProfileDAO(facebookwebUser iu) throws Exception;

	

		boolean loginProfile(facebookwebUser fe);



		List<facebookwebUser> friendlistdao(facebookwebUser iu);


	
}
