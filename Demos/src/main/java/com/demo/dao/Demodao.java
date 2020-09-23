package com.demo.dao;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


import com.demo.Entity.demosuser;
import com.demo.Entity.Addrs;
import com.demo.utility.Demosexcept;

public class Demodao implements demosdoaInterface {
	//private List<demosuser> l=null;
	private List<Addrs> l = null;
	public Demodao()
	{
		//l= new ArrayList<demosuser>(); without inheritance
		l=new ArrayList<Addrs>();
		System.out.println(adminpath);
	}
	@Override
	//public void democreateprofileDao(demosuser iu) {
	public void democreateprofileDao(Addrs iu) {
		try {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		l.add(iu);
		
		
		/*System.out.println("Press 1 to view all profile,any number to go back");
		int k = Integer.parseInt(br.readLine());
		if(k==1) {
			int p=0;
		System.out.println("Total users "+l.size());
		for(demosuser i:l)
		{
			System.out.println("USER DETAILS "+(p+1));
			System.out.println("Name :"+i.getName());
			System.out.println("Email :"+i.getEmail());
			System.out.println("Address :"+i.getAddress());
			System.out.println("Passowrd :"+i.getPassword());
			p++;
		}
		}*/
	}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void Demodeleteprofiledao(demosuser iu)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		boolean o = false;
		for(demosuser i:l)
		{
			if(iu.getName().equals(i.getName()) && iu.getPassword().equals(i.getPassword()))
				{
				o=l.remove(i);break;
				}		
		}
		//2nd way via using index
		/* int p=0;
		 * for(demosuser i:l)
		{
			if(iu.getName().equals(i.getName()) && iu.getPassword().equals(i.getPassword()))
				{
				i=dmosuser.indexOf(p);
				}		
		}
		demosuser.remove(p);
		 */
		
		System.out.println("deleted"+o);
		
		/*
		System.out.println("Press 1 to view all profile,any number to go back");
		int k = Integer.parseInt(br.readLine());
		if(k==1) {
			int p=0;
		System.out.println("Total users "+l.size());
		for(demosuser i:l)
		{
			System.out.println("USER DETAILS "+(p+1));
			System.out.println("Name :"+i.getName());
			System.out.println("Email :"+i.getEmail());
			System.out.println("Address :"+i.getAddress());
			System.out.println("Passowrd :"+i.getPassword());
			p++;
		}

	}*/}

	@Override
	public void Searchprofiled(demosuser iu)  {
		// TODO Auto-generated method stub
		int p=0;
		
		for(demosuser i:l)
		{
			if(iu.getName().equals(i.getName()) )
				{
				System.out.println("USER DETAILS "+(p+1));
				System.out.println("Name :"+i.getName());
				System.out.println("Email :"+i.getEmail());
				System.out.println("Address :"+i.getAddress());
				System.out.println("Passowrd :"+i.getPassword());
				p++;
				}
			
			
		}
		if(p==0)
			//if((l.size()==0))
			{
				System.out.println("No data availabl");
			}
	}
		
		public List<Addrs> viewalldao() throws Demosexcept
		{
			int p=0;
			if((l.size()==0))
			{
				throw new Demosexcept("");
			}
			//for(demosuser i:l)
			for(Addrs i:l)
			{
				
					System.out.println("USER DETAILS "+(p+1));
					System.out.println("Name :"+i.getName());
					System.out.println("Email :"+i.getEmail());
					System.out.println("Address :"+i.getAddress());
					System.out.println("Passowrd :"+i.getPassword());
					System.out.println("State :"+i.getState());
					System.out.println("Street :"+i.getStreet());
					System.out.println("Country :"+i.getCountry());
					//System.out.println("Passowrd :"+i.getPassword());
					p++;
				
				
			}
			return l;
				
		}

	}

