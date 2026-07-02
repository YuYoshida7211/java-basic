import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("文字列を入力してください: ");
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        String reversed = sb.append(input).reverse().toString();
        System.out.println("逆順の文字列: " + reversed);
        scanner.close();
    }
}
