
public class Demo {
	static int a;
	static boolean b;
	
	public static void main(String args[]) {
		System.out.println("Default value of int = "+a);
		System.out.println("Default value of boolean = "+b);
		
		System.out.println("My first java program");
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		int age = 10;
		if(age < 18) {
			System.out.println("You are below 18");
		}
		else {
			System.out.println("You are above 18");
		}
	}
}
