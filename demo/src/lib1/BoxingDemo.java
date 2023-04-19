package lib1;

public class BoxingDemo {

	public static void main(String[] args) {
		 Object obj;
		 
		  obj = "Abc";
		  System.out.println(obj.getClass());
		  
		  obj = 10;  // int -> Integer   autoboxing 
		  System.out.println(obj.getClass());
		  
 		  //Integer iobj = new Integer(10);
		  Integer iobj = 10;
		  int v = iobj; // auto-unboxing 
	}

}
