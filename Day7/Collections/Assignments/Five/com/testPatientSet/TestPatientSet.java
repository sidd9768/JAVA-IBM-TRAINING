package com.testPatientSet;

import java.util.LinkedHashSet;

import com.patient.Patient;

public class TestPatientSet {

	public static void main(String[] args) {
		
		Patient patient1 = new Patient(112, "Waoqin", 23);
		Patient patient2 = new Patient(111, "Marco", 35);
		Patient patient3 = new Patient(113, "Jack", 18);
		Patient patient4 = new Patient(110, "Abselum", 53);
		Patient patient5 = new Patient(115, "Mohit", 9);
		Patient patient6 = new Patient(113, "Jack", 18);
		
		LinkedHashSet<Patient> patients = new LinkedHashSet<Patient>();
		
		patients.add(patient1);
		patients.add(patient2);
		patients.add(patient3);
		patients.add(patient4);
		patients.add(patient5);
		patients.add(patient6);
		
		System.out.println("The size of patients Set is : " + patients.size());
		
		
		System.out.println("PATIENTS : ");
		patients.forEach((patient) -> System.out.println(patient));

	}

}
