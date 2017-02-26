package com.epam.java_training.ls2.main;

import com.epam.java_training.ls2.printtasks.Task1;
import com.epam.java_training.ls2.printtasks.Task2;
import com.epam.java_training.ls2.printtasks.Task3;
import com.epam.java_training.ls2.task10.RealNumbers;
import com.epam.java_training.ls2.task12.ConsoleWork;
import com.epam.java_training.ls2.task13.CalculateExpression;
import com.epam.java_training.ls2.task14.PowerClass;
import com.epam.java_training.ls2.task15.IntervalFunction;
import com.epam.java_training.ls2.task16.Circle;
import com.epam.java_training.ls2.task17.Functions;
import com.epam.java_training.ls2.task4.Triangle;
import com.epam.java_training.ls2.task5.CalculateSum;
import com.epam.java_training.ls2.task6.CalculateExp;
import com.epam.java_training.ls2.task7.PrintTask7;
import com.epam.java_training.ls2.task8.PrintTask8;
import com.epam.java_training.ls2.task9.ListNumbers;
import com.epam.java_training.ls2.util.Util;

public class Main {

	public static void main(String[] args) {

		
		/*Task 1*/
		Task1.doMain();
		
		/*Task 2*/
		Task2.doMain();
		
		/*Task 3*/
		Task3.doMain();
		
		/*Task 4*/
		Triangle triangle = new Triangle (3, 5);
		triangle.doMain();
		
		/*Task 5*/
		CalculateSum.doMain();
		
		/*Task 6*/
		CalculateExp.doMain();
		
		/*Task 7*/
		PrintTask7.doMain();
		
		/*Task 8 */
		PrintTask8.doMain();
		
		/*Task 9*/
		Util.printBegin(9);
		ListNumbers.doMain(9);
		Util.printEnd(9);
		
		/*Task 10*/
		RealNumbers.doMain();
		
		/*Task 11*/
		Util.printBegin(11);
		ListNumbers.doMain(11);
		Util.printEnd(11);
		
		/*Task 12*/
		ConsoleWork.doMain(args);
		
		/*Task 13*/
		CalculateExpression.doMain();
		
		/*Task 14*/
		PowerClass.doMain();
		
		/*Task 15*/
		IntervalFunction.doMain();
		
		/*Task 16*/
		Circle.doMain();
		
		/*Task 17*/
		Functions.doMain();
		
	}

}
