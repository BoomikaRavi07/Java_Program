import java.util.Scanner;

public class Array_YN {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		s.useDelimiter("[\\s+]");
		int N,K,count=0;
		System.out.print("Input: ");
	    N=s.nextInt();
		K=s.nextInt();
        int arr[]=new int[N];
        int length = arr.length; 
       
        for(int i=0; i<N; i++) {
			arr[i]= s.nextInt();
		}
		for(int i=0; i<N; i++) {
			if(arr[i]==K) {
				count++;
				System.out.println("Yes");
				break;
				//count++;
			}
			
		}
		if(count==0)
		System.out.println("no");
		s.close();
       
	}

}
