package hackerrank.question.answer;

import java.util.Scanner;
import java.util.regex.Pattern;

public class javaEndOfFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        Pattern pattern = Pattern.compile("[A-Za-z]*");  
        int line =1;
        
        while(sc.hasNext()) {
        	if(sc.hasNext(pattern)) {
        		String s=sc.nextLine();
            	System.out.println(line + " " + s);
            	line++;
        	}
        }
	}

}
