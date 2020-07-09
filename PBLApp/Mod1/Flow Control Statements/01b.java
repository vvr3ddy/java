import java.util.Scanner;
public class Mod1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int a = read.nextInt();
	    int b = read.nextInt();
	    int rem = 0, rem1 = 0;
	    int count = 0;
	    while(count<1) {
        rem1 = a%10;
	    	rem = b%10;
	    	b = b/10;
        a = a/10;
	    	count++;
	    }
	    if(rem1 == rem)
	    	System.out.println("true");
	    else
	    	System.out.println("false");
	    read.close();
	}

}
