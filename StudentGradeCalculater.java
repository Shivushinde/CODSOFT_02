import java.util.Scanner;
public class StudentGradeCalculater 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Student Grade Calculator");

        // Input: Take marks obtained (out of 100) in each subject.
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        int totalMarks = 0;

        // Calculate Total Marks: Sum up the marks obtained in all subjects.
        for (int i = 1; i <= numberOfSubjects; i++) 
        {
            System.out.print("Enter marks obtained in Subject " + i + " (out of 100): ");
            int subjectMarks = scanner.nextInt();
            
            // Validate input marks (assuming marks are between 0 and 100)
            if (subjectMarks < 0 || subjectMarks > 100) 
            {
                System.out.println("Invalid input! Marks should be between 0 and 100.");
                return;
            }

            totalMarks += subjectMarks;
        }

        // Calculate Average Percentage: Divide the total marks by the total number of subjects.
        double averagePercentage = (double) totalMarks / numberOfSubjects;


        // Grade Calculation: Assign grades based on the average percentage achieved.
        String grade = calculateGrade(averagePercentage);

        // Display Results: Show the total marks, average percentage, and the corresponding grade to the user.
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + String.format("%.2f", averagePercentage) + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    private static String calculateGrade(double averagePercentage)
     {
        if (averagePercentage >= 90) 
        {
            return "A";
        } 
        else if (averagePercentage >= 80) 
        {
            return "B";
        } 
        else if (averagePercentage >= 70) 
        {
            return "C";
        } 
        else if (averagePercentage >= 60) 
        {
            return "D";
        }
        else 
        {
            return "F";
        }
    }
}
