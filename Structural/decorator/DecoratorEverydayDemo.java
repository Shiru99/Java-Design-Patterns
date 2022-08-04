package Structural.decorator;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class DecoratorEverydayDemo {
	public static void main(String args []) throws Exception {

		File file = new File("./output.txt");
		file.createNewFile();
		
		DataOutputStream doStream = new DataOutputStream(new FileOutputStream(file));

		doStream.writeChars("hello world");

		Thread.sleep(5000);
		
		doStream.close();
		file.delete();
	}
}
