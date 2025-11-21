class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}

public class StudentGrade {
    public static void main(String[] args) {
        try {
            int marks = 105;
            if (marks > 100) {
                throw new InvalidGradeException("Invalid grade! Marks cannot exceed 100.");
            }
            System.out.println("Marks entered: " + marks);
        } catch (InvalidGradeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
