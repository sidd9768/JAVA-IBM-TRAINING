package com.serializecar;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.car.*;
import com.engine.*;
public class SerializeCar {

	public static void main(String[] args) {

		Car car = new Car("123ABC", "Mini Cooper", new Engine("A1B2", 500));
		ObjectOutputStream oos=null;
		try {
			
			oos = new ObjectOutputStream(new FileOutputStream("Cardata.ser"));
			oos.writeObject(car);
			System.out.println("Written Successfully");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
