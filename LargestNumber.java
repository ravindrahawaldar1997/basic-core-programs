package com.bridgelaz.basiccoreprograms;

public class LargestNumber {
void show() {
	int a=70, b=50, c=60;
	if(a>b && a>c) {
		System.out.println("Largest number " +a);
	}
	else if(b>a && b>c) {
		System.out.println("Largest number " +b);
	}
	else {
		System.out.println("Largest number " +c);
	}
}   
	public static void main(String[] args) {
	LargestNumber largest = new LargestNumber();
	largest.show();
	}
}
