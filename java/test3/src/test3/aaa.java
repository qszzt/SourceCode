package test3;

import java.util.Scanner;

public class aaa {
	public static void main(String[] args){
		Scanner a=new Scanner(System.in);
        int num=a.nextInt();
        int sum=0;
        int x=num;
        a.close();
        while(x>0) {
        	x=x/10;
        	sum++;
        }
    	int []b=new int [sum];
    	for(int i=0;i<sum;i++) {
    		b[i]=num/100;
    	}
      for(int i=0;i<sum;i++) {
    	  System.out.print(b[i]);
      }
     
	}
}
