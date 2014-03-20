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
public class UnsortedOptimizedArray<T extends BaseType<T>> {
	private int next;
	private int size;
	private T[] data;

	@SuppressWarnings("unchecked")	
	public UnsortedOptimizedArray(Class<T> cls, int size) {
		this.size = size;
		next = 0;
		this.data = (T[]) Array.newInstance(cls, size);
	}

	//unsorted insert into next available position 
	public boolean insert(T obj){
		if(next <= size - 1){
			data[next] = obj.deepCopy();
			//check if data was not copied successfully due to insufficient memory
			if(data[next] != null){
				next++;
				return true;
			}
		}
		return false;
	}
	
	//read serially to fetch based on key then move the item up a position
	public T fetch(String key){
		int pos = 0;
		for(T target : data){
			if(target.compareTo(key) == 0){
				if(pos > 0){
					T temp = data[pos-1];
					data[pos-1] = target;
					data[pos] = temp;
				}
				return target.deepCopy();
			}
			pos++;
		}
		return null;
	}
	
	//read data serially to delete. update the deleted node with data from last node
	public boolean delete(String key){
		int pos = 0;
		for(T target : data){
			if(target.compareTo(key) == 0){
				T temp = data[next];
				data[pos] = temp;
				data[next] = null;
				next--;
				return true;
			}
			pos++;
		}
		return false;
	}

	//delete and then insert
	public boolean update(String key, T obj){
		return (delete(key) && insert(obj));
	}

	/**
	 * @return the next
	 */
	public int getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(int next) {
		this.next = next;
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
	 * @return the datastore
	 */
	public T[] getDatastore() {
		return data;
	}

	/**
	 * @param datastore the datastore to set
	 */
	public void setDatastore(T[] datastore) {
		this.data = datastore;
	}
}
