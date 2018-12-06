package test1;

import java.util.Scanner;

public class Zuoye {
	public static void main(String[] args){
		Scanner a=new Scanner(System.in);
		int num=a.nextInt();
		a.close();
		int count=0;
	    while(num>0) {
		num=num/10;
		count++;
	    }
		 System.out.println(count);
   }
}
