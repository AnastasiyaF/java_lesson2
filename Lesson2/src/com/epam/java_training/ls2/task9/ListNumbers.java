
/*Задание 9.
 * 
Программа запрашивает количество чисел, затем вводит целые числа в соответствии
с указанным количеством. Определяет количество четных, сумму кратных 3-м и
количество чисел, модуль которых <3

 Задание 11. 
 Программа запрашивает количество чисел, вводит целые числа в соответствии с
заявленным количеством ,определяет, сколько чисел больше 15 или <2, чему равна
сумма чисел, которые делятся на 5 с остатком 4. Результат вывести на экран.

Date: 14.02.2017
Author: Anastasiya Findziukevich
*/

package com.epam.java_training.ls2.task9;

import java.util.Random;

import com.epam.java_training.ls2.util.Util;

public class ListNumbers {
	
	int countNumbers;
	int[] massiveInt;
	
	ListNumbers(){
		
	}
	
	void SetCountNumbers(){
		Random rand = new Random();
		countNumbers = rand.nextInt(10);
	}
	
	public void SetMassiveInt(){
		massiveInt = new int[countNumbers];
        Util.enterArrayWithRandom(massiveInt);
       
	}
	
	int GetCountNumbers(){
		return countNumbers;
	}
	
	void PrintMassiveInt(){
		 Util.printArray(massiveInt);
	}
	
    void calculateTask9(){
	   int count_even_numbers = 0;
	   int sum_count_3 = 0;
	   int count_numbers_less_3 = 0;
		
	   for (int i = 0; i < massiveInt.length; i++) {
	    		
		   if (massiveInt[i]%2 == 0){
			   count_even_numbers = count_even_numbers + 1;
		   }
	       if (massiveInt[i]%3 == 0){
	    	   sum_count_3 = sum_count_3 + 1;
	       }
	       if (Math.abs(massiveInt[i]) < 3){
	    	   count_numbers_less_3 = count_numbers_less_3 + 1;
	       }
	    }
	    System.out.println(" Количество четных чисел - " + count_even_numbers);
	    System.out.println(" Количество чисел кратных 3 - " + sum_count_3);
	    System.out.println(" Количество чисел, модуль которых < 3 - " + count_numbers_less_3);
	}
	
   void calculateTask11(){
		 int count_numbers_1 = 0;
		 int count_numbers_2 = 0;
			
		 for (int i = 0; i < massiveInt.length; i++) {
		    		
			 if ((massiveInt[i] > 15) || (massiveInt[i] < 2)){
				 count_numbers_1 = count_numbers_1 + 1;
			 }
		     if (massiveInt[i]%5 == 4){
		    	 count_numbers_2 = count_numbers_2 + 1;
		     }
		 }
		 System.out.println(" Количество чисел >15 или <2 - " + count_numbers_1);
		 System.out.println(" Сумма чисел, которые делятся на 5 с остатком 4 - " + count_numbers_2);
	}
	
	public static void doMain(int numbertask){
		ListNumbers listNumbers = new ListNumbers();
		listNumbers.SetCountNumbers();
		listNumbers.SetMassiveInt();
		listNumbers.PrintMassiveInt();
		
		if (numbertask == 9){
			listNumbers.calculateTask9();
		}
		else{
			listNumbers.calculateTask11();
		}			
	}
}
