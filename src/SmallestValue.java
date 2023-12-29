import java.util.Scanner;

public class SmallestValue {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the elements:");   
        n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) 
     arr[i]=s.nextInt();
        int large=arr[0];int small=arr[0];
        for(int i=0;i<n;i++) {
    	    if (arr[i]<small) 
    	      small=arr[i];
    }
    	      System.out.println("Smallest = "+small);
    for(int i=0;i<n;i++) {
    	if (arr[i]>large) 
    	large=arr[i];
    }
    	 System.out.println("Largest ="+large);

}
}