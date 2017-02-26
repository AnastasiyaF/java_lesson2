/*
 * Задание 10.
 * Программа вводит количество чисел N, а затем N вещественных чисел. Программа
усекает вещественные числа и определяет, сколько среди усеченных чисел четных
и >15.

Date: 14.02.2017
Author: Anastasiya Findziukevich
 */
package com.epam.java_training.ls2.task10;

import com.epam.java_training.ls2.util.Util;

public class RealNumbers {
	public static void doMain() {
		int countNumbers;
		double[] massiveDouble;
		int temp;
		int count_even_numbers = 0;
			
		countNumbers = 8;
        
		Util.printBegin(10);
        
        System.out.println(" countNumbers = " + countNumbers);
        
        massiveDouble = new double[countNumbers];
        Util.enterArrayWithRandom(massiveDouble);
        Util.printArray(massiveDouble);
        
        for (int i = 0; i < massiveDouble.length; i++) {
    		temp = (int)massiveDouble[i];
    		
        	if ((temp%2 == 0) && (temp > 15)){
        		count_even_numbers = count_even_numbers + 1;
    		}
        }
        System.out.println(" Количество четных чисел больше 15 - " + count_even_numbers);
    
        Util.printEnd(10);
	}
}
