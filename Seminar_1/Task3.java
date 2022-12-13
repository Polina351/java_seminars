package Seminar_1;
import java.util.Scanner;

/**
 Реализовать простой калькулятор
 */
public class Task3 {
  public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
    System.out.print("Введите операнд 1: ");
    int num1 = iScanner.nextInt();
    System.out.print("Введите оператор: ");
    String operation = iScanner.next();
    System.out.print("Введите операнд 2: ");
    int num2 = iScanner.nextInt();
    iScanner.close();

    switch (operation) {
      case "+":
        int sumRes = sum(num1, num2);
        System.out.printf("%d + %d = %d\n", num1, num2, sumRes);
        break;
      case "-":
        int minusRes = minus(num1, num2);
        System.out.printf("%d - %d = %d\n", num1, num2, minusRes);
        break;
      case "*":
        int productRes = product(num1, num2);
        System.out.printf("%d * %d = %d\n", num1, num2, productRes);
        break;
      case "/":
        int quotientRes = quotient(num1, num2);
        System.out.printf("%d / %d = %d\n", num1, num2, quotientRes);
        break;
    
      default:
        System.out.println("Неопознанная операция");
        break;
    }
  }
  
  public static int sum(int num1, int num2) {
    int res = num1 + num2;
    return res;
  }
  
  public static int minus(int num1, int num2) {
    int res = num1 - num2;
    return res;
  }

  public static int product(int num1, int num2) {
    int res = num1 * num2;
    return res;
  }

  public static int quotient(int num1, int num2) {
    var res = num1 / num2;
    return res;
  }
}
