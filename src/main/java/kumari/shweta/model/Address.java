/**
 * 
 */
package kumari.shweta.model;

/**
 * @author Shweta kumari
 *
 */
public class Address {
	String cityname;
	String street;
	
	
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address [cityname=" + cityname + ", street=" + street + "]";
	}

	

}
