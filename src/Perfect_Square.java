import java.util.Scanner;

public class Perfect_Square {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.useDelimiter("[\\s]+");
        int N=s.nextInt();
        int M=s.nextInt();
        if(N==M)
        	System.out.println("YES");
        	else
        		System.out.println("NO");
	}

}
