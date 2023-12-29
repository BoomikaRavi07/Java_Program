import java.util.Scanner;

public class Prg4 {

	public static void main(String[] args) {
		int n;
		Scanner s =new Scanner(System.in);
		System.out.print("Enther the number:");
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int space=1;space<i;space++)
			{
			   System.out.print(" ");  
		}
            for(int j=n;j>=i;j--)
            {
            	System.out.print("* ");
            }
            
            System.out.println();
	}
		for(int i=2;i<=n;i++)
		{
			for(int space=n;space>i;space--)
			{
			   System.out.print(" ");  
		}
            for(int j=1;j<=i;j++)
            {
            	System.out.print("* ");
            }
            System.out.println();
	}

}


	}



