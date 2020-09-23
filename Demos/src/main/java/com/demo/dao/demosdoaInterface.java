package com.demo.dao;

import java.util.List;

import com.demo.Entity.Addrs;
import com.demo.Entity.demosuser;
import com.demo.utility.Demosexcept;

public interface demosdoaInterface {
	
	String adminpath ="D:/";

	//void democreateprofileDao(demosuser iu)throws Exception;
	
	void democreateprofileDao(Addrs iu)throws Exception;

	void Demodeleteprofiledao(demosuser iu)throws Exception;

	void Searchprofiled(demosuser iu);
	
	public List<Addrs> viewalldao() throws Demosexcept;

}
