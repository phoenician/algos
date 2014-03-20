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
public class Queue<T extends BaseType<T>> {
	
	private int size;
	private int numNodes;
	private int front;
	private int rear;
	private T[] data;
	private Class<T> clazz;
	
	@SuppressWarnings("unchecked")
	public Queue(Class<T> clazz, int size) {
		this.size = size;
		this.numNodes = front = rear = 0;
		data = (T[]) Array.newInstance(clazz, size);
	}
	
	public boolean enqueue(T obj){
		if(isFull())
			return false;
		numNodes++;
		data[rear] = obj.deepCopy();//encapsulation
		rear = (rear+1)%size;//circular queue
		return true;
	}
	
	public T dequeue(){
		if(isEmpty())
			return null;
		T obj = data[front];
		numNodes--;
		front = (front+1)%size;//circular queue
		return obj;
	}
	
	public T peek(){
		if(isEmpty())
			return null;
		T obj = data[front].deepCopy();
		return obj;
	}
	
	public boolean isEmpty(){
		return numNodes == 0;
	}
	
	public boolean isFull(){
		return numNodes == size;
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
	 * @return the numNodes
	 */
	public int getNumNodes() {
		return numNodes;
	}

	/**
	 * @param numNodes the numNodes to set
	 */
	public void setNumNodes(int numNodes) {
		this.numNodes = numNodes;
	}

	/**
	 * @return the front
	 */
	public int getFront() {
		return front;
	}

	/**
	 * @param front the front to set
	 */
	public void setFront(int front) {
		this.front = front;
	}

	/**
	 * @return the rear
	 */
	public int getRear() {
		return rear;
	}

	/**
	 * @param rear the rear to set
	 */
	public void setRear(int rear) {
		this.rear = rear;
	}

	/**
	 * @return the data
	 */
	public T[] getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(T[] data) {
		this.data = data;
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
