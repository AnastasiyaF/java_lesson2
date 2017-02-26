/*Задание 16.
Вычислить длину окружности и площадь круга одного и того же заданного радиуса R

Date: 17.02.2017
Author: Anastasiya Findziukevich
*/
package com.epam.java_training.ls2.task16;

import java.lang.Math;
import java.util.Random;

import com.epam.java_training.ls2.util.Util;

public class Circle {
	
	private static double  lengthCircle(double R){
		double resultvalue = 0;
	
		resultvalue = 2*Math.PI*R;
		
		return resultvalue;
		}
	
	private static double squareCircle(double R){
		double resultvalue = 0;
         
		resultvalue = Math.PI*Math.pow(R, 2);
		
		return resultvalue;
		}
	
	public static void doMain(){
		int R;
		double squareCircleResult;
		double lengthCircleResult;
		
		Random rand = new Random();
		
		Util.printBegin(16);
		
        R = rand.nextInt(15);
		
		System.out.println("R is " + R);
		
		squareCircleResult = squareCircle(R);
		
		System.out.println("The square is " + squareCircleResult);
		
		lengthCircleResult = lengthCircle(R);
		
		System.out.println("The length is " + lengthCircleResult);
		
		Util.printEnd(16);
	}

}
