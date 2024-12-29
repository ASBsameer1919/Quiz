package d;
import java.util.Scanner;

public class Details {
    public void details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our quiz program!");



            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            System.out.print("Enter your gender: ");
            String gender = sc.nextLine();

            System.out.print("Enter your mail ID: ");
            String email = sc.nextLine();

            System.out.print("Enter your age: ");
            String age = sc.nextLine();

            System.out.println("\nQuiz Rules:\n" +
                    "1. 10 multiple-choice questions.\n" +
                    "2. 1 point for each correct answer, no negative marking.\n" +
                    "3. Two lifelines: Percentage Hint and 50-50 (usable once each).\n" +
                    "4. You can quit anytime (option 6).\n" +
                    "5. Answer all questions to complete the quiz.\n" +" "+
                    "  Enjoy the quiz!\n");





    }
}