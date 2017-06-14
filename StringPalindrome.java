package logics;

import java.util.Scanner;

public class StringPalindrome {
public static void main(String[] args) {
	System.out.println("Enter the String");
	Scanner s=new Scanner(System.in);
	String st=s.next();
	int n=st.length();
	byte[] b=st.getBytes();
	byte[] b1=new byte[n];
	int count=0;
	for(int i=n-1;i>=0;i--) {
		int x=n-(i+1);
		b1[x]=b[i];
	}
	for(int i=0;i<b.length;i++) {
	if(b[i]==b1[i]) {
		count++;
	}
	}
	if(count==n) {
		System.out.println("The entered string is palindrome");
	}
	else {
		System.out.println("The entered string is not a palindrome");
	}
}
}
