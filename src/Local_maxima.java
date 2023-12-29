import java.util.Scanner;

public class Local_maxima {
	
	public static void main(String[]args) {
		 Scanner s=new Scanner(System.in);
		 System.out.print("Enter the size of Array:");
		 int n=s.nextInt();
		 int arr[]=new int[n];
		 System.out.println("Enter all the  elements:");
	     for(int i=0;i<n;i++)  
       	 arr[i]=s.nextInt();
	     int min,mid,max;
         min = 0;
         max =n-1;
	       while(min<=max){
	             mid = (min + max)/2;
	             if((mid == 0 || arr[mid-1] < arr[mid]) 
	                 && (mid == arr.length-1 || arr[mid+1] < arr[mid])){
	                 
	             }
	             else if(mid > 0 && arr[mid-1] > arr[mid]){
	            	 max = mid-1;
	            	 break;
	             }
	             else{
	            	 min = mid+1;
	             }
	             
	       System.out.println("The local maxima is " + max); 
	}
	}
}