/*
 * Задание 7.
 * Программа вводит два числа a и b, если а > b, то программа вводит третье число с и
находит сумму b+c. Если а=b, то программа печатает слово «Конец». Если а<b, то
программа вводит третье число с, находит сумму a+b+c, выводит на экран сумму
a+b+c и слова «Новый год!».

Date: 10.02.2017
Author: Anastasiya Findziukevich
 */
package com.epam.java_training.ls2.task7;

import java.util.Random;

import com.epam.java_training.ls2.util.Util;

public class PrintTask7 {
	public static void function(double a, double b){
		
		double c;
		double result;
		Random rand = new Random();
		
		System.out.println(" a = " + a);
        System.out.println(" b = " + b);
        
        if (a == b){
        	System.out.println("Конец.");
        	return;
        }
        
        c = rand.nextInt(10);
        System.out.println(" c = " + c);
        
        if (a > b){
        	result = b + c;
        	System.out.println("The result(b + c) = " + result);
        }
        else{
        	result = a + b + c;
        	System.out.println("The result(a + b + c) = " + result);
        	System.out.println("Новый год!");
        }  

	}

	public static void doMain() {
		double a;
		double b;
		
		Util.printBegin(7);
        a = 15;
        b = 10;
        function(a,b);
        
        a = 10;
        b = 10;
        function(a,b);
        
        a = 7;
        b = 9;
        function(a,b);
        
        Util.printEnd(7);
	}

}
