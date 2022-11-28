package com.bridgelaz.basiccoreprograms;
import java.util.Scanner;
public class Swap {
	int a, b, temp;
	int display() {
		System.out.println("Enter two numbers");
		Scanner input = new Scanner(System.in);
		a=input.nextInt();
		b=input.nextInt();
		System.out.println("Before Swiping "+ a+" "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swiping "+ a+" "+b);
		return temp;
	}
	public static void main(String[] args) {
		Swap obj = new Swap();
		obj.display();
	}
}
