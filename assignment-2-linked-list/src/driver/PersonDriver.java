package src.driver;

import java.util.InputMismatchException;
import java.util.Scanner;
import src.collection.*;

public class PersonDriver {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Classroom list = new Classroom();
		
		while (true){
			System.out.print("Name: ");
			String name = scan.next();
			
			int age = validateAgeInput(scan);

			list = list.addStudent(name, age);
			
			System.out.print("Exit? enter -1 for yes: ");
			String inputBreaker = scan.next();

			if (inputBreaker.equals("-1")) {
				break;
			}
		}
		list.printStudentList();
	}
	
	/**
	 * Validates the age input is an int without
	 * 		exiting the program. It needs to be
	 * 		a positive number
	 * @param scan
	 * 		Scanner class
	 * @return a validated age input
	 */
	private static int validateAgeInput(Scanner scan) {
		while(true)	{
			try {
				System.out.print("Age: ");
				int age = scan.nextInt();
				if (age < 0) {
					System.out.println("Age must be a positive number");
					scan.nextLine();
				} else {
					return age;
				}
			} catch (InputMismatchException e) {
				System.out.println("Age must be a number");
				scan.nextLine();
			}
		}
	}
}
