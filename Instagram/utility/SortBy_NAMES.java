package com.Instagram.utility;

import java.util.Comparator;

import com.Intagram.Entity.Instagramuser;

public class SortBy_NAMES implements Comparator <Instagramuser> { 


		@Override
		public int compare(Instagramuser i1, Instagramuser i2) {
			// TODO Auto-generated method stub
			return i1.getName().compareTo(i2.getName());
		}
		

	
}
