package com.test;

import com.medicine.*;

public class Testmedicine {

	public static void main(String[] args) {
		
		Medicine[] medicines = new Medicine[5];
		
		medicines[0] = new Tablet();
		medicines[1] = new Syrup();
		medicines[2] = new Ointment();
		
		medicines[0].displayLabel();
		medicines[1].displayLabel();
		medicines[2].displayLabel();

	}

}
