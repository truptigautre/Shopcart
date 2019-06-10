package com.jbk.BasicMaven;

import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String text1="0123";
        String text2="0123df4";
        boolean result1= StringUtils.isNumeric(text1);
        boolean result2= StringUtils.isNumeric(text2);
        System.out.println(text1+" Is numeric?" +result1);
        System.out.println(text2+" Is numeric?" +result2);
        
         
    }
     public void m1()
     {
    	 System.out.println("hii");
     }
}
