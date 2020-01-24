//Sum of Two Numbers in Java..
import java.util.Scanner;
public class Sum
{
	public static void main(String[] args) {
	    int a,b,sum=0;
	    System.out.println("enter the two numbers: A and B :");
	    Scanner sc = new Scanner(System.in);
	    a = sc.nextInt();
	    b = sc.nextInt();
	    sum = a+b;
	    System.out.println("sum is :"+sum);
	}
}
