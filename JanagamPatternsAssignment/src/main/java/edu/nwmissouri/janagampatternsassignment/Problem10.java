/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.janagampatternsassignment;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


/**
 *
 * @author S545118
 */
public class Problem10 {
    
    public static void main(String[] args){
      Deque<String> DQ1 = new ArrayDeque<>();
		List<Integer> L1 = new ArrayList<>();	
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length");
		int len = scan.nextInt();
		
		System.out.println("Enter the Characters for Deque");
		for(int i=1; i<=len;i++) {
			DQ1.add(scan.next());
		}
		
		System.out.println("Enter the length of array operations");
		int len_array = scan.nextInt();
		
		System.out.println("Enter the Array of operations in 1 and 0 ");
		for(int i=1; i<=len_array;i++) {
			L1.add(scan.nextInt());
		}
		
		System.out.println("List of Deque : " + DQ1);
		System.out.println("Array of operations : " + L1);
		
		Deque<String> result = new LinkedList<>(DQ1);
		Stack<String> stack = new Stack<>();
		
		for(int e : L1) {
			switch(e) {
			 	case 1: if(!result.isEmpty()) {
			 		stack.add(result.pollFirst());
			 		break;
			 	}
			 	case 0: if(!stack.isEmpty()) {
			 		result.addFirst(stack.pop());
			 		break;
			 	}
			}
		}
		

		
		Iterator<String> objIterator = result.iterator();  
		while(objIterator.hasNext())
		{
			System.out.print(objIterator.next());
		}
    }
}