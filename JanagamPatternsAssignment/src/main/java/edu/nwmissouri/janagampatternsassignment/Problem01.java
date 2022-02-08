/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.janagampatternsassignment;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author S545118
 */
public class Problem01 {
    public static void main(String[] args) {
		
               Scanner scan = new Scanner(System.in);
		
		List<Integer> L1 = new LinkedList<>();
		
		System.out.println(" Enter length of list: ");
		int L1Length = scan.nextInt();
		
		while(L1Length > 0) {
			System.out.println("Enter the number: ");
			int input = scan.nextInt();
			L1.add(input);
			L1Length= L1Length-1;
		}
		List<Integer> L2 = new LinkedList<>();
		
		Iterator<Integer> iterator = L1.iterator();
		
		while(iterator.hasNext()) {
			int num = iterator.next();
			int sum = 0;
			for( int i=1; i< num; i++) {
				if(num%i == 0) {
					sum = sum + i;
				}
			}
			if( sum == num) {
				L2.add(num);
			}
		}
		
		System.out.println(L2);
	
	
    }
}
    

