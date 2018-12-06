package test3;

import java.util.Scanner;

public class Abc {
	public static void main(String[] args){
		Scanner b=new Scanner(System.in);
		int []a=new int[5];
		for(int i=0;i<5;i++) {
			a[i]=b.nextInt();
		}
		b.close();
		
		for(int i=0;i<a.length;i++) {
			int min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
		  if(a[min]!=a[i]&&min!=i){
			 int temp=a[min] ;
			 a[min]=a[i];
			 a[i]=temp;
		  }
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
	
	   }
		
	}	
}
