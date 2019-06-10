package com.jbk.BasicMaven;

import org.testng.Assert;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@org.testng.annotations.Test
	public void sum(){
		System.out.println("Sum");
		int a=10;
		int b=10;
		Assert.assertEquals(10, 10);
		
	}
}
