package in.com.capgemini.file;

//program to count number of words in a file
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NoOfWordsInFile {
	public static void main(String[] args) {
		BufferedReader reader = null;
		int wordCount = 0;
		try {
			reader = new BufferedReader(new FileReader("P:/Users/malag/Desktop/mal.txt"));
			// reading first line into currentLine
			String currentLine = reader.readLine();
			while (currentLine != null) {
				String[] words = currentLine.split(" ");

				// update wordCount
				wordCount = wordCount + words.length;

				// reading next line to currentLine
				currentLine = reader.readLine();
			}
			System.out.println("No of Words in a File :" + wordCount);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
