package JavaPack;

import java.util.Scanner;

public class Swap_func {
	void swap(  int a,int b)
	{
		a=a+b;
		b=a-b;
	    a=a-b;
	    System.out.println("after swapping"+a+b);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number");
		int x=sc.nextInt();
	    int y=sc.nextInt();
	    Swap_func r=new Swap_func();
	    r.swap(x,y);

	}

}
