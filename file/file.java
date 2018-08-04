package in.com.capgemini.file;

//program to accept complete path of a file from user and display whether the file exists or not
import java.io.File;

public class file {

	public static void main(String[] args) {
		File file = new File("P:\\Users\\malag\\Desktop\\malag_155361");
		// checks if file exists or not
		if (file.exists()) {
			System.out.println("file Exists");
		} else {
			System.out.println("file does not Exist");
		}
	}
}
