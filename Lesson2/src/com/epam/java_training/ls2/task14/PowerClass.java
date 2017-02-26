/*
 * «адание 14.
 * 
 * ƒаны три действительных числа. ¬озвести в квадрат те из них, значени€ которых
неотрицательны, и в четвертую степень Ч отрицательные.

 * Date: 17.02.2017
   Author: Anastasiya Findziukevich
 */
package com.epam.java_training.ls2.task14;

import com.epam.java_training.ls2.util.Util;

public class PowerClass {
	public static double powerFunction(double a, int b){
		double result = 0;
		result = Math.pow(a, b);
		
		return result;
		
	}
	
	public static void doMain(){
		
		double[] doubleMassive = new double[3];
		double resultvalue = 0;
		int powervalue = 0;
		
		Util.printBegin(14);
		
		Util.enterArrayWithRandom(doubleMassive);

		System.out.println("The massive has the following items:");
		for (int i = 0; i < doubleMassive.length; i++) {
		System.out.print("doubleMassive[" + i + "]=" + doubleMassive[i] + "; ");
		
		if (doubleMassive[i] < 0){
			powervalue = 4;
		}
		else{
			powervalue = 2;
		}
		resultvalue = powerFunction(doubleMassive[i], powervalue);
		System.out.println();
		System.out.println("The power is " + powervalue + ", the result is " + resultvalue);
		
		}

		Util.printEnd(14);
		
	}
	
}
