package in.co.cg.test;
//deserialization
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	Employee employee;

	public static void main(String[] args) {
		Employee employee = new Employee(101, "Mala", 10000);
		String filename = "employee.ser";
		try (FileInputStream fis = new FileInputStream("employee.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);) {

			employee = (Employee) ois.readObject();
			System.out.println(employee);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
