package com.car;

import java.io.Serializable;

import com.engine.*;
public class Car implements Serializable {
	
	private transient String registerationNo;
	private String carMake;
	private Engine engine;
	
	public Car() {};
	
	public Car(String registerationNo, String carMake, Engine engine) {
		super();
		this.registerationNo = registerationNo;
		this.carMake = carMake;
		this.engine = engine;
	}

	public String getRegisterationNo() {
		return registerationNo;
	}

	public void setRegisterationNo(String registerationNo) {
		this.registerationNo = registerationNo;
	}

	public String getCarMake() {
		return carMake;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
	@Override
	public String toString() {
		String toReturn = "CAR DETAILS : \n" +
				"Car Make : " + carMake + "\n\nENGINE DETAILS \n" +
				"Cubic Capacity : " + engine.getCubicCapicity();
//		return "CAR DETAILS : " + "\nCar Make : \n" + carMake + "\nENGINE DETAILS : \n" + engine.getCubicCapicity();
		return toReturn;
	}

}
