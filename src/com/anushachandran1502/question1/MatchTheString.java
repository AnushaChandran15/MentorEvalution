package com.anushachandran1502.question1;

import java.util.Scanner;

public class MatchTheString {
	public static void main(String[] args) {
		MatchTheString match=new MatchTheString();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string 1");
		String str1=scanner.next();
		System.out.println("Enter the string 2");
		String str2=scanner.next();
		StringBuilder notSameChar=new StringBuilder();
		if(str1.length()==str2.length())
		{
			String ans=match.characterMatch(str1,str2,notSameChar);
			System.out.println(ans);
		}
		else
		{
			System.out.println("Strings are not a same length");
		}
	}

	private String characterMatch(String str1, String str2,StringBuilder str) {
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)!=str2.charAt(i))
			{
				str.append(str1.charAt(i));
				str.append(str2.charAt(i));
			}
		}
		return str.toString();
	}
}
