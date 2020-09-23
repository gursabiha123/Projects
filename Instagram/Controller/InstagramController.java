package com.Instagram.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import com.Instagram.service.Instagramservice;
import com.Instagram.service.Instagramserviceinterface;
import com.Instagram.utility.*;
import com.Instagram.utility.SortBy_Add;
import com.Instagram.utility.SortBy_EMAIL;
import com.Instagram.utility.SortBy_NAMES;
import com.Instagram.utility.instaexcept;
import com.Intagram.Entity.Instagramuser;
import com.Intagram.Entity.Instagramuser;

import java.util.Collections;
import java.util.List;
import java.util.Map;
public class InstagramController implements InstagramControllerInterface {
		
		private Instagramserviceinterface is;
		int flag=0;
		public InstagramController() {
			//is=new Instagramservice();wrong approach in this you are allocating service ki facilities ko memory on yr system which may trouble you in case of memory leak or too much memory 
			is=Servicefactory.createObject("adminservice");//by this service ki memory is being created on machine of service and factory is helping to take our request and allocate the momory
		}

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
			
			Instagramuser iu=new Instagramuser();//controller se service 
			iu.setName(name);
			iu.setPassword(password);
			iu.setEmail(email);
			iu.setAddress(address);
			
			
			int i=is.createprofileService(iu);//we should not transfer concrete data, i is value returned by service
			
			if(i>0) {
				System.out.println("profile created");
			}
			else {
				System.out.println("could not create profile");
			}
			}
			catch(IOException e1)
			{
				e1.printStackTrace();
			}
			finally
			{
				
			}

		}

		public void editProfile() {
			//System.out.println("hello1");
			try {	
			viewProfile();
				//System.out.println("hello2");
			if(flag==0) {
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				
				System.out.println("press 1 to edit passwor");
			
				System.out.println("press 2 to edit email");
				System.out.println("press 3 to edit address");
				
				System.out.println("enter your choice ");
				int i=Integer.parseInt(br.readLine());
				
				
				//InstagramControllerInterface fi=new InstagramController();
				String name="Ashutosh";
				
				switch(i) {
				
				case 1: editProfilebypassword(name);
					break;
				case 2:editProfilebyemail();
					break;
				case 3:editProfilebyaddress();
					break;
				
				
				default:System.out.println("wrong choice");
				
				}}
				is.editprofileService();
				}
				catch(IOException e1)
				{
					e1.printStackTrace();
				}
				finally
				{
						
				}
			
		}
		
		private void editProfilebyaddress() {
			// TODO Auto-generated method stub
			
		}

		private void editProfilebyemail() {
			// TODO Auto-generated method stub
			
		}
		
		private void editProfilebypassword(String name) {
			
			try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter new password : ");
			String password=br.readLine();
			
			Instagramuser iu=new Instagramuser(); //this object is used for transfering data from controller to service
			iu.setName(name);
			iu.setPassword(password);
			
			int i=is.editprofilebyname(iu);
			if(i>0) {
				System.out.println("profile edited");
			}
			}
			catch(IOException e1)
			{
				e1.printStackTrace();
			}
			
		}

		public void deleteProfile() {
			
			try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Name and email to delete profile  : ");
			String name=br.readLine();
			String email=br.readLine();
			
			
			Instagramuser iu=new Instagramuser();//data always sent and return from tojo file object
			iu.setName(name);
			iu.setEmail(email);
			
			int i= is.deleteprofileService(iu);
			if(i>=1)
				System.out.println("deleted successfully profile  : ");
			else
				System.out.println("delete unsuccessful profile  : ");
			}
			catch(IOException e2)
			{
				e2.printStackTrace();
			}
		}

		public void searchProfile() //returns all values eg if 3 ppl with same name .. return all
		{
			try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Name to search profile  : ");
			String name=br.readLine();
			
			Instagramuser iu = new Instagramuser();//this object is used to used for transferring data from controller - > service
			iu.setName(name);
			if(name.length()<3) {
				throw new instaexcept(name);
			}
		
			
			List<Instagramuser> uu=is.searchprofileService(iu);// it will return a array of objects and its size will be dynamic so you use collection api for it
										//dao to service
			
			System.out.println(uu.size()+"  users found");
			
			for(Instagramuser u:uu) {
				System.out.println("****************************************");
				System.out.println("Name is : "+u.getName());
				System.out.println("Password is : "+u.getPassword());
				System.out.println("Email is : "+u.getEmail());
				System.out.println("Address is : "+u.getAddress());
				System.out.println("****************************************");
		}}
			catch(IOException e1)
			{
				e1.printStackTrace();
			}
			catch(instaexcept e2)
			{
				//e2.printStackTrace();
				System.out.println("custom exception occured"+e2.uu());
			}
			

		}

		public void viewAllProfile() {
			//Map<String, List<Instagramuser>> uu=is.userdetailwithhistoryservice();
			
			//List<Instagramuser>  ll=uu.get("studentlist");
			List<Instagramuser> uu=is.viewallprofileService();
			
			try {
				BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
				System.out.println("*********************************MAIN MENU************************");
				System.out.println("press 1 to sort by addr");
				System.out.println("press 2 to name");
				System.out.println("press 3 to email");
				
				
				System.out.println("enter your choice ");
				int i=Integer.parseInt(br.readLine());
				
				
				switch(i) {
				
				case 1: Collections.sort(uu, new SortBy_Add());
					break;
				case 2: Collections.sort(uu, new SortBy_NAMES());
					break;
				case 3: Collections.sort(uu, new SortBy_EMAIL());
					break;
				}
			
			for(Instagramuser u:uu) {
				System.out.println("****************************************");
				System.out.println("Name is : "+u.getName());
				System.out.println("Password is : "+u.getPassword());
				System.out.println("Email is : "+u.getEmail());
				System.out.println("Address is : "+u.getAddress());
				System.out.println("****************************************");
			}}
			//is.viewallprofileService();}
			catch(Exception e)
			{}

		}

		public void viewProfile()  {
			
			try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Name to view profile of that person : ");
			String name=br.readLine();
			
			Instagramuser iu=new Instagramuser();//data always sent and return from tojo file object
			iu.setName(name);//data ko paas controller se service krneko
			
			Instagramuser uu=is.viewprofileService(iu);//taking data from service to controller
			
			if(uu!=null)
			{
				
				System.out.println("User Information below");
				System.out.println("Name :"+uu.getName());
				System.out.println("Address :"+uu.getAddress());
				System.out.println("Email :"+uu.getEmail());
				System.out.println("Password :"+uu.getPassword());
			}
			else
			{
				System.out.println("No such profile is created");flag=1;
			}
			}
			catch(IOException e1)
			{
				e1.printStackTrace();
				System.out.println("custom exception occured"+e1);
			}
			

		}

		@Override
		public void userdetailwithhistory() {
			Map<String, List<Instagramuser>> uu=is.userdetailwithhistoryservice();
			
			List<Instagramuser>  ll=uu.get("studentlist");
			try {
			for(Instagramuser u:ll) {
				System.out.println("****************************************");
				System.out.println("Name is : "+u.getName());
				System.out.println("Password is : "+u.getPassword());
				System.out.println("Email is : "+u.getEmail());
				System.out.println("Address is : "+u.getAddress());
				System.out.println("****************************************");
			}
			
			
	      List<Instagramuser>  ll1=uu.get("proflist");
			
			for(Instagramuser u:ll) {
				System.out.println("****************************************");
				System.out.println("Name is : "+u.getName());
				System.out.println("Password is : "+u.getPassword());
				System.out.println("Email is : "+u.getEmail());
				System.out.println("Address is : "+u.getAddress());
				System.out.println("****************************************");
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}

		

		//@Override
		/*public void userdetailsorting() {
			// TODO Auto-generated method stub
					List<Instagramuser> uu=is.userdetailService();
					try {
					BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
					System.out.println("*********************************MAIN MENU************************");
					System.out.println("press 1 to sort by addr");
					System.out.println("press 2 to name");
					System.out.println("press 3 to email");
					
					
					System.out.println("enter your choice ");
					int i=Integer.parseInt(br.readLine());
					
					
					switch(i) {
					
					case 1: Collections.sort(uu, new SortBy_Add());
						break;
					case 2: Collections.sort(uu, new SortBy_NAMES());
						break;
					case 3: Collections.sort(uu, new SortBy_EMAIL());
						break;
					}
				
				//Collections.sort(uu, new SortBy_EMAIL());
				
				
				System.out.println(uu.size()+"  users found");
				
				for(Instagramuser u:uu) {
					System.out.println("****************************************");
					System.out.println("Name is : "+u.getName());
					System.out.println("Password is : "+u.getPassword());
					System.out.println("Email is : "+u.getEmail());
					System.out.println("Address is : "+u.getAddress());
					System.out.println("****************************************");
				}

			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}}*/

	}
