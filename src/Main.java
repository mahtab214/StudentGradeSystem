import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        String grade = "";

        try {

            System.out.print("Enter Marks: ");
            int marks = input.nextInt();

            if (marks < 0 || marks > 100)
                throw new Exception("Invalid Marks");

            if (marks >= 80)
                grade = "A";
            else if (marks >= 70)
                grade = "B";
            else if (marks >= 60)
                grade = "C";
            else
                grade = "Fail";

            double percentage = (marks / 100.0) * 100;

            System.out.println("Percentage: " + percentage + "%");

            if (marks >= 50)
                System.out.println("Status: Pass");
            else
                System.out.println("Status: Fail");

            System.out.println("Student: " + name);
            System.out.println("Grade: " + grade);

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        input.close();
    }
}