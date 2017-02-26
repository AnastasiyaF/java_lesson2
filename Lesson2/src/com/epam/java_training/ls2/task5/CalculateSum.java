/*
 * Задание 5.
 * Напишите программу вычисления суммы четырёх слагаемых.
 * 
 * 
Date: 10.02.2017
Author: Anastasiya Findziukevich
 */
package com.epam.java_training.ls2.task5;

import java.util.Random;

import com.epam.java_training.ls2.util.Util;

public class CalculateSum {
	public static void doMain() {
	
		int a1;
		int a2;
		int a3;
		int a4;
		int s;
		
		Random rand = new Random();
		
        a1 = rand.nextInt(1000);
        a2 = rand.nextInt(1000);
        a3 = rand.nextInt(1000);
        a4 = rand.nextInt(1000);
        
        Util.printBegin(5);
        
        System.out.println(" a1 = " + a1);
        System.out.println(" a2 = " + a2);
        System.out.println(" a3 = " + a3);
        System.out.println(" a4 = " + a4);
        
        s= a1 + a2 + a3 + a4;
        
        System.out.println("The sum is s = " + s);
        
        Util.printEnd(5);
	}


}
