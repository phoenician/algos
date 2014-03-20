/**
 * 
 */
package com.shukla.nodes;

/**
 * @author shuklas
 *
 */
public class Listing implements BaseType<Listing>{
	
	private String name;
	private String address;
	private String number;
	
	public Listing(String name, String address, String number) {
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	public Listing deepCopy(){
		Listing clone = new Listing(name, address, number);
		return clone;
	}
	
	public int compareTo(String key) {
		return name.compareTo(key);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}
}
