package practice;

import java.util.Scanner;

public class Patternn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter any number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=i;j++) {
//				System.out.print(((i+j)%2)+" ");
				if((i+j)%2==0) {
					System.out.print(1);
				}else {
					System.out.print(0);
				}
			}
			System.out.println("");
		}

	}

}
