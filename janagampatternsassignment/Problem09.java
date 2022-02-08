/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.janagampatternsassignment;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author S545118
 */
public class Problem09 {
    public static void main(String[] args){
       	Queue<Integer> queue = new LinkedList<>();
		Queue<Integer> even_queue= new LinkedList<>();
		Queue<Integer> odd_queue = new LinkedList<>();

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length ");
		int len = scan.nextInt();
		
		System.out.println("Enter the list for Queue");
		for(int i=1; i<=len;i++) {
			queue.add(scan.nextInt());
		}
		
		System.out.println("List for Queue : " + queue);
		
		Queue<Integer> Q1 = new LinkedList<>(queue);
		
		for(int e : Q1) {
			if(e%2==0) {
					even_queue.add(e);	
			}else{
					odd_queue.add(e);				
				}
		}
		System.out.println("List of Queue : " + Q1);		
		System.out.println("List of Queue with odd index elements : " + odd_queue);
		System.out.println("List of Queue with even index elements : " + even_queue);
//		System.out.println("List of Queue : " + Q.element());
//		System.out.println("List of Queue : " + Q.peek());
		

		List<Integer> L1 = new ArrayList<Integer>(len);	
		
		for(int i=0;i<len;i++) {
				if(L1.size()<len) {
					if(!even_queue.isEmpty()) {
						L1.add(even_queue.poll());
					}
					if(L1.size()<len) {
						if(!odd_queue.isEmpty()) {
							L1.add(odd_queue.poll());	
						}
					}
				}
		}
		System.out.println("Output ArrayList : " + L1);
    }
    
}
