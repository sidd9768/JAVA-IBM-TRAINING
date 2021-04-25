package com.testPatient;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

import com.patient.*;
import com.patientComparator.PatientComparator;
public class TestPatient {

	public static void main(String[] args) {
		
		Patient patient1 = new Patient(112, "Waoqin", 23);
		Patient patient2 = new Patient(111, "Marco", 35);
		Patient patient3 = new Patient(113, "Jack", 18);
		Patient patient4 = new Patient(110, "Abselum", 53);
		Patient patient5 = new Patient(115, "Mohit", 9);
		
		ArrayList<Patient> patients = new ArrayList<Patient>();
		
		patients.add(patient1);
		patients.add(patient2);
		patients.add(patient3);
		patients.add(patient4);
		patients.add(patient5);
		
		for (Object patient: patients) {
			System.out.println(patient);
		}
		
		Collections.sort(patients);
		System.out.println("\n======== After Sorting (NAME) ========\n");
		patients.forEach((patient) -> System.out.println(patient));
//		for (Object patient: patients) {
//			System.out.println(patient);
//		}
		
		Collections.sort(patients, new PatientComparator());
		System.out.println("\n======== After Sorting (AGE) ========\n");
		Iterator iter = patients.iterator();
		while(iter.hasNext()) {
			System.out.println((Patient) iter.next());
		}
		
		
		TreeSet<Patient> patientsTree = new TreeSet<Patient>();
		patientsTree.add(patient1);
		patientsTree.add(patient2);
		patientsTree.add(patient3);
		patientsTree.add(patient4);
		patientsTree.add(patient5);


		System.out.println("\nTreeSet : \n" + patientsTree);
		
		String patientName = "Mohit";
		int patientAge = getPatientAge(patientName , patientsTree);
		System.out.println("The age of " + patientName + " is : " + patientAge);
		
	}
	
	static int getPatientAge(String name, TreeSet set) {
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Patient patient = (Patient) it.next();
			if (name.equals(patient.getName())){
				return patient.getAge();
			}
		}
		return 1;
	}

}
