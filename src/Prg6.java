import java.util.Scanner;

public class Prg6 {

	public static void main(String[] args) {
		int n;
		Scanner s =new Scanner(System.in);
		System.out.print("Enther the number:");
		n=s.nextInt();
		for (int i=1;i<=n; i++) {
			for (int j=1;j<=2 * (n - i); j++) {
				System.out.print(" ");
			}
			for (int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
            for (int k=2;k<=i;k++) {
				System.out.print(k+" ");
            }
			System.out.println();
		}
	}

}