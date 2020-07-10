import java.lang.Math;
import java.util.Scanner;
public class Mod1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int number, numcopy, n, i= 0, rem = 0;
		number = read.nextInt();
		numcopy = number;
		n = read.nextInt();
		while(i<n) {
			rem = number%10;
			number = number/10;
			i++;
			
		}
		System.out.println(rem);
		read.close();
	}

}
