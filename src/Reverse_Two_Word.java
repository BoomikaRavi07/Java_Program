import java.util.Scanner;

public class Reverse_Two_Word {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str=s.nextLine();
		String[] words=str.split(" ");
		System.out.println(words[1]+" "+words[0]);

	}

}
