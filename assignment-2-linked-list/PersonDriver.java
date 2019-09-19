import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonDriver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Classroom list = new Classroom();
		
		while (true){
			System.out.print("Name: ");
			String name = scan.next();
			
			int age = validateAgeInput(scan);

			list = list.addPerson(name, age);
			
			System.out.print("Exit? enter -1 for yes: ");
			String inputBreaker = scan.next();
			System.out.println(inputBreaker);

			if(inputBreaker.equals("-1")) {
				break;
			}
		}
		list.printList();
	}
	
	public static int validateAgeInput(Scanner scan) {
		while(true)	{
			try {
				System.out.print("Age: ");
				int age = scan.nextInt();
				return age;
			} catch(InputMismatchException e) {
				System.out.println("Age must be a number");
				scan.nextLine();
			}
		}
	}
}
