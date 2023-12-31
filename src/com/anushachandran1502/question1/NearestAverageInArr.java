package com.anushachandran1502.question1;

import java.util.Scanner;

public class NearestAverageInArr {
	public static void main(String[] args) {
		NearestAverageInArr averageNearest=new NearestAverageInArr();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the array length");
		int len=scanner.nextInt();
		int[] arr=new int[len];
		for(int i=0;i<len;i++)
		{
			System.out.println("Index : "+i);
			arr[i]=scanner.nextInt();
		}
		averageNearest.averageNearestNumber(len,arr);
		
	}

	private void averageNearestNumber(int len, int[] arr) {
		int sum=0;
		for(int i=0;i<len;i++)
		{
			sum+=arr[i];
		}
		int average = sum / arr.length;
        int nearest = arr[0];
        double minDifference = Math.abs(average - arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int difference = Math.abs(average - arr[i]);
            if (difference < minDifference) {
                minDifference = difference;
                nearest = arr[i];
            }
        }
        System.out.println(nearest);
	}

}
