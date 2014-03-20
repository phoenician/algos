/**
 * 
 */
package com.shukla.nodes;

/**
 * @author shuklas
 *
 */
public interface BaseType<T>{

	public T deepCopy();
	public int compareTo(String key);
}
