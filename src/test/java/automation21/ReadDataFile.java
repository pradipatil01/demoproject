package automation21;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadDataFile {

	public static void main(String[] args) throws IOException {
		
	 FileReader reader = new FileReader("C:\\Users\\dell\\eclipse-workspace\\automationbatch\\TestData\\ReadDataFile.txt");
	 int character;
	 while ((character = reader.read()) != -1) {
		 System.out.print((char)character);
	 }
	 reader.close();
		
	}

}
