/**
 * 
 */
package com.shukla.algos.util;

import org.junit.Test;

import com.shukla.algos.util.ArithmeticExpressionResolver;
import static junit.framework.Assert.*; 


/**
 * @author shuklas
 *
 */
public class ArithmeticExpressionResolverTest {
	private static final double DELTA = 1e-15;
	@Test
	public void testPostFix() {
		ArithmeticExpressionResolver aer = new ArithmeticExpressionResolver();

//		assertEquals(aer.postfixExpressionResolver("4.15 3 * 2 +"), 4.15d*3d+2d, DELTA);
//		assertEquals(aer.postfixExpressionResolver("4 3 + 5 *"), 35.0d);
//		assertEquals(aer.postfixExpressionResolver("4 3 * 2 +"), 14.0);
	}
}
