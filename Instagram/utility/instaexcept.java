package com.Instagram.utility;
//Exception in class
public class instaexcept extends Exception {


	private String name;

	
	@Override
	public String toString() {
		
				
	//tostring method of throwables 
		//to check it cmd  thn type path of java jdk ..bin thn javap java.lang.Object will show wht all facilities in object are present
		//finalize method is also prt of this
		//tostring converts obj to str
		
				return "User not exist";
			}
			
			public instaexcept(String name) {
				this.name=name;
			}
			
			public String uu() {
				String nn=null;
				//if(name.length()<3) {
					nn="username should be more than 3 character";
				//}
				return nn;
			}
			
			public String uu1() {
				String nn=null;
				if(name.length()>8) {
					nn="username should not be more than 8 character";
				}
				return nn;
			}

}
