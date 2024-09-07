package finaltest;

public class A extends B{
	// the compiler will find suitable method with the correct type of parameter
	public void p(double i) {
		System.out.println(i);
	}
}
