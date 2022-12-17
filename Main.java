import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner obj = new Scanner(System.in);
	    
	    System.out.println("Enter the range: ");
	    
	    int n = obj.nextInt();
	    int arr[]=new int[n];
	    int i = 0;
	    
	    for (i = 0; i<arr.length;i++){
	        System.out.println(i);
	    }
	    
	    System.out.println("Enter number to be searched: ");
	    int num = obj.nextInt();
	    int j;
	    
	   for (j=0; j<=num;j++){
	       if(arr[j]==num)
	       break;
	       //System.out.println(j);
	   }
	   System.out.println(j);
	    
	}
}
