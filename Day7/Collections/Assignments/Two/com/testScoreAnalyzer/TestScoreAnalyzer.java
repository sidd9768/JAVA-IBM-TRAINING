package com.testScoreAnalyzer;

import java.util.Scanner;

import com.scoreAnalyzer.*;
public class TestScoreAnalyzer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ScoreAnalyzer scoreAnalyzer = new ScoreAnalyzer();
		
		System.out.print("Enter total players : ");
		int size = sc.nextInt();
		
		for (int i=0; i<size; i++) {
			
			System.out.println("Enter runs");
			int score = sc.nextInt();
			scoreAnalyzer.addRunsToList(score);
		
		}
		
		scoreAnalyzer.displayRuns();
		
		System.out.println("\nRun Rate : " + scoreAnalyzer.calcRunRate());
		
		System.out.println("Lowest run scored : " + scoreAnalyzer.lowestRunScored());
		
		System.out.println("Count of players who batted : " + size);
		
	}

}
