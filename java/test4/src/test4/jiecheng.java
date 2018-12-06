package test4;

import java.util.Scanner;

public class jiecheng {
	public static void main(String[] args){
		Scanner a=new Scanner(System.in);
		System.out.println(cheng(a.nextInt()));
		a.close();
	}
	public static int cheng(int i) {
		if(i<1)
			return 1;
		return i*cheng(i-1);
	}
}
