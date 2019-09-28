package data;
import java.util.Random;

public class Student extends Person {
    private char grade;
    private String studentNumber;
    private char[] gradesList = {'A', 'B', 'C', 'D'};
    public Student previous;

    /**
     * Default constructor
     */
    public Student() {
    }

    /**
	 * @param name
	 *     is the student's name.
	 * @param age
	 *     is the student's age.
	 */
	public Student(String name, int age) {
		super(name, age);
        generateGrade();
        generateStudentNumber();
    }
    
    /**
     * Sets a random letter grade to the student
     */
    private void generateGrade() {
        int randNum = randomIntGenerator(gradesList.length);
        this.grade = gradesList[randNum];
    }

    /**
     * Sets a random student number
     *     beginning with letter A
     */
   private void generateStudentNumber() {
    int randNum = randomIntGenerator(900);
    String studentNumber = "A" + Integer.toString(randNum);
    this.studentNumber = studentNumber;
   }


	/**
	 * 
	 * @return the previous person
	 */
	public Student getPrevious() {
		return previous;
	}
   
   private int randomIntGenerator(int length) {
       Random generator = new Random();
       int randomNumber=generator.nextInt(length);
       return randomNumber;
   }
    
   /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
       return "Student: [" + super.toString() + 
            ", grade: " + grade +
            ", student number: " + studentNumber +
            "]";
    }

    @Override
    public int calculateMonthlySpendings() {
        return randomIntGenerator(3);
    }
}