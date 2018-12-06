package test3;

import java.util.Scanner;

public class abcd {
	
	public static void main(String[] args){
		Scanner b=new Scanner(System.in);
		int []a=new int[5];
		for(int i=0;i<5;i++) {
			a[i]=b.nextInt();
		}
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
		}
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]);
		
		}
		
	}
}
