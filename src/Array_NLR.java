import java.util.Scanner;

public class Array_NLR {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int N=s.nextInt();
        s.useDelimiter("[\\s]+");
        int L = s.nextInt();
		int R= s.nextInt();
		if(N>=L && N<=R)
			System.out.println("YES");
		else
			System.out.println("NO");
		}
	}
