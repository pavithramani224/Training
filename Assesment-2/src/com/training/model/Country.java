package com.training.model;

public class Country {
private String countryName;
private String Place;
private long Population;
public Country() {
	super();
	// TODO Auto-generated constructor stub
}
public Country(String countryName, String place, long population) {
	super();
	this.countryName = countryName;
	Place = place;
	Population = population;
}
public String getCountryName() {
	return countryName;
}
public void setCountryName(String countryName) {
	this.countryName = countryName;
}
public String getPlace() {
	return Place;
}
public void setPlace(String place) {
	Place = place;
}
public long getPopulation() {
	return Population;
}
public void setPopulation(long population) {
	Population = population;
}
@Override
public String toString() {
	return "Country [countryName=" + countryName + ", Place=" + Place + ", Population=" + Population + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((Place == null) ? 0 : Place.hashCode());
	result = prime * result + (int) (Population ^ (Population >>> 32));
	result = prime * result + ((countryName == null) ? 0 : countryName.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Country other = (Country) obj;
	if (Place == null) {
		if (other.Place != null)
			return false;
	} else if (!Place.equals(other.Place))
		return false;
	if (Population != other.Population)
		return false;
	if (countryName == null) {
		if (other.countryName != null)
			return false;
	} else if (!countryName.equals(other.countryName))
		return false;
	return true;
}

}
