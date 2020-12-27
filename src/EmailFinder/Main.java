package EmailFinder;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		FindingEmail emailFinder = new FindingEmail(6);
		
		emailFinder.addEmail("Bob@gmail.com");
		emailFinder.addEmail("Sally@gmail.com");
		emailFinder.addEmail("Petter@gmail.com");
		emailFinder.addEmail("John@gmail.com");
		emailFinder.addEmail("Pat@gmail.com");
		emailFinder.addEmail("Dev@gmail.com");
		
		System.out.println("Provide a email to search for: ");
		String searchFor = scanner.nextLine();
		
		System.out.println();
		System.out.println("Emails in the array:");
		System.out.println("--------------------");
		emailFinder.printEmails();
		System.out.println();
		
		boolean foundMatch = emailFinder.foundMatch(searchFor);
		if(foundMatch) {
			System.out.println(searchFor + " is indeed an email in the array\n");
		}
		else {
			System.out.println(searchFor + " is not an email in the array\n");
		}
		
	}

}
