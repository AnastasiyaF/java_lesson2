/*
 * Задание 6.
 * Программа запрашивает у пользователя a,b,c ,вычислить значение выражения a^2-(b-c)^
2+ln(b2+1).

Date: 10.02.2017
Author: Anastasiya Findziukevich
 */
package com.epam.java_training.ls2.task6;

import java.util.Random;
import java.lang.Math;

import com.epam.java_training.ls2.util.Util;

public class CalculateExp {
	private static double calcExp(double a, double b, double c){
		double result;
		
		result = Math.pow(a, 2) - Math.pow((b-c), 2)+Math.log(Math.pow(b, 2) + 1);
		
		return result;
	}
	public static void doMain() {
		
		double a;
		double b;
		double c;
		double result;
		
		Random rand = new Random();
		
        a = rand.nextInt(10);
        b = rand.nextInt(10);
        c = rand.nextInt(10);
        
        Util.printBegin(6);
        
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);
        System.out.println(" c = " + c);
        
        result = calcExp(a, b, c);
        
        System.out.println("The result(a^2-(b-c)^2 + ln(b^2 + 1)) = " + result);
        
        Util.printEnd(6);
	}

}
