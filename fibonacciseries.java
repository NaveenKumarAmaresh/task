package navven;

public class fibonacciseries {
	  public static void main(String[] args) {
	        System.out.println("......Fibonacci Series.........");
	        int f1 = 0;
	        int f2 = 1;
	        System.out.println(f1);
	        System.out.println(f2);

	        for(int j = 1; j <= 5; ++j) {
	            int f3 = f1 + f2;
	            System.out.println(f3);
	            f1 = f2;
	            f2 = f3;
	        }
	  }


