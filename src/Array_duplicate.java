import java.util.Scanner;

public class Array_duplicate{  
    public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }    
        int j = 0;//for next element  
        for (int i=0; i < n-1; i++){  
            if (arr[i] != arr[i+1]){  
                arr[j++] = arr[i];  
            }  
        }  
        arr[j++] = arr[n-1];  
        return j;  
    }  
       
    public static void main (String[] args) { 
    	Scanner s = new Scanner (System.in);
    	System.out.print("Enter the size array: ");
        int n=s.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the array elements: ");                                              //int temp[]=new int[n];//store unique elements
        for(int i=0;i<n;i++)                                                                           //System.out.println("Read Array Elemnts From user : ");
        	arr[i]=s.nextInt(); 
        int length = arr.length;  
        length = removeDuplicateElements(arr, length);  
        //printing array elements  
        System.out.println("Array after removing duplicate is");
        for (int i=0; i<length; i++)  
           System.out.print(arr[i]+" ");  
    }  
}