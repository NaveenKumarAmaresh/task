package navven;

public class exceptionhandling {
	public static void main(String[] args) {
        try {
            int[] a = new int[]{1, 2, 3, 4};
            System.out.println(a[5]);
        } catch (Exception var5) {
            System.out.println("print the catch the statments....");
        } finally {
            System.out.println("Report the statments.....");
        }

    }
}


