import java.util.Scanner;
public class Mod1 {

	public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    int a = read.nextInt();
    if(a>0){
      System.out.println("Number is positive");
    }
    else if(a<0){
      System.out.println("Number is negative");
    }
    else
      System.out.println("Number is zero");
  }

}
