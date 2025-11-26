import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final String fixedName = "Carmen";
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String username = scanner.nextLine();
		
		if (username != fixedName) {
		    System.out.println(fixedName + " does not equal " + username);
		}
	}
}
