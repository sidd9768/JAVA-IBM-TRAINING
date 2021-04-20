package com.deserializecar;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.car.*;
import com.engine.*;
public class DeserializeCar {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Cardata.ser"));
		
		Car car = (Car) ois.readObject();
		
		System.out.println(car);

	}

}
