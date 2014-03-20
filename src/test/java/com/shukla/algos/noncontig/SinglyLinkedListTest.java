/**
 * 
 */
package com.shukla.algos.noncontig;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.shukla.nodes.BaseNode;
import com.shuklas.algos.noncontig.SinglyLinkedList;
import com.shuklas.algos.noncontig.SinglyLinkedList.EncapsulatedIterator;

/**
 * @author me
 *
 */
public class SinglyLinkedListTest {
	
	SinglyLinkedList<BaseNode> list = null;
	
	@Before
	public void init(){
		list = new SinglyLinkedList<BaseNode>();
	}
	
	@Test
	public void testList(){
		BaseNode b1 = new BaseNode("node1");
		BaseNode b2 = new BaseNode("node2");
		BaseNode b3 = new BaseNode("node3");
		BaseNode b4 = new BaseNode("node4");
		
		list.insert(b1);
		list.insert(b2);
		list.insert(b3);
		list.insert(b4);
		
		BaseNode fetched = list.fetch("node3");
		assertNotNull(fetched);
		assertEquals(fetched.getValue(), b3.getValue());
	}
	
	@Test
	public void testEncapsulatedIterator(){
		BaseNode b1 = new BaseNode("node1");
		BaseNode b2 = new BaseNode("node2");
		BaseNode b3 = new BaseNode("node3");
		BaseNode b4 = new BaseNode("node4");
		
		list.insert(b1);
		list.insert(b2);
		list.insert(b3);
		list.insert(b4);
		
		EncapsulatedIterator i = list.getIterator();
		while(i.hasNext()){
			BaseNode fetched = (BaseNode) i.next();
			assertNotNull(fetched);
			System.out.println(fetched.getValue());
		}
		
	}
	
	

}
