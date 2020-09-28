package facebookwebDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import java.util.ArrayList;

import com.Facbookweb.Utilitys.instaexcept;
import com.facebookweb.entity.facebookwebUser;

public class facebookDAO implements facebookWebDAOInterface{
//making it global if you dont want to write eveyrplace
	
	private Connection con=null;
	public facebookDAO()
	{
		try {

		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		
		 con=DriverManager.getConnection("jdbc:derby:D:/myfirstdb;create=true","laptop","laptop");
		}
		catch(ClassNotFoundException|SQLException e1)
	{
			e1.printStackTrace();
	}
	}
	
	
	
public int createProfileDAO(facebookwebUser iu) {
	int i=0;//Connection con=null;
	try {
		
	
		//Class.forName("org.apache.derby.jdbc.EmbeddedDriver");	
		//con=DriverManager.getConnection("jdbc:derby:D:/myfirstdb;create=true","laptop","laptop");
		PreparedStatement ps=con.prepareStatement("insert into detail values(?,?,?,?)");//? represents that we are going to take values for questions
		ps.setString(1, iu.getName());	
		ps.setString(2, iu.getAddress());	
		ps.setString(3, iu.getEmail());
		ps.setString(4,iu.getPassword());
		i=ps.executeUpdate();
	}
		catch(Exception e1)
	{
			e1.printStackTrace();
	}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return i;

	}





public boolean loginProfile(facebookwebUser iu) {
	boolean i=false;//Connection con=null;
	try {
		
		//Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
	
		 //con=DriverManager.getConnection("jdbc:derby:D:/myfirstdb;create=true","laptop","laptop");
		PreparedStatement ps=con.prepareStatement("select * from detail where name=? and password=?");
		ps.setString(1, iu.getName());
		ps.setString(2, iu.getPassword());
		
		
		//step 4 executeQuery
		ResultSet res=ps.executeQuery();
		if(res.next()) {
			i=true;
		}
						
		
	}
	catch(Exception ee) {
		ee.printStackTrace();
	}
	return i;
}






@Override

public List<facebookwebUser> friendlistdao(facebookwebUser iu) {
	List<facebookwebUser> ll=new ArrayList<facebookwebUser>();
	facebookwebUser f=new facebookwebUser();
	f.setName("mohan");
	f.setAddress("Chennai");
	
	facebookwebUser f1=new facebookwebUser();
	f1.setName("Chunnilal");
	f1.setAddress("Mumbai");
	
	ll.add(f1);
	ll.add(f);
	/*try {
		PreparedStatement ps=con.prepareStatement("select * from friendlist where name=?");
		ps.setString(1, iu.getName());
	
		
		
		//step 4 executeQuery
		ResultSet res=ps.executeQuery();
		while(res.next()) {
			FacebookEmployee f=new FacebookEmployee();
			f.setName(res.getString(1));
			f.setAddress(res.getString(4));
			ll.add(f);
		}
						
		
	}
	catch(SQLException ee) {
		ee.printStackTrace();
	}*/
	return ll;
}

	
	}


	