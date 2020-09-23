
package com.Instagram.view;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.Instagram.Controller.InstagramController;
import com.Instagram.Controller.InstagramControllerInterface;
import com.Instagram.utility.Controllerfactory;
import com.Instagram.utility.Servicefactory;
public class Instagramview {
	

		public static void main(String[] args) {
			try {
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
				String cc="y";
				while(cc.equals("y")) {
				System.out.println("*********************************MAIN MENU************************");
				System.out.println("press 1 to create profile");
				System.out.println("press 2 to edit profile");
				System.out.println("press 3 to delete profile");
				System.out.println("press 4 to view profile");
				System.out.println("press 5 to search profile");
				System.out.println("press 6 to viewAll profile");
				//System.out.println("press 7 to create ur own table  profile");
				System.out.println("press 7 to view user detail wid history");
				//System.out.println("press 8 to view user detail by file");
				
				System.out.println("enter your choice ");
				int i=Integer.parseInt(br.readLine());
				
				
				InstagramControllerInterface fi;
				fi=Controllerfactory.createObject("admincontrollerservice");
				
				
				switch(i) {
				
				case 1: fi.createProfile();
					break;
				case 2: fi.editProfile();
					break;
				case 3:fi.deleteProfile();
					break;
				case 4:fi.viewProfile();
					break;
				case 5:fi.searchProfile();
					break;
				case 6:fi.viewAllProfile();
					break;
				//case 7:fi.createcustomTable();
				//break;
				case 7:fi.userdetailwithhistory();
					break;
				
				default:System.out.println("wrong choice");
				
				}
				System.out.println("continue? y / n");
				cc=br.readLine();
				}
				}
		catch(IOException e1)
		{
			e1.printStackTrace();
		}

}}
