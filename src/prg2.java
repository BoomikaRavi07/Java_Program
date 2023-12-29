import java.util.Scanner;

public class prg2 {

	public static void main(String[] args) {
		int n;
		Scanner s =new Scanner(System.in);
		System.out.print("Enther the number:");
		n=s.nextInt();
		for(int i=1;i<=n;i++){
			//Loop to iterate over each column
			int counter = i;
			for(int j=1;j<=i;j++){
				System.out.print(counter+ " ");
				counter = counter+n-j; 
			}
			System.out.println();
		}
	}
}