/*
 * Задание 12.
 * Создать программу ввода целых чисел как аргументов командной строки, подсчета
их суммы и вывода результата на консоль.

Date: 14.02.2017
Author: Anastasiya Findziukevich
 */
package com.epam.java_training.ls2.task12;

import com.epam.java_training.ls2.util.Util;

public class ConsoleWork {
	public static void doMain(String[] args) {
		
		int sumNumbers = 0;
		
		Util.printBegin(12);
		
		System.out.println("The massive has the following items:");
		for (int i = 0; i < args.length; i++) {
		System.out.print("args[" + i + "]=" + args[i] + "; ");
		
		sumNumbers = sumNumbers + Integer.parseInt(args[i]);
		}
		
		System.out.println();
		System.out.println("The sum of numbers is " + sumNumbers);

		Util.printEnd(12);
	}
}
