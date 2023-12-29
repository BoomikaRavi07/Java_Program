import java.util.Scanner;

public class Array_Left {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
        int n;
        System.out.print("Enter the elements:");
        n=s.nextInt();
        int arr[]=new int[n];
		segregate0and1(arr, n);
        for(int i = 0 ; i < n; i++)
        	arr[i]=s.nextInt();	
        {
			System.out.print(arr[i]+" ");
        }
    }
    static void segregate0and1(int array[], int size)
    {
        int left = 0, right = size-1;
    	while (left < right)
    	{
            while (array[left] == 0 && left < right)
            left++;
            while (array[right] == 1 && left < right)
            right--;
            if (left < right)
            {
                array[left] = 0;
                array[right] = 1;
                left++;
                right--;
            }
        }
    }
}
