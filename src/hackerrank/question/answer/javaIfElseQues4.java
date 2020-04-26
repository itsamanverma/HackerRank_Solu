package hackerrank.question.answer;

import java.util.Scanner;

//Task
//Given an integer, , perform the following conditional actions:
//
//If  is odd, print Weird
//If  is even and in the inclusive range of  to , print Not Weird
//If  is even and in the inclusive range of  to , print Weird
//If  is even and greater than , print Not Weird
//Complete the stub code provided in your editor to print whether or not  is weird.
//
//Input Format
//
//A single line containing a positive integer, .
//
//Constraints
//
//Output Format
//
//Print Weird if the number is weird; otherwise, print Not Weird.

public class javaIfElseQues4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String string = "";
		if(num%2 == 1) {
			 string = "Weird";
		}else {
			if(num >=2 && num<6) {
				string = "Not Weird";
			}else if(num >=6 && num <= 20){
				string = "Weird";
			}else {
				string = "Not Weird";
			}
		}
		System.out.println(string);
	}

}
