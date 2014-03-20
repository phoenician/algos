/**
 * 
 */
package com.shukla.nodes;

/**
 * @author shuklas
 *
 */
public class BaseNode implements BaseType<BaseNode>{

	private String value;
	
	public BaseNode(String value) {
		this.value = value;
	}
	
	public BaseNode deepCopy() {
		return new BaseNode(value);
	}

	public int compareTo(String key) {
		return this.value.compareTo(key);
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
}
