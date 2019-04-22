package com.company;
import javax.print.DocFlavor;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
    	//to count the size of the string wirh outh using lingth method
    	String newString = "fikruayaleneh melese";
		char[] stringToCharArray = newString.toCharArray();
		int s =0;
		for(char elements:stringToCharArray){
			s++;
		}

		System.out.println("the size of the string is "+ s);
    	Scanner scan = new Scanner(System.in);
    	int [] arrayList = new int[2];
    	System.out.println("enter a number");
    	for(int i=0; i<arrayList.length; i++){
    		arrayList[i] = scan.nextInt();
			//System.out.println(arrayList[i]);

		}

		for(int element:arrayList){
    		System.out.print(element + " ");

		}
		System.out.println();

		int[] array1 = {1,7,6,5,9};
    	int[] array2 = {2,7,6,3,4};
    	for(int i =0 ;i<array1.length; i++){
    		for(int j=0;j<array2.length;j++){
    			if(array1[i]+array2[j]==13)
    				System.out.println("("+array1[i]+ ","+array2[j]+")");
			}
		}
		Student fikru = new Student();
    	fikru.name("fikru");
    	fikru.scor(98);
    	fikru.desplay();




    }
}
