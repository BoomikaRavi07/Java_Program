import java.util.Scanner;

public class Rotate_Array {

	static void rotateArray(int arr[],int n,int rot) {
		for(int r=0;r<rot;r++) {
			int x = arr[0];
			for(int i=1;i<n;i++) {
				arr[i-1]=arr[i];
			}
			arr[n-1]=x;
		}
	}
	static void printArray(int arr[],int n) {
		for(int i=0;i<n;i++) 
        System.out.print(arr[i]+" ");
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = s.nextInt();
		int arr[]=new int[n];
        System.out.print("Enter the array elements one by one: ");
        for(int i=0;i<n;i++) 
        	arr[i]=s.nextInt();
        System.out.println("Enter the number of rotation: ");
        for(int i=0;i<n;i++)  
       	 arr[i]=s.nextInt();
       
 	     rotateArray(arr,n,rot);
 	     printArray(arr,n);
        s.close();
	}
}