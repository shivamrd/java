package practice;

import java.util.Scanner;

public class Ptternrombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");			
			}
		for(int k=0;k<=n;k++) {
			System.out.print("*");
		}
		System.out.println();
		}

	}

}
