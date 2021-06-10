package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {
	
	@JsonProperty("town") private String town;
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public Address(String town, String street, String streetNumber, Double cordX, Double cordY) {
		super();
		this.town = town;
		this.street = street;
		this.streetNumber = streetNumber;
		this.cordX = cordX;
		this.cordY = cordY;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}
	public Double getCordX() {
		return cordX;
	}
	public void setCordX(Double cordX) {
		this.cordX = cordX;
	}
	public Double getCordY() {
		return cordY;
	}
	public void setCordY(Double cordY) {
		this.cordY = cordY;
	}
	@JsonProperty("street") private String street;
	@JsonProperty("streetNumber") private String streetNumber;
	@JsonProperty("cordX") private Double cordX;
	@JsonProperty("cordY") private Double cordY;


}
