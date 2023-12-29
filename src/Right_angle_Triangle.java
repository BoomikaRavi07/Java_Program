import java.util.Scanner;

public class Right_angle_Triangle {
	public static void main(String[]args) {
	Scanner s = new Scanner (System.in);
	s.useDelimiter("\\s");
	System.out.print("Enter the numbers: ");
    int a=s.nextInt();
    int b=s.nextInt();
    int c=s.nextInt();

    int A=a*a;
    int B=b*b;
    int C=c*c;
    int result=A+B;
    if(C==result)
    	 System.out.print("Yes");
    else
    	 System.out.print("No");
}

}