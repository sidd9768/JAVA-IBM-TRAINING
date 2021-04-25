package com.scoreAnalyzer;

import java.util.Iterator;
import java.util.LinkedList;

public class ScoreAnalyzer {
	
	private LinkedList runsData = new LinkedList();;
	
	public ScoreAnalyzer() {};

	public ScoreAnalyzer(LinkedList runsData) {
		this.runsData = runsData;
	}
	
	public void addRunsToList(int score) {
		this.runsData.add(score);
	}
	
	public double calcRunRate() {
		
		int totalRuns=0;
		Iterator iter = runsData.iterator();
		while(iter.hasNext()) {
			totalRuns = totalRuns +  (int) iter.next();
		}
		return (double) totalRuns/50;
		
	}
	
	public int lowestRunScored() {
		
		int lowest = (int) runsData.get(0);
		for (Object run: runsData) {
			if((int) run < lowest) {
				lowest = (int) run;
			}
		}
		return lowest;
	}
	
	public void displayRuns() {
		
		System.out.print("Runs Scored : ");
		runsData.forEach((run) -> System.out.print(run + " "));
		
	}
	

}
