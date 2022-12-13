package Seminar_1;
import java.util.Scanner;
/**
Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
n! (произведение чисел от 1 до n)
 */
public class Task1 {
  public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
    System.out.print("Введите число N: ");
    int N = iScanner.nextInt();
    iScanner.close();
    System.out.printf("Сумма чисел от 1 до %d равна %d\n", N, triangularNumber(N));
    System.out.printf("Факториал числа %d равен %d", N, factorial(N));
  }
  public static int triangularNumber(int N) {
    int res = 0;
    for (int i = 1; i <= N; i++) {
      res += i;
    }
    return res;
  }
  public static int factorial(int N) {
    int res = 1;
    for (int i = 1; i <= N; i++) {
      res *= i;
    }
    return res;
  }
}