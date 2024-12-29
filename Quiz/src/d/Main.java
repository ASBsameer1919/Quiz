package d;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Details d = new Details();
       d.details();


       int score = 0;
       String[] questions = {
               "Who is Virat Kohli?",
               "Which IPL team does Virat Kohli represent?",
               "What is Virat Kohli's nickname?",
               "What role does Virat Kohli play in cricket?",
               "Which year did Virat Kohli make his international debut?",
               "How many centuries has Virat Kohli scored in international cricket as of 2023?",
               "Which format did Virat Kohli captain India the longest?",
               "Virat Kohli's highest ODI score is?",
               "Which award has Virat Kohli received for his contribution to cricket?",
               "Which is Virat Kohli's favourite opponent team in international cricket?"
       };

       String[][] options = {
               {"1. GOAT", "2. KING", "3. BOTH", "4. LEGEND"},
               {"1. Mumbai Indians", "2. Royal Challengers Bangalore", "3. Chennai Super Kings", "4. Delhi Capitals"},
               {"1. Chiku", "2. VK", "3. Both", "4. Kohli"},
               {"1. Bowler", "2. Batsman", "3. All-rounder", "4. Wicketkeeper"},
               {"1. 2008", "2. 2009", "3. 2010", "4. 2011"},
               {"1. 71", "2. 74", "3. 76", "4. 78"},
               {"1. Test", "2. ODI", "3. T20I", "4. All formats"},
               {"1. 183", "2. 185", "3. 180", "4. 170"},
               {"1. Arjuna Award", "2. Padma Shri", "3. Both", "4. Padma Bhushan"},
               {"1. Australia", "2. Pakistan", "3. Both", "4. New Zealand"}
       };

       int[] correctAnswers = {4, 2, 3, 2, 1, 3, 1, 1, 3, 3};
       boolean percentageUsed = false, fiftyFiftyUsed = false;
       System.out.print("Shall we start your Quiz: ");


       String O = sc.nextLine();
try{
       if (O.equalsIgnoreCase("yes")) {



       for (int i = 0; i < questions.length; i++) {
           boolean answered = false;
           while (!answered) {
               try {
                   System.out.println(questions[i]);
                   for (String option : options[i]) System.out.println(option);

                   System.out.println("5. Use Life Line");
                   System.out.println("6. Quit");
                   System.out.print("Enter your answer (1/2/3/4/5/6): ");

                   int userAnswer = sc.nextInt();

                   if (userAnswer == 6) {
                       System.out.println("You quit the game.");
                       i = questions.length;
                       break;
                   }
                   if (userAnswer == 5) {
                       if (percentageUsed && fiftyFiftyUsed) {
                           System.out.println("You have already used both lifelines.");
                       } else {
                           System.out.println("Choose your lifeline:");
                           if (!percentageUsed) {
                               System.out.println("Enter P for Percentage Hint");
                               System.out.println("Percentage Hint");
                           }
                           if (!fiftyFiftyUsed) {
                               System.out.println("Enter F for 50-50");
                               System.out.println("50-50");
                           }
                           char lifeLineChoice = sc.next().charAt(0);

                           if (lifeLineChoice == 'P' && !percentageUsed) {
                               System.out.println("Percentage Hint:");
                               for (int j = 0; j < 4; j++) {
                                   if (j + 1 == correctAnswers[i]) {
                                       System.out.println(options[i][j] + " - 75%");
                                   } else {
                                       System.out.println(options[i][j] + " - 8%");
                                   }
                               }
                               percentageUsed = true;
                           } else if (lifeLineChoice == 'F' && !fiftyFiftyUsed) {
                               fiftyFiftyUsed = true;
                               System.out.println("50-50 Option:");
                               System.out.println(options[i][correctAnswers[i] - 1]);
                               for (int j = 0; j < 4; j++) {
                                   if (j + 1 != correctAnswers[i]) {
                                       System.out.println(options[i][j]);
                                       break;
                                   }
                               }
                           } else {
                               System.out.println("Invalid or already used lifeline.");
                           }
                       }
                       System.out.print("Enter your answer (1/2/3/4): ");
                       userAnswer = sc.nextInt(); // Allow the user to input their answer after using a lifeline
                   }

                   if (userAnswer == correctAnswers[i]) {
                       System.out.println("Correct! You got 1 mark.");
                       score++;
                       answered = true;
                   } else if (userAnswer >= 1 && userAnswer <= 4) {
                       System.out.println("Incorrect. The correct answer was: " + correctAnswers[i]);
                       System.out.println("You are exiting the quiz.");
                       i = questions.length;
                       break;
                   } else {
                       System.out.println("Invalid choice. Please try again.");
                   }
                   System.out.println();
               } catch (Exception e) {
                   System.out.println("Invalid input. Please enter a number between 1 and 6.");
                   sc.nextLine();
               }
           }
       }
       System.out.println("Quiz completed! Your total score is: " + score * 10 + "/" + questions.length * 10);
   }else{
           System.out.println();
           System.out.println("*******Thankyou for vivsting our Website*******");
       }
   }catch (Exception e){
   System.out.println(e);
   }
   }

}
