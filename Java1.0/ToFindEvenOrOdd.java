import java.util.Scanner;


public class ToFindEvenOrOdd {

	public static void main(String Args []){
		int number;
		Scanner scanner =new Scanner (System.in);
		System.out.println("Enter the Number");
		number=scanner.nextInt();	
		if(number%2==0){
			System.out.println("Number is even");
		}
		else{
			System.out.println("Number is odd");
		}
		scanner.close();
	}
}
