/**
 * 
 */
package com.shukla.algos.util;

import java.util.ArrayList;
import java.util.List;

import com.shukla.algos.contig.Stack;
import com.shukla.nodes.BaseNode;


/**
 * @author shuklas
 *
 */
public class ArithmeticExpressionResolver {
	
	Stack<BaseNode> operandStack = new Stack<BaseNode>(BaseNode.class, 10);
	List<String> operators = null;
	
	public ArithmeticExpressionResolver() {
		operators = new ArrayList<String>();
		operators.add("*");
		operators.add("/");
		operators.add("%");
		operators.add("+");
		operators.add("-");
	}
	
	public String postfixExpressionResolver(String postFixExp){
		String[] tokens = postFixExp.split(" ");
		String result;
		for(String token : tokens){
			if(operators.contains(token)){
				double op1 = Double.parseDouble(operandStack.pop().getValue());
				double op2 = Double.parseDouble(operandStack.pop().getValue());
				operandStack.push(new BaseNode(Double.toString(execute(op1, op2, operators.indexOf(token)))));
			}else{
				operandStack.push(new BaseNode(token));
			}
		}
		result = operandStack.pop().getValue();
		System.out.println("Result of evaluating post fix expression [" + postFixExp + "] is: " + result);
		return result;
	}
	
	private double execute(double d1, double d2, int operatorIdx){
		double value;
		switch (operatorIdx) {
		case 0: value = (double)d1*d2; break;
		case 1: value = (double)d1/d2; break;
		case 2: value = (double)d1%d2; break;
		case 3: value = (double)d1+d2; break;
		case 4: value = (double)d1-d2; break;
		default: value = (double)0;	break;
		}
		return value;
	}

}
