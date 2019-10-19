import java.util.Scanner;
import java.security.SecureRandom;

public class wise_p1 {

        public static void main(String[] args) {
            SecureRandom random = new SecureRandom();
            Scanner scnr = new Scanner(System.in);

            int random_response;
            int i;
            int correct = 0;
            int incorrect = 0;
            int difficulty;
            double value = .0;
            double studentResponse = .0;
            final double THRESHOLD = .01;
            int num1 = 0;
            int num2 = 0;
            int problemType;
            int randProblem;
            int random_num;
            char choice;

            System.out.print("\n----------------------------------\n");
            System.out.print("WELCOME TO ELEMENTARY MATH WIZARD\n");
            System.out.print("----------------------------------\n");

            while (true) {

                System.out.print("\nEnter a diffuculty level\n(1 = 1 digit, 2 = 2 digit, 3 = 3 digit, 4 = 4 digit)\n");
                difficulty = scnr.nextInt();

                System.out.println("\nWhat type of arithmetic problem?\n(1 = Addition, 2 = Multiplication, 3 = Subtraction, 4 = Division, 5 = Random mixture of all these types)");
                problemType = scnr.nextInt();

                for (i = 0; i < 10; i++) {

                    if (difficulty == 1) {
                        num1 = 1 + random.nextInt(9);
                        num2 = 1 + random.nextInt(9);
                    } else if (difficulty == 2) {
                        num1 = 10 + random.nextInt(99);
                        num2 = 10 + random.nextInt(99);
                    } else if (difficulty == 3) {
                        num1 = 100 + random.nextInt(999);
                        num2 = 100 + random.nextInt(999);
                    } else if (difficulty == 4) {
                        num1 = 1000 + random.nextInt(9999);
                        num2 = 1000 + random.nextInt(9999);
                    }

                    random_response = 1 + random.nextInt(4);
                    random_num = 1 + random.nextInt(4);

                    randProblem = mathQuestion(num1, num2, problemType, random_num);

                    if (problemType == 1) {
                        value = (float) num1 + num2;
                    } else if (problemType == 2) {
                        value = (float) num1 * num2;
                    } else if (problemType == 3) {
                        value = (float) num1 - num2;
                    } else if (problemType == 4) {
                        value = (num1 * .1) / (num2 * .1);
                    } else if (problemType == 5) {

                        if (randProblem == 1) {
                            value = (float) num1 + num2;
                        } else if (randProblem == 2) {
                            value = (float) num1 * num2;
                        } else if (randProblem == 3) {
                            value = (float) num1 - num2;
                        } else if (randProblem == 4) {
                            value = (num1 * .1) / (num2 * .1);
                        }
                    }

                    studentResponse = scnr.nextDouble();

                    switch (random_response) {
                        case 1:
                            if (Math.abs(value - studentResponse) < THRESHOLD) {
                                System.out.println("\nVery good!");
                                correct++;
                            } else {
                                System.out.println("\nNo. Please ty again.");
                                incorrect++;
                            }
                            break;
                        case 2:
                            if (Math.abs(value - studentResponse) < THRESHOLD) {
                                System.out.println("\nExcellent!");
                                correct++;
                            } else {
                                System.out.println("\nWrong. Try once more.");
                                incorrect++;
                            }
                            break;
                        case 3:
                            if (Math.abs(value - studentResponse) < THRESHOLD) {
                                System.out.println("\nNice work!");
                                correct++;

                            } else {
                                System.out.println("\nDon’t give up!");
                                incorrect++;
                            }
                            break;
                        case 4:
                            if (Math.abs(value - studentResponse) < THRESHOLD) {
                                System.out.println("\nKeep up the good work!");
                                correct++;

                            } else {
                                System.out.println("\nNo. Keep trying.");
                                incorrect++;
                            }
                            break;
                    }

                }

                System.out.printf("\ncorrect: %d\n", correct);
                System.out.printf("incorrect: %d\n\n", incorrect);

                if (correct > 7) {
                    System.out.println("Congratulations, you are ready to go to the next level!");
                } else {
                    System.out.println("Please ask your teacher for extra help.");
                }

                System.out.println("\nWould you like to advance to another session? (y/n): ");

                choice = scnr.next().charAt(0);

                if (choice == 'y') {
                    continue;
                } else if (choice == 'n') {
                    System.out.println("\nGoodbye! Thank you for playing.");
                    break;
                }
            }

        }


        public static int mathQuestion(int num1, int num2, int problemType, int random_num) {

            if (problemType== 1) {
                System.out.printf("\nHow much is %d + %d?: ", num1, num2);
                return 1;
            } else if (problemType == 2) {
                System.out.printf("\nHow much is %d x %d?: ", num1, num2);
                return 2;
            } else if (problemType == 3) {
                System.out.printf("\nHow much is %d - %d?: ", num1, num2);
                return 3;
            } else if (problemType == 4) {
                System.out.printf("\nHow much is %d / %d?: ", num1, num2);
                return 4;
            }
            else if (problemType == 5) {
                if (random_num == 1) {
                    System.out.printf("\nHow much is %d + %d?: ", num1, num2);
                    return 1;
                } else if (random_num == 2) {
                    System.out.printf("\nHow much is %d x %d?: ", num1, num2);
                    return 2;
                } else if (random_num == 3) {
                    System.out.printf("\nHow much is %d - %d?: ", num1, num2);
                    return 3;
                } else if (random_num == 4) {
                    System.out.printf("\nHow much is %d / %d?: ", num1, num2);
                    return 4;
                }

            }

            return problemType;

        }

}
