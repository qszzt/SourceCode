package test1;

public class helloworld {
	    public static void main(String[] args){
			int c;    
	      for(int i=1;i<10;i++)
	      {
	    	  for(int j=1;j<i+1;j++)
	    	  {
	    		  c=i*j;
	    		  System.out.printf("%2d*%d=%d",j,i,c); 
	    	  }
	    	  
	    	  System.out.println();
	      }
	      int d;    
	      for(int i=9;i>0;i--)
	      {
	    	  for(int j=1;j<i+1;j++)
	    	  {
	    		  d=i*j;
	    		  System.out.print(j+"*"+i+"="+d+"\t"); 
	    	  }
	    	  
	    	  System.out.println();
	      }    
	  } 
}
