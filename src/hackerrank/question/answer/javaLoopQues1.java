package hackerrank.question.answer;

import java.util.Scanner;

public class javaLoopQues1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int serier = a;
            for(int j=0;j<n;j++) {
            	serier+=(Math.pow(2,j)* b);
            	System.out.print(serier+" ");
            }
            System.out.println();
        }
        in.close();
        
	}

}
