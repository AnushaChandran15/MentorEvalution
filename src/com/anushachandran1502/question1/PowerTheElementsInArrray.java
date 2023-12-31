package com.anushachandran1502.question1;

import java.util.Arrays;
import java.util.Scanner;

public class PowerTheElementsInArrray {

	public static void main(String[] args) {
		PowerTheElementsInArrray powEleInArr=new PowerTheElementsInArrray();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the length of the Array");
		int length=scanner.nextInt();
		double[] arr=new double[length];
	System.out.println("Enter the power value");
		int power=scanner.nextInt();
		
		for(int i=0;i<length;i++)
		{
			System.out.println("Index : "+i);
			arr[i]=scanner.nextInt();
		}
	//bubble sort use
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
				}
			}
		}	
		for(int k=0;k<arr.length;k++)
		{
				arr[k]= powEleInArr.powTheEle(arr[k],power);
		}	
		System.out.println(Arrays.toString(arr));

}
	
	private double powTheEle(double base,int power) {
		 double ans=1.0;
		 int pow=(power<0)?power*-1:power;
		 if (power == 0) {
	            return ans;  
	        }
		 	for(int i=0;i<pow;i++)
		 	{
		 		
		 		ans*=base;
		 	}
	        
          return (power<0)?1.0/ans:ans;  
        
    }
}


