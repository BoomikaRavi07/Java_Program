import java.util.Scanner;

public class prg7 {

	public static void main(String[] args) {
		int n;
		Scanner s =new Scanner(System.in);
		System.out.print("Enther the number:");
		n=s.nextInt();
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for (int j=1;j<=n;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}