/*
 * �������.
 * ��������� ������ ��� ����� a � b, ���� a=b, 
 * �� ������� �� ����� ����� ������ ����� ���!�,
 * � ��������� ������ ������ ������ ����� �
 * � ������� �� ����� 3 ������ :
 * -�������� ��������� a+b+c
 * -�������� ��������� 2+2
 * -���� ������� ���������� �������
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
	    	 System.out.println("����� ����� ���!");
	         return;
	     }
	        
	     c = rand.nextInt(10);
	     System.out.println(" c = " + c);
	      
	     result = a + b + c;
	     System.out.println("The result(a + b + c) = " + result);
	       
	     result = Math.pow(a, 2) + Math.pow(b, 2);
	     System.out.println("The result(a^2 + b^2) = " + result);
	        
	     System.out.println("��� ������� ���������� �������");
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
