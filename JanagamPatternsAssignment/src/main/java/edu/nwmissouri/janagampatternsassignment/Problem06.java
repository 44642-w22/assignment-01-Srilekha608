/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.janagampatternsassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author S545118
 */
public class Problem06 {
    public static void main(String[] args){
   Stack<Integer> stack = new Stack<>();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of Stack");
		
		int size = scan.nextInt() ;
		if(size%2 == 0) { 
			System.out.println("Enter the list of Stack");
			for(int i=0; i<size;i++) {
				stack.add(scan.nextInt());
			}
			System.out.println("List of Integers : " + stack);
			
			List<Integer> L1 = new ArrayList<Integer>();
			
			for(int i=size;i>size/2;i--) {
				L1.add(stack.get(i-1));
			}
			for(int i=0;i<size/2;i++) {
				L1.add(stack.get(i));
			}
			System.out.println("List of Integers : " + L1);
			
		}else {
			System.out.println("Enter the even number length");
		}
		
	}
}

    

