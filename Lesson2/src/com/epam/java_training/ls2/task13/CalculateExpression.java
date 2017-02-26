/*
 * «адание 13.
 * ¬ычислить значение выражени€ по формуле (все переменные принимают
действительные значени€):

a) b + sqrt(b^2 + 4ac)/2a - a^3*c +b;
b) a/c * b/d - (ab -c)/cd;

Date: 14.02.2017
Author: Anastasiya Findziukevich
*/
package com.epam.java_training.ls2.task13;

import java.util.Random;

import com.epam.java_training.ls2.util.Util;

public class CalculateExpression {

	private static double calcExp1(double a, double b, double c){
		double result;
		
		result = (b + Math.sqrt(Math.pow(b,2) + 4 * a * c))/(2*a) - Math.pow(a, 3) * c + b;
		
		return result;
	}
	
	private static double calcExp2(double a, double b, double c, double d){
		double result;
		
		result = (a/c)*(b/d) - ((a*b - c)/(c*d));
		
		return result;
	}
	
	public static void doMain() {
		
		double a;
		double b;
		double c;
		double d;
		double result;
		
		Random rand = new Random();
		
        a = 10*rand.nextDouble();
        b = -1*rand.nextDouble();
        c = 2*rand.nextDouble();
        d = 3*rand.nextDouble();
        
        Util.printBegin(13);
        
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);
        System.out.println(" c = " + c);
        System.out.println(" d = " + d);
        
        result = calcExp1(a, b, c);
        
        System.out.println("The result(b + sqrt(b^2 + 4ac)/2a - a^3*c +b) = " + result);
        
        result = calcExp2(a, b, c, d);
        
        System.out.println("The result(a/c * b/d - (ab -c)/cd) = " + result);
        
        Util.printEnd(13);
	}
}
