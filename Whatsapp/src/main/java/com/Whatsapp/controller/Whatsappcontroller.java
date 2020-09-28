package com.Whatsapp.controller;


import com.Whatsapp.service.WhatsappServiceInterface;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.Whatsapp.entity.whatsappuser;
import com.Whatsapp.service.WhatsappService;
public class Whatsappcontroller implements Whatsappcontrollerinterface {
	
	private WhatsappServiceInterface ws;
	
	public Whatsappcontroller(){
		ws=new WhatsappService();
	}
	@Override
	public void deleteprofile() 
	{
		ws.deleteprofileservice();
		System.out.println("profile deleted");
		//System.out.println();
	}
	@Override
	public void createprofile() throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your Name : ");
		String name=br.readLine();
		
		System.out.println("Enter your Password : ");
		String password=br.readLine();
		
		System.out.println("Enter your Email : ");
		String email=br.readLine();
		
		System.out.println("Enter your Address : ");
		String address=br.readLine();
		
		whatsappuser wu=new whatsappuser();
		wu.setName(name);
		wu.setPassword(password);
		wu.setEmail(email);
		wu.setAddress(address);
		
		
		int i=ws.createprofileservice(wu);//we should not transfer concrete data
		
		if(i>0) {
			System.out.println("profile created");
		}
		else {
			System.out.println("could not create profile");
		}
	
		
		//System.out.println("profile created");
	}
	@Override
	public void viewprofile()
	{
		ws.viewprofileservice();
		System.out.println("profile detail");
	}
	@Override
	public void updateprofile() 
	{
		ws.updateprofileservice();
	}
	@Override
	public void findprofile()
	{
		ws.findprofileservice();
	}
	
	public void activeprofile() 
	{
		ws.activeprofileservice();
	}	
}
