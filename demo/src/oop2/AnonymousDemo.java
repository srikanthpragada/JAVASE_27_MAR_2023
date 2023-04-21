package oop2;

interface MathOperations{
	int add(int n1, int n2);
}

class MyOperations implements MathOperations  {
    @Override
	public int add(int n1, int n2) {
		return  n1 + n2;
	}
}

public class AnonymousDemo {

	public static void main(String[] args) {

		 MathOperations op = new MyOperations();
		 System.out.println(op.add(10,20));
		 
		 MathOperations op2 = new MathOperations() {
			@Override
			public int add(int n1, int n2) {
				return n1 + n2;
			}
		 };
		 
		 System.out.println(op2.getClass());

	}

}
