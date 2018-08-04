package in.co.cg.test;

// Desirialization
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Desirialization {
	public static void main(String[] args) {
		ArrayList<MyClass> list;// array list
		String filename = "employee.ser";
		try (FileInputStream fis = new FileInputStream("list.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);) {

			list = (ArrayList<MyClass>) ois.readObject();
			System.out.println(list);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
