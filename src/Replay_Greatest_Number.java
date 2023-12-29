import java.util.Scanner;

public class Replay_Greatest_Number {
	static void replaceElement(int arr[],int n) {
	     int temp,max;
	     max = arr[n-1];
	        arr[n-1] = -1;
	        for(int i=n-2;i>=0;i--){
	            temp = arr[i];
	            arr[i]=max;
	            if(max<temp)
	                max= temp;
	        }
	       arr[n-1]=0; 
	}
	static void printArray(int arr[],int n) {
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
	       
	       public static void main(String[] args) {
	  		 Scanner s=new Scanner(System.in);
	  		 System.out.println("Enter the size of Array:");
	  		 int n=s.nextInt();
	  		 int arr[]=new int[n];
	  		 System.out.println("Enter all the  elements:");
	  	     for(int i=0;i<n;i++)  
	        	 arr[i]=s.nextInt();
	  	     replaceElement(arr,n);
	  	     printArray(arr,n);
	}
}
