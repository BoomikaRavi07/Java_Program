import java.util.Scanner;

public class Neon_Number {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
        int n,sum=0,square,digits;
        System.out.print("Enter the Number: ");
        n=s.nextInt();
        square=n*n;
        while(square!=0) {
           digits=square%10;
           sum=sum+digits;
           square=square/10;
        }
       if(n==0)
    	   System.out.print("It is a Neon number");
       else
    	   System.out.print("It is not a Neon number");
	}

}
