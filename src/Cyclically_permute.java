import java.util.Arrays;
import java.util.Scanner;

public class Cyclically_permute {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
          int n;
	      System.out.println("Enter the number of elements ");
	      n=sc.nextInt();     
	      int arr[]=new int[n];
	      System.out.println("Enter the elements of the array ");
	      for(int i=0; i<n ;i++)
	      arr[i]=sc.nextInt();
	      System.out.println("The initial Array is "+Arrays.toString(arr));
	      int x = arr[0];
	      int i;
	        for (i = 0; i < arr.length - 1; i++) { 
	            arr[i] = arr[i + 1]; 
	        } 
		 arr[i] = x; 
	      System.out.println("The array after permutation is " +Arrays.toString(arr)); 
	}

}
