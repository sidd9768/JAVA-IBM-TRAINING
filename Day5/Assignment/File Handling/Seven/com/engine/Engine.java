package com.engine;

import java.io.Serializable;

public class Engine implements Serializable {
	
	private transient String engineNo;
	private int cubicCapicity;
	
	public Engine() {};
	
	public Engine(String engineNo, int cubicCapicity) {
		super();
		this.engineNo = engineNo;
		this.cubicCapicity = cubicCapicity;
	}

	public String getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public int getCubicCapicity() {
		return cubicCapicity;
	}

	public void setCubicCapicity(int cubicCapicity) {
		this.cubicCapicity = cubicCapicity;
	}
	
	
	
	

}
