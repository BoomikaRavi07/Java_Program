import java.util.Scanner;

public class IndexProgram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		System.out.print("Enter the number of elements:");   
        n=s.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the Array of elements:");
        for(int i=0;i<n;i++) 
       	 arr[i]=s.nextInt();
        System.out.print("Enter the element you want to find:");
	     int k=s.nextInt();
	     for(int i=0;i<n;i++)
	    	 if(arr[i]==k) 
	    		 System.out.print("Position:" +i);

	}

}
