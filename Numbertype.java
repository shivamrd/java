package JavaPack;

import java.util.Scanner;

public class Numbertype {
	static void num(int x) {
		
		if(x<0) {
			System.out.println(" negative number");
		}
		else {
			System.out.println("positive number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new  Scanner(System.in);
		System.out.println("enter your number");
		int n=sc.nextInt();
		num(n);

	}

}
