import java.util.*;
public class Main {
    public static void main(String[] args) {
       	//swtich case//
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number for switch case");
		int n = sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("hello world!");
			break;
		case 2:
			System.out.println("there you are!");
			break;
		default:
			System.out.println("Invalid");
			break;

		}
		System.out.println();

    }
}