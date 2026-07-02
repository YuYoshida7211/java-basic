import calculatePractice.CalculatePractice;
import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    //【課題1】引数の数に合わせて動きを変えるメソッド
      CalculatePractice calc = new CalculatePractice();
      System.out.println("Square of 5: " + calc.calculate(5));
      System.out.println("Product of 5 and 3: " + calc.calculate(5, 3));

      //文字列操作
      Scanner scanner = new Scanner(System.in);
      System.out.print("英語を入力してください: ");
      String input = scanner.nextLine();
      String result = input.toUpperCase();
      System.out.println(result);
      scanner.close();
  }
}