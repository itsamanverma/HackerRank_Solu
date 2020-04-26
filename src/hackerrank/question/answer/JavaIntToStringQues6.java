/*
 * You are given an integer n, you have to convert it into a string.
Please complete the partially completed code in the editor.
If your code successfully converts n into a string s the code will print "Good job".
Otherwise it will print "Wrong answer".

n can range between  -100 to 100  inclusive.*/

package hackerrank.question.answer;

import java.util.Scanner;
import java.security.*;

public class JavaIntToStringQues6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DoNotTerminate.forbidExit();

		  try {
			   Scanner in = new Scanner(System.in);
			   int n = in .nextInt();
			   in.close();
			   //String s=???; Complete this line below
			   //Write your code here
			   	String s = Integer.toString(n);
			   
			   if (n == Integer.parseInt(s)) {
			    System.out.println("Good job");
			   } else {
			    System.out.println("Wrong answer.");
			   }
		  } 
		  catch (DoNotTerminate.ExitTrappedException e) {
		   System.out.println("Unsuccessful Termination!!");
		  }
	}
	
	static class DoNotTerminate {

		 public static class ExitTrappedException extends SecurityException {

		  private static final long serialVersionUID = 1;
		 }
	
		 public static void forbidExit() {
			  final SecurityManager securityManager = new SecurityManager() {
			   @Override
			   public void checkPermission(Permission permission) {
			    if (permission.getName().contains("exitVM")) {
			     throw new ExitTrappedException();
			    }
			   }
			  };
			  System.setSecurityManager(securityManager);
			 }
	}
}
