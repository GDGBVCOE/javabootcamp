import java.util.Scanner;
//Storing values without using array
public class ToFindAverageMarks {

	public static void main(String Args []){
		int s1,s2,s3,s4,s5,s6;
		float  average;
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the marks of the first Subjects");
		s1=scanner.nextInt();
		System.out.println("Enter the marks of the second Subjects");
		s2=scanner.nextInt();
		System.out.println("Enter the marks of the third Subjects");
		s3=scanner.nextInt();
		System.out.println("Enter the marks of the forth Subjects");
		s4=scanner.nextInt();
		System.out.println("Enter the marks of the fifth Subjects");
		s5=scanner.nextInt();
		System.out.println("Enter the marks of the six Subjects");
		s6=scanner.nextInt();
		average = (s1+s2+s3+s4+s5+s6)/6;
		System.out.println("Average marks if the six subjects is : " + average);
		scanner.close();
	}
	
	
}
