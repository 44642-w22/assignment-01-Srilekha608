/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.janagampatternsassignment;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 *
 * @author S545118
 */
public class Problem05 {
    	public static boolean areBracketsBalanced(String expr) {
		Deque<Character> DQ1 = new ArrayDeque<Character>();

		for (int i = 0; i < expr.length(); i++) {
			char x = expr.charAt(i);

			if (x == '(' || x == '[' || x == '{') {
				DQ1.push(x);
				continue;
			}

			if (DQ1.isEmpty())
				return false;
			char check;
			switch (x) {
			case ')':
				check = DQ1.pop();
				if (check == '{' || check == '[')
					return false;
				break;

			case '}':
				check = DQ1.pop();
				if (check == '(' || check == '[')
					return false;
				break;

			case ']':
				check = DQ1.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			}
		}

		return (DQ1.isEmpty());
	}
    
   public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String input = scan.next();

		if (areBracketsBalanced(input))
			System.out.println("True ");
		else
			System.out.println("False");
	}
         
    }

