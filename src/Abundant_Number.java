import java.util.Scanner;

public class Abundant_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n,sum=0;
		System.out.print("Enter the Number:");
		n=s.nextInt();
		for(int i=1;i<n;i++) {
			if(n%i==0)
				sum = sum + i;
		}
		if(sum>n) 
			System.out.println("It is Abundant number");
			else
				System.out.println("It is not a Abundant number");
	}
}
