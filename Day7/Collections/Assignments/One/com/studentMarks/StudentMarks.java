package com.studentMarks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		
		ArrayList studentMarks = new ArrayList();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students : ");
		int size = sc.nextInt();
//		studentMarks.add(40);
//		studentMarks.add(30);
//		studentMarks.add(60);
//		studentMarks.add(70);
		for (int i=0; i<size; i++) {
			System.out.print("Enter your mark : ");
			int mark = sc.nextInt();
			studentMarks.add(mark);
		}
		System.out.println(studentMarks);
		//Highest Marks
		int highest = 0;
		for (int i=0; i<size ; i++) {
			if((int)studentMarks.get(i) > highest) {
				highest = (int) studentMarks.get(i);
			}
		}
		System.out.println("Highest mark : " + highest);
		
		//Average Marks
		double average = 0;
		for(int i=0; i<studentMarks.size(); i++) {
			average = average + (int) studentMarks.get(i);
		}
		
		System.out.println("Average : " + (double) average/size);
		
		//3rd Student marks
		System.out.println("3rd Students mark: " + studentMarks.get(2));
		
		Iterator iter = studentMarks.iterator();
		System.out.print("Marks (Using Iterator) : " );
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		
		Collections.sort(studentMarks);
		
		System.out.print("\nSorted : ");
		for (int i=0; i<size; i++) {
			System.out.print(i+1 + "-" + studentMarks.get(i) + " ");
		}

	}

}
