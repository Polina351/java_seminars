package Seminar_1;

public class Task2 {
  public static void main(String[] args) {
    int end = 1000;
    for (int i = 2; i < end; i++) {
      boolean isPrime = true;
      for (int j = 2; j < i; j++) {
        if(i % j == 0){
          isPrime = false;
          break;
        }
      }
      if(isPrime) {
        System.out.printf("%d ", i);
      }
    }
  }
}
