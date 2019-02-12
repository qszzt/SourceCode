package test5;

import java.util.Scanner;

public class zuoye1 {

	public static void main(String[] args) {
		
		System.out.println("Please enter a integer:");
		Scanner a=new Scanner(System.in);
		int num=a.nextInt();
		int n=0;
		while(num!=0) {
			n=n*10+num%10;
			num/=10;
		}
		System.out.println(n);
		a.close();
    }

}
