package com.example.demo.Model;

import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.jni.Address;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Shop {
	
	@JsonProperty("name")    
	private String name;
	@JsonProperty("mobiles") 
	private List<String> mobiles = new ArrayList<String>();
	@JsonProperty("address")   
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getMobiles() {
		return mobiles;
	}
	public void setMobiles(List<String> mobiles) {
		this.mobiles = mobiles;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Shop(String name, List<String> mobiles, Address address) {
		super();
		this.name = name;
		this.mobiles = mobiles;
		this.address = address;
	}
	

}
