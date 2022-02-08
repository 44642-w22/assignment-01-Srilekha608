/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.janagampatternsassignment;

import java.util.ArrayList;
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
public class Problem08 {
     public static void main(String[] args){
       Queue<Integer> Q1 = new LinkedList<>();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length ");
		int size = scan.nextInt();
		
		System.out.println("Enter the list for Queue");
		for(int i=1; i<=size;i++) {
			Q1.add(scan.nextInt());
		}
		
		System.out.println("List of Queue : " + Q1);
		
		Stack<Integer> S = new Stack<>();
		
		Iterator<Integer> objIterator = Q1.iterator();  
		while(objIterator.hasNext())
		{
			S.add(objIterator.next());
		}
		
		List<Integer> L1 = new ArrayList<Integer>(size);	
		
		for(int i=0;i<size;i++) {
				if(L1.size()<size) {
					L1.add(S.get(size-i-1));
					if(L1.size()<size) {
						L1.add(S.get(i));
					}
				}
		}
		System.out.println("Output ArrayList : " + L1);
    }
    
    
}
