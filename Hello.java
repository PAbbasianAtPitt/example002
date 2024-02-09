import java.util.*;

public class Hello{
	public static void main(String[] args){
		System.out.println("Hello world");
		Scanner scan = new Scanner(System.in);
		String name;
		System.out.print("What is your name? ");
		name = scan.nextLine();
		System.out.println("Hello " + name);
	}	
}
