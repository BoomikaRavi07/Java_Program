import java.util.Scanner;

public class Prg5 {

	public static void main(String[] args) {
		int n,ascii;
		Scanner s =new Scanner(System.in);
		System.out.print("Enther the number:");
		n=s.nextInt();
		for(int i=1;i<=n;i++) {
			ascii=97;
		
			for(int space=1;space<i;space++)
			{
			   System.out.print(" ");  
		}
            for(int j=n;j>=i;j--)
            {
            	System.out.printf("%c ",ascii);
            	ascii++;
            }
            
            System.out.println();
	}

	}
}