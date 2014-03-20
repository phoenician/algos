/**
 * 
 */
package com.shukla.nodes;

/**
 * @author shuklas
 *
 */
public class ListNode<T extends BaseType<T>>{

	private ListNode<T> next;
	
	private ListNode<T> previous;
	
	/** The value object referenced by a node */
	private T obj;	
	
	/**
	 * @return the obj
	 */
	public T getObj() {
		return obj;
	}
	/**
	 * @param obj the obj to set
	 */
	public void setObj(T obj) {
		this.obj = obj;
	}
	/**
	 * @return the next
	 */
	public ListNode<T> getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(ListNode<T> next) {
		this.next = next;
	}
	/**
	 * @return the previous
	 */
	public ListNode<T> getPrevious() {
		return previous;
	}
	/**
	 * @param previous the previous to set
	 */
	public void setPrevious(ListNode<T> previous) {
		this.previous = previous;
	}
}
