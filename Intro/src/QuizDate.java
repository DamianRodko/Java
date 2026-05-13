import java.util.Date;
import java.util.Scanner;
public class QuizDate
{
    public static void main(String []args)
    {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter your birth month:");
            int birthMonth = in.nextInt() - 1;
            System.out.println("Enter your birth day:");
            int birthDay = in.nextInt();
            System.out.println("Enter your birth year:");
            int birthYear = in.nextInt() - 1900;
            Date myBirthday = new Date(birthYear, birthMonth, birthDay);
            System.out.println("You entered your birthday as: " + myBirthday);
            
            System.out.println("Enter month of quiz: ");
            int quizMonth = in.nextInt() - 1;
            System.out.println("Enter day of quiz: ");
            int quizDay = in.nextInt();
            System.out.println("Enter year of quiz: ");
            int quizYear = in.nextInt() - 1900;
            System.out.println("Enter hour of quiz: ");
            int quizHour = in.nextInt();
            System.out.println("Enter minutes of quiz: ");
            int quizMinutes = in.nextInt();
            Date nextQuiz = new Date(quizYear, quizMonth, quizDay, quizHour, quizMinutes);
            System.out.println("The next quiz will be on: " + nextQuiz);
        }
    }
}