/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.janagampatternsassignment;

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;


/**
 *
 * @author S545118
 */
public class Problem07 {
  
     public static void main(String[] args){
       Queue<Integer> Q1 = new LinkedList<>();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of Queue");
		int size = scan.nextInt();
		
		System.out.println("Enter the list of Queue with 0's and 1's");
		for(int i=1; i<=size;i++) {
			Q1.add(scan.nextInt());
		}

		System.out.println("List of Queue : " + Q1);
		
		int Output = 0;
		int index = size-1;
		for(int e : Q1) {
			Output += e*(Math.pow(2,index));
			index--;
		}
		System.out.println("Output : " + Output);
    }
}
