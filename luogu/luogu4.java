package luogu;
import java.util.*;
public class luogu4 {
	public static void main(String args[]) throws Exception {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int c=sc.nextInt();
	    int d=sc.nextInt();
	    int x=c-a,y=d-b;
	    if(y<0){
            x--;
            y+=60;
        }
	    System.out.printf("%d %d",x,y);
	}

}
