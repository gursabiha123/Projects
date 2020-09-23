package com.demo.views;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.demo.business.demosbusinessInterface;
import com.demo.utility.Businessfactory;
import com.demo.utility.Demosexcept;

public class demosviews {

	
	public static void main(String[] args) {
		try {
			 
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			String cc="y";
			demosbusinessInterface di;
			di = Businessfactory.createObject("adminbusinessservice");
			while(cc.equals("y")) {
			System.out.println("*********************************MAIN MENU************************");
			System.out.println("press 1 to create profile");
			System.out.println("press 2 to search profile");
			System.out.println("press 3 to delete profile");
			System.out.println("press 4 to view all profile");
			System.out.println("enter your choice ");
			int i=Integer.parseInt(br.readLine());
			
			switch(i) {
			
			case 1: di.createProfile();
				break;
			case 2: di.searchProfile();
				break;
			case 3:di.deleteProfile();
			break;
			case 4:di.viewall();
			break;
			default:System.out.println("wrong choice");
			
			}
			System.out.println("continue? y / n");
			cc=br.readLine();	
			}
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(Demosexcept e1)
		{
			//System.out.println("wrong choice");
			e1.printStackTrace();
		}
}
}
