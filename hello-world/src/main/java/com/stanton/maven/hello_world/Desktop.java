package com.stanton.maven.hello_world;

public class Desktop {
	
	private String name;
	private String address;

	public Desktop() {
		// TODO Auto-generated constructor stub
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Desktop(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public String getDefaultAddress() {
		return SubDesktop.name;
	}

}

class SubDesktop {
	public static String name = "default address";
}
