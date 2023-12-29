import java.util.Scanner;

public class Xor_prg {

	public static void main(String[] args) {
		int n,x;
		Scanner s =new Scanner(System.in);
		n=s.nextInt();
		x=n%4;
		if(x==0)
			System.out.println(n);
		else if(x==1)
			System.out.print("1");
		else if(x==2)
			System.out.print("n+1");
		else if(x==3)
			System.out.print("0");
	}

}
