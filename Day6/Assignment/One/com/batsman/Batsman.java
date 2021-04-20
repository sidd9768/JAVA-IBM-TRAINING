package com.batsman;

import java.io.Serializable;

public class Batsman implements Serializable {
	
	private int id;
	private String name;
	private int innings;
	private int runs;
	
	public Batsman() {};
	
	public Batsman(int id, String name, int innings, int runs) {
		super();
		this.id = id;
		this.name = name;
		this.innings = innings;
		this.runs = runs;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getInnings() {
		return innings;
	}
	public void setInnings(int innings) {
		this.innings = innings;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	
	@Override
	public String toString() {
		return "ID : " + id + "\nName : " + name + "\nInnings : " + innings + "\nRuns : " + runs;
	}
	

}
