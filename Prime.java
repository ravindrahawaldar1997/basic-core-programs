package com.bridgelaz.basiccoreprograms;
import java.util.Scanner;
public class Prime {
	int Display() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int primefactor=2;
		while(num>1) {
			if(num % primefactor==0) {
				System.out.println(primefactor + " ");
				num = num /primefactor;
			}else {
			primefactor++;	
			}
		}
		return primefactor;
	}
	public static void main(String[] args) {
		Prime primenumber= new Prime();
		primenumber.Display();
	}
}
