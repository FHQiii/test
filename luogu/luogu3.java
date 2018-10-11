package luogu;
import java.util.*;
public class luogu3 {
	public static void main(String args[]) throws Exception {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    float f=Float.parseFloat(a+"."+b);
	    System.out.println((int)(f/1.9));
	}
}
