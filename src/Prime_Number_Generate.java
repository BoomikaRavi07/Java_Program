import java.util.Scanner;

public class Prime_Number_Generate {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n,count;
        System.out.print("Enter the Number: ");
        n=s.nextInt();
        for(int i=2;i<=n;i++) {
        	count=0;
        	for(int j=2;j<i;j++) {
        		if(i%j==0)
        			count++;
        			break;
        	}
        }
        if(count==0)
        	System.out.print(i);
        }
	}
}

