package com.demo.business;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.demo.Entity.Addrs;
import com.demo.Entity.demosuser;
import com.demo.dao.demosdoaInterface;
import com.demo.utility.DAOfactory;
import com.demo.utility.Demosexcept;

public class Demobusiness implements demosbusinessInterface {
	
	
	private demosdoaInterface di;
	
	public Demobusiness()
	{
		di=DAOfactory.createObjects("admindaoservice");
	}
	@Override
	public void createProfile() {
		
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter your Name : ");
			String name=br.readLine();
			
			System.out.println("Enter your Password : ");
			String password=br.readLine();
			
			System.out.println("Enter your Email : ");
			String email=br.readLine();
			
			System.out.println("Enter your Address : ");
			String address=br.readLine();
			
			System.out.println("Enter your street : ");
			String street=br.readLine();
			
			System.out.println("Enter your state : ");
			String state=br.readLine();
			
			System.out.println("Enter your country : ");
			String country=br.readLine();
			
			/*if only demouser 
			demosuser iu=new demosuser();//controller se service 
			iu.setName(name);
			iu.setPassword(password);
			iu.setEmail(email);
			iu.setAddress(address);
			*/
			
			//to depict the inheritence in pojo class
			Addrs iu = new Addrs();
			iu.setName(name);
			iu.setPassword(password);
			iu.setEmail(email);
			iu.setAddress(address);
			iu.setCountry(country);
			iu.setState(state);
			iu.setStreet(street);
			
		 di.democreateprofileDao(iu);
		}
		catch( Exception e1)

		{
			e1.printStackTrace();
		}
	}

	

	@Override
	public void deleteProfile() {
		// TODO Auto-generated method stub
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter your Name : ");
			String name=br.readLine();
			
			System.out.println("Enter your Password : ");
			String password=br.readLine();
			
			System.out.println("Enter your Email : ");
			String email=br.readLine();
			
			demosuser iu=new demosuser();//controller se service 
			iu.setName(name);
			iu.setPassword(password);
			iu.setEmail(email);
			
			di.Demodeleteprofiledao(iu);
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
	}
	
	@Override
	public void searchProfile() {
		// TODO Auto-generated method stub
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the Name : ");
			String name=br.readLine();
			
			demosuser iu = new demosuser();
			iu.setName(name);
			
			di.Searchprofiled(iu);
		}
		catch(IOException e1)
		{
			e1.printStackTrace();
		}
	}
	public void viewall() throws Demosexcept
	{
		try {
			List<Addrs> ll=di.viewalldao();
			
			for(demosuser oo:ll) {
				System.out.println(oo.getName());
			}
			}
			catch(Demosexcept  t) {
				throw t;
			}
		
	}
	
}
