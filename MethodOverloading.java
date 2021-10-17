package week3.day1;

public class MethodOverloading {

	public void addition(int x, int y) {
		int z = x + y;
		System.out.println("Sum is:" + z);

	}

	public void addition(int x, int y, int z) {
		int a = x + y + z;
		System.out.println("Sum is:" + a);

	}

	public static void main(String[] args) {
		MethodOverloading mol = new MethodOverloading();
		System.out.println("MethodOverloadig same - Same Method Two Parameters ");
		mol.addition(5, 2);
		System.out.println("MethodOverloadig same - Same Method Three Parameters ");
		mol.addition(3, 6, 9);

	}

}
