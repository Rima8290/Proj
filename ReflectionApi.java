package reflection;
import java.lang.*;
public class ReflectionApi {

  
	  
	   public static void main(String[] args) {  
	      try {  
	         Class classlldr = Class.forName("java.lang.ClassLoader");  //lang class loader is passed as parameter  
	         System.out.println("Name of Class  = " + classlldr.getName());  //get the name of class  
	         System.out.println("Package Name  = " + classlldr.getPackage());//get the name of class  
	         System.out.println("Interface Name  = " + classlldr.getInterfaces());  //get the name of class  
	      } catch(ClassNotFoundException ex) {  
	         System.out.println(ex.toString()); //print  exception object  
	      }  
	   }  
	}  

