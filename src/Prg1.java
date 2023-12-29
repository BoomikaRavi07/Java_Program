import java.util.Scanner;

public class Prg1 {

	public static void main(String[] args) {
		int n;
		Scanner s =new Scanner(System.in);
		System.out.print("Enther the number:");
		n=s.nextInt();
		
		for (int i=n;i>=1;i--)
		{
		for (int j=n;j>=i;j--)
		{
		System.out.print(j+" ");
		}

		System.out.println();
		}
		s.close();
		}
		}	

		