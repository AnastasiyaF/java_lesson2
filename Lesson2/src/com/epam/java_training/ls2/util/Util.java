package com.epam.java_training.ls2.util;

import java.util.Random;


public class Util {
	public static void enterArrayWithRandom(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(500);
		}
	}
	
	public static void enterArrayWithRandom(double[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = 50*rand.nextDouble();
		}
	}
	
	public static int enterValueWithRandom() {
		int a;
		Random rand = new Random();
		a = rand.nextInt(15);
		
		System.out.println(a + " is generated.");
		
		return a;
	}
	
	public static void printArray(int[] mas) {
		System.out.println("The massive has the following items:");
		for (int i = 0; i < mas.length; i++) {
		System.out.print("mas[" + i + "]=" + mas[i] + "; ");
		}
		System.out.println();
	}
	public static void printArray(double[] mas) {
		System.out.println("The massive has the following items:");
		for (int i = 0; i < mas.length; i++) {
		System.out.print("mas[" + i + "]=" + mas[i] + "; ");
		}
		System.out.println();
	}
	public static void printArray(String[] mas) {
		System.out.println("The massive has the following items:");
		for (int i = 0; i < mas.length; i++) {
		System.out.print("mas[" + i + "]=" + mas[i] + "; ");
		}
		System.out.println();
	}
	
	public static void printBegin(int tasknumber){
		
		System.out.println("Task" + tasknumber +" is in progress...");
	}
	
	public static void printEnd(int tasknumber){
		
		System.out.println("Task" + tasknumber +" is completed." + "\n");
	}
}
