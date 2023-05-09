import java.util.Scanner;

class BoilingWater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number greater than 212: ");
        int temperature = input.nextInt();

        if (temperature >= 212) {
            System.out.println("Water is boiling!");
        }
    }
}

class NumberComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        if (num1 == num2) {
            System.out.println("Numbers are the same");
        }
        else if (num1 > num2) {
            System.out.println("The first number was larger than the second");
        }
        else {
            System.out.println("The second number was larger than the first");
        }
    }
}

class TestScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your test score (between 0 and 100): ");
        int score = input.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("Your grade is an A.");
        }
        else if (score >= 80 && score < 90) {
            System.out.println("Your grade is a B.");
        }
        else if (score >= 70 && score < 80) {
            System.out.println("Your grade is a C.");
        }
        else if (score >= 60 && score < 70) {
            System.out.println("Your grade is a D.");
        }
        else {
            System.out.println("Your grade is an F.");
        }
    }
}

 class SameOrNah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String word1 = input.nextLine();

        System.out.print("Enter the second word: ");
        String word2 = input.nextLine();

        if (word1.equals(word2)) {
            System.out.println("The words are the same.");
        }
        else {
            System.out.println("The words are different.");
        }
    }
}
