/**
 * 
 */
package com.shuklas.algos.noncontig;

import com.shukla.nodes.BaseType;
import com.shukla.nodes.ListNode;

/**
 * @author shuklas
 *
 */
public class SinglyLinkedList<T extends BaseType<T>> {

	//head
	ListNode<T> head;
	EncapsulatedIterator iterator = null;


	public SinglyLinkedList() {
		head = new ListNode<T>();
		head.setNext(null);
		iterator = new EncapsulatedIterator();
	}

	public boolean insert(T obj){
		T objCopy = obj.deepCopy();
		if(objCopy == null)
			return false;//memory full
		ListNode<T> newNode = new ListNode<T>();
		newNode.setObj(objCopy);
		newNode.setNext(head.getNext());
		head.setNext(newNode);
		return true;
	}

	public T fetch(String key){
		ListNode<T> currNode = head.getNext();
		while(currNode !=null && !(currNode.getObj().compareTo(key) == 0)){
			currNode = currNode.getNext();
		}
		if(currNode != null)
			return currNode.getObj().deepCopy();
		return null;
	}

	public boolean update(String key, T obj){
		if(delete(key) && insert(obj))
			return true;
		return false;
	}

	public boolean delete(String key){
		ListNode<T> currNode = head.getNext();
		ListNode<T> prevNode = head;
		while(currNode !=null && !(currNode.getObj().compareTo(key) == 0)){
			prevNode = currNode;
			currNode = currNode.getNext();
		}
		if(currNode != null){
			prevNode.setNext(currNode.getNext());
			return true;
		}
		return false;
	}

	/**
	 * @return the iterator
	 */
	public EncapsulatedIterator getIterator() {
		return iterator;
	}

	/**
	 * @param iterator the iterator to set
	 */
	public void setIterator(EncapsulatedIterator iterator) {
		this.iterator = iterator;
	}

	public class EncapsulatedIterator{

		ListNode<T> currentNode;
		
		public EncapsulatedIterator() {
			currentNode = head;
		}

		public T next(){
			if(currentNode != null){
				currentNode = currentNode.getNext();
				return currentNode.getObj().deepCopy();
			}
			return null;
		}

		public boolean hasNext(){
			return (currentNode != null ? (currentNode.getNext() != null) : false);
		}

		public void reset(){
			currentNode = head;
		}

		public void set(T obj){
			currentNode.setObj(obj.deepCopy());
		}
	}
}
