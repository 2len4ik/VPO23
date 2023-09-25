import java.util.Scanner;

public class Name {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;

        System.out.println("Hello");
        System.out.println("як тебе звати");
        name = scanner.nextLine();
        System.out.println("скільки років?");
        age = scanner.nextInt();
        System.out.println("дуже приємно," + name );
        System.out.println("я знаю тепер, що тобі" + age + " років ");
    }
}