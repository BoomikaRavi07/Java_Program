import java.util.Scanner;

public class Sum_Avg_Prg {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n,sum=1;
		double avg=1;
		n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) 
			arr[i]=s.nextInt();
		for(int i=1;i<n;i++) {
			sum=sum+arr[i];
			avg =(double) sum/n;
		}
		System.out.println("Sum="+sum);
		System.out.println("Average="+avg);
}

}
