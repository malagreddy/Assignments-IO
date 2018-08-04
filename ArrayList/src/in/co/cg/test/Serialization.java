package in.co.cg.test;

//serialization
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serialization {

	public static void main(String[] args) {
		ArrayList<MyClass> list = new ArrayList<>();
		// object creation
		MyClass m1 = new MyClass(101, "Mala", 20000);
		MyClass m2 = new MyClass(102, "kala", 40000);
		MyClass m3 = new MyClass(103, "chandan", 24000);
		MyClass m4 = new MyClass(105, "Prabha", 21000);
		MyClass m5 = new MyClass(106, "Mahima", 20100);

		// add elements to the list
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);

		String filename = "list.ser";

		try (FileOutputStream fos = new FileOutputStream(filename);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(list);
			System.out.println("Serialization successful");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
