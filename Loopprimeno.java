package JavaPack;

import java.util.Scanner;

public class Loopprimeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the no.");
		int n=sc.nextInt();
		for(int i=2;i<=n/2;i++) 
		{
			if(n%i==0)
			{
			System.out.println(" not prime number");
			break;
			}
			else
			{
				System.out.println("prime number");
				break;
			}
		}

	}

}
