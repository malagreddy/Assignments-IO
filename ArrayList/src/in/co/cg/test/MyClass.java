package in.co.cg.test;

// MyClass implements Serializable
import java.io.Serializable;

public class MyClass implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5321622806579041928L;
	// instance members
	private int id;
	private String empName;
	private float salary;

	// constructor
	public MyClass(int id, String empName, float salary) {
		super();
		this.id = id;
		this.empName = empName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "MyClass [id=" + id + ", empName=" + empName + ", salary=" + salary + "]";
	}

}
