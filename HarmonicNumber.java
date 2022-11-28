package com.bridgelaz.basiccoreprograms;
import java.util.Scanner;
public class HarmonicNumber {					    //harmonic number
	void Display() {								//H1=1
		System.out.println("Enter a number");		//H2=H1+1/2
		Scanner in = new Scanner(System.in);	    //H3=H2+1/3
		int num=in.nextInt();						//Hn=Hn-1+1/n
		double result=0.0;	
		//double is used bcause harmonic function gives output in decimal
			for(int i=num; i>0; i--) {
				result=result + (double)1/i;
				System.out.print(result + " , ");
			}					
	}
	public static void main(String[] args) {
		HarmonicNumber a= new HarmonicNumber();
		a.Display();
	}
}
