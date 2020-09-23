package com.demo.Entity;

public class Addrs extends demosuser {
String street;
String State;
String country;
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((State == null) ? 0 : State.hashCode());
	result = prime * result + ((country == null) ? 0 : country.hashCode());
	result = prime * result + ((street == null) ? 0 : street.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	Addrs other = (Addrs) obj;
	if (State == null) {
		if (other.State != null)
			return false;
	} else if (!State.equals(other.State))
		return false;
	if (country == null) {
		if (other.country != null)
			return false;
	} else if (!country.equals(other.country))
		return false;
	if (street == null) {
		if (other.street != null)
			return false;
	} else if (!street.equals(other.street))
		return false;
	return true;
}

}
