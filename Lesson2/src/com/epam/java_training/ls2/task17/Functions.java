/*
Задание 17.

Вычислить значение функции:

F(x)= 9, если x <= -3
F(x)= 1/x^2+1, если x > 3


Date: 17.02.2017
Author: Anastasiya Findziukevich
 */

package com.epam.java_training.ls2.task17;

import com.epam.java_training.ls2.util.Util;

public class Functions {
	
	public static double function(double x){
		double result = 0;
		
		System.out.println("The value is " + x);
		
		if (x <= -3){
			return 9;
		}
		else if (x > 3){
			result = 1/(Math.pow(x, 2)+1);
		}
		else{
			
			return Double.NaN;
		}
		
		return result;
		
	}
	public static void doMain(){
	
		double x = 0;
		double result = 0;
		
		Util.printBegin(17);
		
		x = -167;
		result = function(x); 
		System.out.println("The result is " + result);
		
		x = 11;
		result = function(x);
		System.out.println("The result is " + result);
		
		x = 2;
		result = function(x);
		System.out.println("The result is " + result);
		
		
		Util.printEnd(17);
	}
}
