/*
 * Задание.
 * Программа вводит два числа a и b, если a=b, 
 * то вывести на экран слова «скоро Новый Год!»,
 * в противном случае ввести третье число с
 * и вывести на экран 3 строки :
 * -значение выражения a+b+c
 * -значение выражения 2+2
 * -«моя любимая футбольная команда»
 * 
Date: 10.02.2017
Author: Anastasiya Findziukevich
 */
package com.epam.java_training.ls2.task8;

import java.lang.Math;
import java.util.Random;

import com.epam.java_training.ls2.util.Util;

public class PrintTask8 {
	
	public static void function(double a, double b){
		 double c;
		 double result;
		 Random rand = new Random();
			
		 System.out.println(" a = " + a);
	     System.out.println(" b = " + b);
	        
	     if (a == b){
	    	 System.out.println("скоро Новый Год!");
	         return;
	     }
	        
	     c = rand.nextInt(10);
	     System.out.println(" c = " + c);
	      
	     result = a + b + c;
	     System.out.println("The result(a + b + c) = " + result);
	       
	     result = Math.pow(a, 2) + Math.pow(b, 2);
	     System.out.println("The result(a^2 + b^2) = " + result);
	        
	     System.out.println("моя любимая футбольная команда");
	}
	public static void doMain() {
		double a;
		double b;
        
		Util.printBegin(8);
        
        a = 15;
        b = 10;
        function(a,b);
        
        a = 10;
        b = 10;
        function(a,b);
        
        a = 7;
        b = 9;
        function(a,b);
       
        Util.printEnd(8);
	}
}
