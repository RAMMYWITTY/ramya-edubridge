package pattern.example.com;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the limit : ");
		int n=scanner.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<n-i;k++)
				System.out.print("*");
			System.out.println();
		}

	}

}
