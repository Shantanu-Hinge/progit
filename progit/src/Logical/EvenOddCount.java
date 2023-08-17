package Logical;

public class EvenOddCount {
       public static void main(String[] args) {
    	   int count=0;
    	   int count1=0;
    	   
    	   for(int i=0;i<=10;i++)
    	   {
    		   if(i%2==0) {
    			   count=count+1;
    		   }else {
    			   count1=count1+1;
    		   }
    		  
    	   }
    	   System.out.println("Total Even Number"+count);
		   System.out.println("Total Odd Number"+count1);
       }
}
