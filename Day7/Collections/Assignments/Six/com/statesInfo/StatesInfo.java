package com.statesInfo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class StatesInfo {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("states.txt"));
		LinkedHashSet<String> stateSet = new LinkedHashSet<>();
		
		String val = null;
		while((val = br.readLine()) != null) {
			stateSet.add(val);
		}
		
		br.close();
		
		System.out.println("Total number of states : " + stateSet.size());
		
		stateSet.remove("Delhi");
		
		System.out.println("Total number of states : " + stateSet.size());
		
		System.out.println("\nStates starting with 'K' : ");
		for (String state : stateSet) {
			if(state.startsWith("K")) {
				System.out.println(state);	
			}
		}
		
		
		TreeSet<String> orderedState = new TreeSet<>();
		orderedState.addAll(stateSet);
		
		System.out.println("\nStates in ordered way : ");
		Iterator<String> it = orderedState.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
