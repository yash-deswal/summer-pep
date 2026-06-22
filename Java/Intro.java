package Java;

public class Intro {
    public static void main(String[] args) {
        int age = 21;
        int num = 15;

        if (age > 18 && num > 10) {
            System.out.println("Test will be conducted");
        }
        if (age > 18 && num < 18) {
            System.out.println("Hello");
        } else {
            System.out.println("Test will not be conducted");
        }

        char grade = 'C';
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            default:
                System.out.println("Invalid");
        }

        int x = 10, y = 20;

        System.out.println(x > y ? x : y);
    }
}
