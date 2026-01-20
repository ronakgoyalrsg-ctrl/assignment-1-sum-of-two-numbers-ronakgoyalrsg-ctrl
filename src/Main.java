import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Read two integers
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        // TODO: Print their sum  using println
        System.out.println(sum);
      
        scanner.close();
    }
}
