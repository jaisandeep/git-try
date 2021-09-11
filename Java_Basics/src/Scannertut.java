import java.util.Scanner;

public class Scannertut {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What's your first name?");
		String name = scan.next();
		
		
		System.out.println("your Age?");
		int age = scan.nextInt();
		
		System.out.println("whats your junior wish?");
		String quote = scan.next();
		quote += scan.nextLine();
		
		System.out.println("Thank you" + name + ", your are" + age + "year's old");
		System.out.println("and your junior wish	 is "+quote);
		

	}

}
