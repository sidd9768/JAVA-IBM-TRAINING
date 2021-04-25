package com.testFileExplorer;

import com.fileexplorer.*;
public class TestFileExplorer {

	public static void main(String[] args) {

		String path = "/Users/asif/downloads/Badminton";
		FileExplorer fe = new FileExplorer();
		
		fe.listAll(path);

	}

}
