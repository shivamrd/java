package JavaPack;

import java.util.Scanner;

public class Loopsumofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any digit");
		int n=sc.nextInt();
		int sum=0;
		while(n!=0) {
			int r=n%10;
			sum=sum+r;
			n=n/10;
			
		}
		System.out.println("sum ="+sum);

	}

}
