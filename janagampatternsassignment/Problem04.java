/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.janagampatternsassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author S545118
 */
public class Problem04 {
    public static void main(String[] args){
        List<String> L1 = new ArrayList<String>();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length ");
		int size = scan.nextInt();
	
		System.out.println("Enter the list of Strings");
		for(int i=0; i<size;i++) {
			L1.add(scan.next());
		}
		System.out.println("List of Strings : " + L1);
		
		List<String> Result = new ArrayList<>(L1);
		sortStringListByLength(Result);	
		System.out.println("Sorted List of String A1_dup: " +Result);
		
	}
	
	private static void sortStringListByLength(List<String> list) {
        System.out.println("-- sorting list of string --");
        Collections.sort(list, Comparator.comparing(String::length));
        list.forEach(System.out::println);
    
	}
        
        
        
    }
    

