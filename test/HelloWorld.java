package test;

public class HelloWorld{
	public static void main(String[] args) {
		int[] arr=new int[20];
		int a=1;
		int b=1;
		int c;
		arr[0]=1;
		arr[1]=1;
		for(int i=2;i<20;i++) {
			c=a+b;
			arr[i]=c;
			a=b;b=c;
		}
		for(int i=19;i>=0;i--) {
		System.out.println(arr[i]);
		}
	}
}

