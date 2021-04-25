package com.patientComparator;

import java.util.Comparator;

import com.patient.Patient;

public class PatientComparator implements Comparator<Patient> {

	@Override
	public int compare(Patient o1, Patient o2) {
		// TODO Auto-generated method stub
		
		return o1.getAge() - o2.getAge();
	}

	
}
