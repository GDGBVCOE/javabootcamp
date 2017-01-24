import java.util.Scanner;

public class ToSwapTwoVariables {

	public static void main(String Args []){
		int t1,t2;
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the First Number");
		t1=scanner.nextInt();
		System.out.println("Enter the Second Number");
		t2=scanner.nextInt();
		t1=t1+t2;
		t2=t1-t2;
		t1=t1-t2;
		System.out.println("Now first variable is :"+t1+" and Second Vriable is "+t2);
		scanner.close();
	}
	
	
}
