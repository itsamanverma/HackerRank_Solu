package hackerrank.question.answer;

import java.util.Scanner;

public class javaDataTypeQues2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE) {
                	System.out.println("* byte");
                }
                //Complete the code
                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE){
                	System.out.println("* Short");
                }
                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE) {
                	System.out.println("* Int");
                }
                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE) {
                	System.out.println("* Long");
                }
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
	}
}
