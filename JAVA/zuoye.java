package test5;

import java.util.Scanner;

public class zuoye3 {

	public static void main(String[] args) {
		
		System.out.println("Please enter h,w:");
		Scanner a=new Scanner(System.in);
		float h=a.nextFloat();
		int w=a.nextInt();
		float t=w/(h*h);
		a.close();
		if(t<18) {
			System.out.println("Lower weight!");
		}
		else if(t>=18 && t<25) {
			System.out.println("Standard weight!");
		}
		else if(t>=25 && t<27) {
			System.out.println("Higher weight!");
		}
		else {
			System.out.println("Too fat!");
		}
	}
}
