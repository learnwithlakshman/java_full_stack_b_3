package com.lwl.cj.day23;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class MyFileReader implements Closeable {

	String[] data = {};

	public String[] getSampleData() {
		data = "Although moreover mistaken kindness me feelings do be marianne Son over own nay with tell they cold upon are. Cordial village and settled she ability"
				.split(" ");

		return data;
	}

	@Override
	public void close() throws IOException {
		System.out.println("Close method is called");
		if (data != null) {
			data = new String[] {};
		}
	}

}

class FileReaderUtil {

	public void readDataFromFile(String fileName){
		try (BufferedReader br = new BufferedReader(new FileReader(fileName));) {
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("Catch block");
			e.printStackTrace();
		}
		System.out.println("End of method");
	}
	
	public int division(int a,int b) {
		
		return a / b;
	}

}

public class ExceptionExample1 {

	public static void main(String[] args) throws IOException {
		
		
		String fileName = "resources/data.txt";
		FileReaderUtil fru = new FileReaderUtil();
		fru.readDataFromFile(fileName);

		Throwable[] arr = new Throwable[] { new IOException(), new NullPointerException(), new NumberFormatException(),
				new CloneNotSupportedException(), new IllegalArgumentException(), new FileNotFoundException(),
				new ClassCastException() };

		for(Throwable t:arr) {
			if(t instanceof RuntimeException) {
				
			}else if(t instanceof Exception) {
				
			}else if(t instanceof Error) {
				
			}else {
				
			}
		}
		
//		try (MyFileReader fr = new MyFileReader()) {
//			String[] arr = fr.getSampleData();
//			for (String str : arr) {
//				System.out.println(str);
//			}
//		}

	}
}
