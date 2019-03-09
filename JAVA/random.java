package test2;
import java.util.Scanner;
public class hello {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num=(int) (Math.random()*100+1);
		for(;;)
		{
		  int a=sc.nextInt();
		  if(a>num)
		  {
			 System.out.println(0+"-"+a);
		  }
		  else if(a<num)
		  {
			 System.out.println(a+"-"+100);
		  }
		  else
		  {
		     System.out.println(a);
		  }
		}
	}
}
