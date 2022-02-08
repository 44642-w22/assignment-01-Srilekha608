/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.janagampatternsassignment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author S545118
 */
public class Problem02 {
    public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
		
		List<Integer> L1 = new LinkedList<>();
		
		System.out.println("Enter lenght of list: ");
		int L1Length = scan.nextInt();
		
		while(L1Length > 0) {
			System.out.println("Enter the number: ");
			int inp = scan.nextInt();
			L1.add(inp);
			L1Length= L1Length-1;
		}
		System.out.println("Enter the number to check the value");
		int k = scan.nextInt();
		List<ArrayList<Integer>> linkedList2 = new LinkedList<>();

		for (int i = 0; i < L1.size() - 1; i++) {
            int a = L1.get(i);
            int b = L1.get(i+1);
            int sum = a+b;
           if(sum== k) {
        	   ArrayList<Integer> array =  new ArrayList<>();
        	   array.add(a);
        	   array.add(b);
        	   linkedList2.add(array);
           }
        }
		
		System.out.println(linkedList2);
		
    }
}
