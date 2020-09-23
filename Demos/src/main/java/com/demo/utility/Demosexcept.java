package com.demo.utility;

public class Demosexcept extends Exception {

	private String name;
	public Demosexcept(String name)
	{
		this.name=name;
	}
	@Override
	
	public String toString()
	{
		return "my exception";
	}
	
}
