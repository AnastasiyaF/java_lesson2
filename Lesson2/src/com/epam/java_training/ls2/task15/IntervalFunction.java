/*
 * Задание 15.
 * Составить программу для вычисления значений функции F(x) на отрезке [а, b] с
шагом h. Результат представить в виде таблицы, первый столбец которой – значения
аргумента, второй - соответствующие значения функции:

F(x) = 2*tg(x/2) + 1

Date: 17.02.2017
Author: Anastasiya Findziukevich
 */
package com.epam.java_training.ls2.task15;

import com.epam.java_training.ls2.util.Util;

public class IntervalFunction {
	public static double function(double x){
		double result = 0;
		
		result = 2*Math.tan(x/2) + 1;
		
		return result;
		
	}
	public static void doMain(){
	
		double x = 0;
		double y = 0;
		double h = 0;
		double stepx = 0;
		
		Util.printBegin(15);
		
		x = 1;
		y = 4;
		h = 0.25;
		
		System.out.println("x = " + x + ", y = " + y + ", h = " + h);
		
		while(x < y){
			
			System.out.println(" x = " + x + ", F(x) = " + function(y));
			stepx = x + h;
			System.out.println(" stepx = " + stepx);
			
			x= x + h;
			
		}
		System.out.println(" y = " + y + ", F(x) = " + function(y));
		
		Util.printEnd(15);
	}
	
}
