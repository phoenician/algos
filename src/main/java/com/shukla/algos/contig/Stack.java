/**
 * 
 */
package com.shukla.algos.contig;

import java.lang.reflect.Array;

import com.shukla.nodes.BaseType;

/**
 * @author shuklas
 *
 */
public class Stack<T extends BaseType<T>> {
	
	private int size;
	private int top;
	private T[] data;
	Class<T> clazz;

	@SuppressWarnings("unchecked")
	public Stack(Class<T> cls, int size) {
		this.top = -1;
		this.size = size;
		this.clazz = cls;
		data = (T[]) Array.newInstance(clazz, size);
	}
	
	public boolean push(T obj){
		if(isFull())
			return false;//stack overflow
		else{
			top++;
			data[top] = obj.deepCopy();
			return true;
		}
	}
	
	public T pop(){
		if(isEmpty())
			return null;//stack underflow
		else{
			top--;
			return data[top+1];
		}
	}
	
	@SuppressWarnings("unchecked")
	public void reinitialize(){
		this.top = -1;
		data = (T[]) Array.newInstance(clazz, size);
	}
	
	public T peek(){
		if(isEmpty())
			return null;//stack underflow
		else{
			return data[top + 1];
		}
	}
	
	public boolean isFull(){
		if(top == size -1)
			return true;
		return false;
	}
	
	public boolean isEmpty(){
		if(top == -1)
			return true;
		return false;
	}
	
	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}
	/**
	 * @return the top
	 */
	public int getTop() {
		return top;
	}
	/**
	 * @param top the top to set
	 */
	public void setTop(int top) {
		this.top = top;
	}
	/**
	 * @return the db
	 */
	public T[] getDb() {
		return data;
	}
	/**
	 * @param db the db to set
	 */
	public void setDb(T[] db) {
		this.data = db;
	}

	/**
	 * @return the clazz
	 */
	public Class<T> getClazz() {
		return clazz;
	}

	/**
	 * @param clazz the clazz to set
	 */
	public void setClazz(Class<T> clazz) {
		this.clazz = clazz;
	}
}
