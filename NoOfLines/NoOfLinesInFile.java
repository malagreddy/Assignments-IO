package in.com.capgemini.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;

public class NoOfLinesInFile {
	public static void main(String[] args) throws IOException {
		int LineCount = 0;
		BufferedReader reader = new BufferedReader(new FileReader("P:/Users/malag/Desktop/mal.txt"));

		while (true) {
			String line = reader.readLine();
			if (line == null) {
				break;
			}
			LineCount++;
		}
		reader.close();
		System.out.println("LineCount" + LineCount);
	}

}
