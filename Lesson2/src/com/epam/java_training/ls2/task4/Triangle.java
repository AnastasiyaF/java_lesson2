/*
 * Задание 4.
 * Напишите программу нахождения гипотенузы и площади прямоугольного
треугольника по двум катетам.


Date: 10.02.2017
Author: Anastasiya Findziukevich
 */
package com.epam.java_training.ls2.task4;

import java.lang.Math;

import com.epam.java_training.ls2.util.Util;

public class Triangle {
	private double cathetus_1;
	private double cathetus_2;
	
	public Triangle(double _cathetus_1, double _cathetus_2){
		cathetus_1 = _cathetus_1;
		cathetus_2 = _cathetus_2;
	}
	
	private double calculateSquare(){
		double resultvalue;
		
		resultvalue = 0.5 * cathetus_1 * cathetus_2;
				
		return resultvalue;
	}
	
	private double calculatehypotenuse(){
		double resultvalue;
		
		resultvalue = Math.sqrt(this.cathetus_1*this.cathetus_1 + this.cathetus_2*this.cathetus_2);
		
		return resultvalue;
		
	}
	
	private void printTriangle(){
		System.out.println("The cathetus 1 is " + this.cathetus_1);
		System.out.println("The cathetus 2 is " + this.cathetus_2);
	}
	
	public void doMain(){
		
		double squareResult;
		double hypotenuseResult;
		
		Util.printBegin(4);
		
		printTriangle();
		
		squareResult = calculateSquare();
		System.out.println("The square is " + squareResult);
		
		hypotenuseResult = calculatehypotenuse();
		System.out.println("The value of hypotenuse is " + hypotenuseResult);
		
		Util.printEnd(4);
	}
}
