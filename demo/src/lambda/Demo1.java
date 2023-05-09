package lambda;

class Task implements Runnable {
	public void run() {
		System.out.println("Implemeting Runnable");
	}
}

public class Demo1 {

	public static void printNumbers() {
		 for(int i  = 1; i <= 5; i ++)
             System.out.println(i);
	}
	
	public static void main(String[] args) {
         Thread t1  = new Thread(new Task());
         t1.start();
         
         Thread t2 = new Thread(new Runnable() {
			public void run() {
				 System.out.println("Anonymous inner class demo!");
			}
         });
         
         t2.start();
         
         
         
         // Lambda Expression 
         Thread t3 = new Thread( () -> System.out.println("Lambda Thread!"));
         t3.start();
         
//         
//         // Lambda Block
//         Thread t3 = new Thread( () -> {
//        	   for(int i  = 1; i <= 5; i ++)
//                System.out.println(i);
//            }
//         );
//         t3.start();
//         
//         // Method Reference
//         Thread t4 = new Thread(Demo1::printNumbers);
//         t4.start();
	}

}
