import java.util.Scanner;
public class Mod1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		char a = read.next().charAt(0);
	    char b = read.next().charAt(0);
	    int a1 = (int) a;
	    int b1 = (int) b;
	    
	    if(a1 < b1)
	    	System.out.println(a+", "+b);
	    else
	    	System.out.println(b+", "+a);
	    read.close();
	}

}
