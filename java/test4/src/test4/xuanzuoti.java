package test4;
import java.util.Scanner;
public class xuanzuoti {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
	    int n=input.nextInt();
		for(int i=2;i<=n;i++) {
			boolean flag=true;
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.print(i+" ");
			}
		}
		
	}
}
