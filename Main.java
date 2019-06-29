package reflection;

public class Main {

	   public static void main(String[] args) {

	     Main c = new Main();
	     Class cls = c.getClass();

	     // determines if the specified Class object represents an interface type
	     boolean retval = cls.isInterface();
	     System.out.println("It is an interface ? " + retval);       
	   }
	}
