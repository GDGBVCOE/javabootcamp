import java.util.Scanner;

public class ToCheckWheatherANumberIsArmstrongNumberOrNot {

	public static void main(String Args []){
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the Number");
		int number,num1,num2,num3,temp;
		number=scanner.nextInt();
		temp=number;
		num1=number%10;
		number=number/10;
		num2=number%10;
		number=number/10;
		num3=number%10;
		if(Math.pow(num1, 3)+Math.pow(num2, 3)+Math.pow(num3, 3)==temp){
			System.out.println("Number is Armstrong Number");
		}
		else
			System.out.println("Number is Not Armstrong Number ");
		scanner.close();
	}
	
}
