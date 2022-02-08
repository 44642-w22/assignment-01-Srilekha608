/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.janagampatternsassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author S545118
 */
public class Problem03 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

		System.out.println("Enter the size of the list");
		int size = scan.nextInt();
		List<Integer> list =  new ArrayList<>();
               
	          while(size>0){
			System.out.println("Enter the number: ");
			int n = scan.nextInt();
			list.add(n);
                        size=size-1;
		        }
		
		
		
		
		if(list.size() == 0) {
			System.out.println(Integer.MIN_VALUE);
		} else {
			
			System.out.println("Max number in the list: "+Collections.max(list));
		}
		
    }
}
