import java.util.Scanner;

public class Calculator {

	public static void main(String Args []){
		int choice,num1,num2;
		float answer;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Choice ");
		System.out.println("Press 1 For Addition");
		System.out.println("Press 2 For Subtion");
		System.out.println("Press 3 For Multiplication");
		System.out.println("Press 4 For Division");
		choice = scanner.nextInt();
		System.out.println("Enter the two Numbers to Perform The Operation");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		if(choice==1){
			answer=num1+num2;		
		}
		else if(choice==2){
			answer=num1-num2;
		}
		else if(choice==3){
			answer=num1*num2;
		}
		else{
			answer=(float)num1/num2;
		}
		
	System.out.println("Answer is "+answer);	
		scanner.close();
		
	}
}
