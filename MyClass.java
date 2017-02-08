
public class MyClass {

	int noOfLegs;
	float height;
	boolean walks = true;
	float weight;
	char gender;

	boolean doesWalk(){
		return this.walks;
	}


	public static void main(String[] args){
		MyClass dikki = new MyClass();
		System.out.println(dikki.doesWalk());
		dikki.walks = false;
		System.out.println(dikki.walks);
	}
}
