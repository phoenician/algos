/**
 * 
 */
package com.shukla.algos.contig;


import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.shukla.algos.contig.Queue;
import com.shukla.nodes.Listing;

/**
 * @author shuklas
 *
 */
public class QueueTest {
	
	Queue<Listing> q;
	
	@Before
	public void init(){
		q = new Queue<Listing>(Listing.class, 10);
	}

	@Test
	public void testEnqueue() {
		
		Listing l1 = new Listing("Sulabh", "7823 E Flamingo Dr, CA", "789127891");
		Listing l2 = new Listing("Kumar", "7812 E Oakland Ave, Az", "32409238");
		Listing l3 = new Listing("Venkat", "8923 W Queen Creek Rd, Az", "1290801");
		Listing l4 = new Listing("Ashish", "7823 Sausolito, CA", "782378112");
		
		q.enqueue(l1);
		q.enqueue(l2);
		q.enqueue(l3);
		q.enqueue(l4);
		
		Assert.assertEquals(q.getNumNodes(), 4);
		Listing peek = q.peek();
		Assert.assertEquals(peek.getName(), "Sulabh");
		Assert.assertEquals(q.getNumNodes(), 4);
		Listing fetch1 = q.dequeue();
		Assert.assertEquals(fetch1.getName(), "Sulabh");
		Assert.assertEquals(q.getNumNodes(), 3);
		Listing fetch2 = q.dequeue();
		Assert.assertEquals(fetch2.getName(), "Kumar");
		Assert.assertEquals(q.getNumNodes(), 2);
	}
}
