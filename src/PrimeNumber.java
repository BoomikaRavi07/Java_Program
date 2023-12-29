
public class PrimeNumber {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13};
		int n= arr.length;
		int count =0;
		
		for(int i=0;i<n;i++) {
			for(int j=1;j<=arr[i];j++)
			{
				if(arr[i]%j == 0)
					count++;
			}
			if(count == 2)
			System.out.print(arr[i]+",");
			count =0;
		}

	}

}
