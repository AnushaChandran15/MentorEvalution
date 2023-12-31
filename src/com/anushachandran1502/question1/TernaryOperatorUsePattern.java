package com.anushachandran1502.question1;

import java.util.Scanner;

public class TernaryOperatorUsePattern {
	public static void main(String[] args) {
		TernaryOperatorUsePattern pattern=new TernaryOperatorUsePattern();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the value");
		int value=scanner.nextInt();
		pattern.PrintPattern(value);
	
	}

	private void PrintPattern(int value) {
	int m=value*2-1;
//		int k=0;
//		for(int i=0;i<m;i++)
//		{
//			for(int j=0;j<=m-i;j++)
//			{
//				System.out.print((i+j==i)?value:"");
//				System.out.print((i==k)?value:"");
//				System.out.print((m-i==0)?value:"");
//				System.out.print((j==m-i)?value:"");
//			}
//			System.out.println();
//			k++;
//		}
	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < m; j++) {
	        	int val1=(i<m+1-i-1)?i:m+1-i-2;
	        	int val2=(j<m+1-j-1)?j:m+1-j-2;
	        	System.out.print(value-Math.min(val1, val2));
	        	
	        }
	          	        System.out.println();
	    }
	}
}
